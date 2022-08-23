package com.susgain.service;

import java.util.List;

import com.susgain.model.RedemptionItem;

public interface RedemptionItemService {
	
	public RedemptionItem saveRedemptionItem(RedemptionItem redemptionItem);
	public List<RedemptionItem> getRedemptionItems();
	public void deleteRedemptionItemById(Integer id);
	public RedemptionItem updateRedemptionItem(RedemptionItem redemptionItem);

}
