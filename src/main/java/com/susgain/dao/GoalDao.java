package com.susgain.dao;

import org.springframework.stereotype.Repository;

import com.susgain.entity.Goal;

@Repository
public interface GoalDao extends IBaseDao<Goal, Integer>  {

}
