package com.susgain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.susgain.dao.GoalDao;
import com.susgain.entity.Goal;
import com.susgain.mapper.GoalMapper;
import com.susgain.validation.GoalModelValidation;

@Service
public class GoalService implements IGoalService {
	
	@Autowired
	private GoalDao goalDao;
	
	@Autowired
	private GoalMapper mapper;
	
	@Autowired
	private GoalModelValidation goalModelValidator;
	
	@Override
	public com.susgain.model.Goal saveGoal(com.susgain.model.Goal goalModel) {
	
		goalModelValidator.validate(goalModel);
		
		// convert model to entity
		Goal entity = mapper.map(goalModel);
		
		// save entity
		entity = goalDao.save(entity);
		
		// convert back to model from entity
		com.susgain.model.Goal model = mapper.map(entity);
		
		return model;
	}

	@Override
	public void deleteGoalById(Integer id) {
		goalDao.deleteById(id);
	}

	@Override
	public List<com.susgain.model.Goal> getAllGoals() {
		return mapper.mapEntities(goalDao.findAll());
	}

	@Override
	public com.susgain.model.Goal updateGoal(com.susgain.model.Goal goal) {
		
		// convert model to entity
		Goal entity = mapper.map(goal);
		
		// update entity
		entity = goalDao.save(entity);
		
		// convert back to model from entity
		com.susgain.model.Goal model = mapper.map(entity);
		
		return model;
	}	

}
