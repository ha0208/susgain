package com.susgain.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.susgain.entity.Goal;
import com.susgain.model.RedemptionItem;

@Component
public class GoalMapper {
	
	@Autowired
	private RedemptionItemMapper redemptionItemMapper;
	
	// entity to model
	public com.susgain.model.Goal map(Goal entity) {		
		com.susgain.model.Goal model = new com.susgain.model.Goal();
		 if(entity != null) {
			 model.setId(entity.getId());
			 model.setName(entity.getName());
			 model.setDescription(entity.getDescription());
			 model.setImage(entity.getImage());
			 model.setRedemptionItem(redemptionItemMapper.map(entity.getRedemptionItem()));
			 model.setRedemptionCost(entity.getRedemptionCost());
		}
		return model;
	}
		
	public List<com.susgain.model.Goal> mapEntities(List<Goal> entities) {
		List<com.susgain.model.Goal> models = new ArrayList<>();
		for (int i=0; i < entities.size(); i++) {
			models.add(map(entities.get(i)));
		}
		return models;
	}
	
	// model to entities 
	public Goal map(com.susgain.model.Goal model) {
		Goal entity = new Goal();
		 if(model != null) {
			 entity.setId(model.getId());
			 entity.setName(model.getName());
			 entity.setDescription(model.getDescription());
			 entity.setImage(model.getImage());
			 entity.setRedemptionItem(redemptionItemMapper.map(model.getRedemptionItem()));
			 entity.setRedemptionCost(model.getRedemptionCost());
		}
		return entity;
	}
	
	public List<Goal> mapModels(List<com.susgain.model.Goal> models) {
		List<Goal> entities = new ArrayList<>();
		for(int i=0; i < models.size(); i++) {
			entities.add(map(models.get(i)));
		}
		return entities;
	}
}
