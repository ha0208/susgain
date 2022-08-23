package com.susgain.mapper;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.susgain.model.RedemptionItem;

@Component
public class RedemptionItemMapper {
	
	@Autowired 
	private GoalMapper goalMapper;
	
	//entity to model
	public RedemptionItem map(com.susgain.entity.RedemptionItem entity) {
		RedemptionItem model = new RedemptionItem();
		if(entity != null) {
		model.setId(entity.getId());
		model.setName(entity.getName());
		model.setDescription(entity.getDescription());
		model.setGoal(goalMapper.map(entity.getGoal()));
		}
		return model;
	}
	
	public List<RedemptionItem> mapEntities(List<com.susgain.entity.RedemptionItem> entities){
		List<RedemptionItem> models = new ArrayList<>();
		for (int i=0; i<entities.size(); i++) {
			models.add(map(entities.get(i)));
		}
		return models;
		
	}
	
	//model to entity
	public com.susgain.entity.RedemptionItem map(RedemptionItem model){
		com.susgain.entity.RedemptionItem entity = new com.susgain.entity.RedemptionItem();
		if(model != null) {
			entity.setId(model.getId());
			entity.setName(model.getName());
			entity.setDescription(model.getDescription());
			entity.setGoal(goalMapper.map(model.getGoal())); 
		}
		return entity;
	}
	
	public List<com.susgain.entity.RedemptionItem> mapModels(List<RedemptionItem> models){
		List<com.susgain.entity.RedemptionItem> entities = new ArrayList<>();
		for(int i=0; i < models.size(); i++) {
			entities.add(map(models.get(i)));
		}
		return entities;
	}

}
