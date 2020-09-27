package com.icinbank.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icinbank.model.UserHistory;

@Repository
public interface UserHistoryRepository extends JpaRepository<UserHistory, Integer>{

	public List<UserHistory> findByAccount(long account);
}
