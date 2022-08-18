package com.susgain.service;

import java.util.List;

import com.susgain.model.Goal;

public interface GoalService {
	
    public Goal saveGoal(Goal goalModel);
    public List<Goal> getAllGoals();
    public void deleteGoalById(Integer id);
    public Goal updateGoal(Goal goal);

}
