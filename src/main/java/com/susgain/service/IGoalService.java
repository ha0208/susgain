package com.susgain.service;

import java.util.List;

import com.susgain.model.Goal;

public interface IGoalService {
	
     Goal saveGoal(Goal goalModel);
     List<Goal> getAllGoals();
     void deleteGoalById(Integer id);
     Goal updateGoal(Goal goal);

}
