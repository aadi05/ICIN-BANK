package com.admin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.admin.model.ChequebookRequest;

@Repository
public interface ChequeBookRequestsRepository extends CrudRepository<ChequebookRequest, Integer>{
	
	@Modifying
	@Transactional
	@Query("update ChequebookRequest c set c.requestStatus=1 where c.account = ?1")
	void setChequebookInfoByAccount(long accNo);
	
	@Query("FROM ChequebookRequest c where c.requestStatus=FALSE")
	public List<ChequebookRequest> findAllChequebookRequests();

}
