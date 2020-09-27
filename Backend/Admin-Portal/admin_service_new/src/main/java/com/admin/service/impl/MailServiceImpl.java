package com.admin.service.impl;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.AccountRepository;
import com.admin.dao.UserRepository;
import com.admin.model.Account;
import com.admin.model.User;

@Service
public class MailServiceImpl {
	
	@Autowired
	UserRepository userDAO;
	
	@Autowired
	AccountRepository  accountDAO;
	
	public void sendAuthorizedEmail(String username) throws EmailException {
		
		User user = userDAO.findByUsername(username);
		String receiver = user.getEmail();
		String fullName = user.getFname()+" "+user.getLname();
		Account account = accountDAO.findByUsername(username);
		long accountNo = account.getAccno();
		int balance = account.getBalance();
		
	    HtmlEmail mail = new HtmlEmail();
	    mail.setSSL(true);
	    mail.setHostName("smtp.gmail.com");
	    mail.setSmtpPort(465);
	    mail.setAuthenticator(new DefaultAuthenticator("icinbank.noreply@gmail.com", "icin@1155"));

	    mail.setFrom("icinbank.noreply@gmail.com", "ICIN");
	    mail.addTo(receiver, "To");
	    mail.setSubject(user.getFname()+", Welcome to your new ICIN Bank Account");
	    mail.setHtmlMsg("<h1 style='font-size:27px;color:blue'>Hi "+fullName+",</h1>"
	    		+ "<br><h2 style='font-size:21px;color:black'>Thank you for creating a ICIN Bank account. Your account has been activated,"
	    		+ " Here are your details.</h2><br>"
	    		+ "<p style='font-size:18px;'>Username: "+username+"<br><p style='font-size:18px;'>Account Number: "+accountNo+"<br>"
	    				+ "<p style='font-size:18px;'>Current Balance: Rs. "+balance+"</p>");
	    mail.send();
	    System.out.println("email sent");
	 }
	
	public void sendAuthorizeCancelEmail(String username) throws EmailException {
			
			User user = userDAO.findByUsername(username);
			String receiver = user.getEmail();
			String fullName = user.getFname()+" "+user.getLname();
			
		    HtmlEmail mail = new HtmlEmail();
		    mail.setSSL(true);
		    mail.setHostName("smtp.gmail.com");
		    mail.setSmtpPort(465);
		    mail.setAuthenticator(new DefaultAuthenticator("icinbank.noreply@gmail.com", "icin@1155"));
	
		    mail.setFrom("icinbank.noreply@gmail.com", "ICIN");
		    mail.addTo(receiver, "To");
		    mail.setSubject("ICIN Bank Account Cancelled");
		    mail.setHtmlMsg("<h1 style='font-size:27px;color:red'>Hi "+fullName+",</h1>"
		    		+ "<br><p style='font-size:19px;color:black'>Sorry, Your account with ICIN Bank with username "+username+ " has been cancelled. Please contact nearest branch for more details.</p><br><br>");
		    mail.send();
		    System.out.println("email sent");
		 }
	
	public void sendChequebookConfirmedEmail(String username) throws EmailException {
		
		User user = userDAO.findByUsername(username);
		String receiver = user.getEmail();
		String fullName = user.getFname()+" "+user.getLname();
		
	    HtmlEmail mail = new HtmlEmail();
	    mail.setSSL(true);
	    mail.setHostName("smtp.gmail.com");
	    mail.setSmtpPort(465);
	    mail.setAuthenticator(new DefaultAuthenticator("icinbank.noreply@gmail.com", "icin@1155"));

	    mail.setFrom("icinbank.noreply@gmail.com", "ICIN");
	    mail.addTo(receiver, "To");
	    mail.setSubject("ICIN Bank Chequebook Request Confirmed");
	    mail.setHtmlMsg("<h1 style='font-size:25px;color:green'>Hi "+fullName+",</h1>"
	    		+ "<br><p style='font-size:19px;color:black'>Your chequebook request has been processed and confirmed it will be sent to you via courier in 4-5 business days.</p><br><br>");
	    mail.send();
	    System.out.println("email sent");
	 }

}
