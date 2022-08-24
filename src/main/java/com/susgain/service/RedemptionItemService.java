package com.susgain.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.susgain.dao.RedemptionItemDao;
import com.susgain.mapper.RedemptionItemMapper;
import com.susgain.model.RedemptionItem;

@Service
public class RedemptionItemService implements IRedemptionItemService {
    
	@Autowired
	private RedemptionItemDao redemptionItemDao;
	
	@Autowired
	private RedemptionItemMapper mapper;
	
	@Override
	public RedemptionItem saveRedemptionItem(RedemptionItem redemptionItem) {
		
		com.susgain.entity.RedemptionItem entity = mapper.map(redemptionItem);
	    entity = redemptionItemDao.save(entity);
	    RedemptionItem model = mapper.map(entity);
	    return model;		
	}

	@Override
	public List<RedemptionItem> getRedemptionItems() {
		
		return mapper.mapEntities(redemptionItemDao.findAll()) ;
	}

	@Override
	public void deleteRedemptionItemById(Integer id) {
		
		redemptionItemDao.deleteById(id);
		
	}
	
	@Override
	public RedemptionItem updateRedemptionItem(RedemptionItem redemptionItem) {
		
		com.susgain.entity.RedemptionItem entity = mapper.map(redemptionItem);
		entity = redemptionItemDao.save(entity);
		RedemptionItem model = mapper.map(entity);
		return model;
	}

}
