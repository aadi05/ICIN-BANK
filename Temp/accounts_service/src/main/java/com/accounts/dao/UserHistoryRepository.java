package com.accounts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accounts.model.UserHistory;

@Repository
public interface UserHistoryRepository extends JpaRepository<UserHistory, Integer>{

	public List<UserHistory> findByAccount(int account);
}
