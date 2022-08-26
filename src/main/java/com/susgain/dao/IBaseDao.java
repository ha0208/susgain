package com.susgain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IBaseDao <T, J> extends JpaRepository<T, J> {

}
