package com.icinbank.service;

import java.util.List;
import com.icinbank.model.ChequebookRequest;
import com.icinbank.response.ChequeResponse;

public interface ChequebookService {

	public ChequeResponse createrequest(ChequebookRequest chequebook);
	public List<ChequebookRequest> getRequests(long account);
}
