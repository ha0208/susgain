package com.susgain.validation;

import org.springframework.stereotype.Component;

import com.susgain.exception.ValidationException;
import com.susgain.model.Goal;
import com.susgain.util.Constants;

@Component
public class GoalModelValidation {
	
	public boolean validate (Goal goal) {
		
		double i = goal.getRedemptionCost();
		String name = goal.getName();

		if(i <= 0){
			throw new ValidationException(Constants.ERROR_MSG_GOAL_COST);
		}

		if(name == null|| name.equals("")) {
			throw new ValidationException(Constants.ERROR_MSG_GOAL_NAME);
		}
		
		return true;
	}

}
