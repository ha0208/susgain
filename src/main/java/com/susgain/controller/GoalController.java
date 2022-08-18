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

import com.susgain.model.Goal;
import com.susgain.service.GoalService;

@RestController
@RequestMapping("/api/goal")
public class GoalController {
	
	@Autowired
	private GoalService goalService;

	@PostMapping("/add")
	public Goal addGoal(@RequestBody Goal goalModel) {
		return goalService.saveGoal(goalModel);
	}
	
	@GetMapping
	public List<Goal> getAllGoals() {
		 return goalService.getAllGoals();
	}
	
	@DeleteMapping("/delete/{id}") 
	public void deleteGoal(@PathVariable int id) {
		goalService.deleteGoalById(id); 
	}
	 
	@PutMapping("/update")
	public Goal updateGoal(@RequestBody Goal goalModel) {
	  return goalService.updateGoal(goalModel); 
	}

}
