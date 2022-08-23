package com.susgain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.susgain.model.RedemptionItem;
import com.susgain.service.RedemptionItemService;

@RestController
@RequestMapping(value="/api/item")
public class RedemptionItemController {
	
	@Autowired
	RedemptionItemService redemptionItemService;
	
	@PostMapping("/add")
	public RedemptionItem addRedemptionItem(@RequestBody RedemptionItem redemptionItem) {
		return redemptionItemService.saveRedemptionItem(redemptionItem);
	}
	
	@GetMapping
    public List<RedemptionItem> getAllRedemptionItems(){
    	return redemptionItemService.getRedemptionItems();
    }
	
	@DeleteMapping("/delete/{id}") 
	public void deleteRedemptionItem(@PathVariable int id) {
		redemptionItemService.deleteRedemptionItemById(id);
	}
	 
	@PutMapping("/update")
	public RedemptionItem updateRedemptionItem(@RequestBody RedemptionItem redemptionItem) {
	  return redemptionItemService.updateRedemptionItem(redemptionItem);
	}

}
