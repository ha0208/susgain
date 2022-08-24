package com.susgain.service;

import java.util.List;

import com.susgain.model.RedemptionItem;

public interface IRedemptionItemService {
	
	 RedemptionItem saveRedemptionItem(RedemptionItem redemptionItem);
	 List<RedemptionItem> getRedemptionItems();
	 void deleteRedemptionItemById(Integer id);
	 RedemptionItem updateRedemptionItem(RedemptionItem redemptionItem);

}
