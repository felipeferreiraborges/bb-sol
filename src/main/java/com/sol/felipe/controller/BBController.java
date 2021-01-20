package com.sol.felipe.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sol.felipe.model.BBModel;
import com.sol.felipe.model.Root;

@RestController
public class BBController {
		
	public List<BBModel> retrieveList() {
		List<BBModel> list = new ArrayList<>();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Root> rateResponse =
		        restTemplate.exchange("https://apisandbox.openbankproject.com/obp/v1.2.1/banks/rbs/accounts/savings-kids-john/public/transactions",
		                    HttpMethod.GET, null, new ParameterizedTypeReference<Root>() {
		            });
		for (int i = 0; i < rateResponse.getBody().getTransactions().size(); i++) {
			BBModel model = new BBModel();
			model.setId(rateResponse.getBody().getTransactions().get(i).getId());
			model.setAccountId(rateResponse.getBody().getTransactions().get(i).getThis_account().getId());
			model.setCounterPartyAccount(rateResponse.getBody().getTransactions().get(i).getOther_account().getNumber());
			model.setCounterpartyName(rateResponse.getBody().getTransactions().get(i).getOther_account().getHolder().getName());
			model.setCounterPartyLogoPath(rateResponse.getBody().getTransactions().get(i).getOther_account().getMetadata().getImage_URL());
			model.setInstructedAmount(rateResponse.getBody().getTransactions().get(i).getDetails().getValue().getAmount());
			model.setInnstructedCurrency(rateResponse.getBody().getTransactions().get(i).getDetails().getValue().getCurrency());
			model.setTransactionAmount(rateResponse.getBody().getTransactions().get(i).getDetails().getNew_balance().getAmount());
			model.setTransactionCurrency(rateResponse.getBody().getTransactions().get(i).getDetails().getNew_balance().getCurrency());
			model.setTransactionType(rateResponse.getBody().getTransactions().get(i).getDetails().getType());
			model.setDescription(rateResponse.getBody().getTransactions().get(i).getDetails().getDescription());
			list.add(model);
			model = null;
		}
		return list;
	}
	
	@GetMapping("/")
	public List<BBModel> getTransactionsList() {
		return retrieveList();
	}
	
	@GetMapping("/transactions/{type}")
	public List<BBModel> getTransactionsListByType(@PathVariable String type) {
		List<BBModel> fullList = retrieveList();
		
		  List<BBModel> lista = fullList.stream()
		 .filter(transaction -> transaction.getTransactionType().equals(type))
		 .collect(Collectors.toList());
		  return lista;
		
	}
	
	@GetMapping("/transactions/{type}/totalAmount")
	public Double getTotalAmountByType(@PathVariable String type) {
		List<BBModel> fullList = retrieveList();
		  double lista = fullList.stream()
		 .filter(transaction -> transaction.getTransactionType().equals(type))
		 .mapToDouble(transaction -> Double.parseDouble(transaction.getInstructedAmount()))
		 .sum();
		  return lista;
		
	}
}
