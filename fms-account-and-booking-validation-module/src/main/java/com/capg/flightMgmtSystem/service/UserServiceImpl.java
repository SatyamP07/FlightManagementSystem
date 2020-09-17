package com.example.application.service;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.application.entities.User;
import com.example.application.exceptions.UserAlreadyExistsException;
import com.example.application.repositories.ConfirmationTokenRepository;
import com.example.application.repositories.UserRepository;
import com.example.main.email_token.ConfirmationToken;

@Service
public class UserServiceImpl implements UserService {

org.slf4j.Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ConfirmationTokenRepository confirmationTokenRepository;
	
	@Autowired
	EmailSenderService emailSenderService;
	
	
	@Override
	public void addUser(User user) throws MessagingException, UserAlreadyExistsException {
		logger.trace("Add User working...");
		System.out.println("User working...");
		User existingUser = userRepository.findPassengerByEmailIgnoreCase(user.getEmail());
		System.out.println(existingUser);
        if(existingUser != null)
        {
        	throw new UserAlreadyExistsException("User exists with this email id!!!");
        }
        else
        {
        	validateUser(user);
        }  
    }

	@Override
	public void validateUser(User user) throws MessagingException {
		userRepository.save(user);
        System.out.println("1 "+user);
        User user1 = userRepository.findPassengerByEmailIgnoreCase(user.getEmail());
        System.out.println("1 "+user1);
        ConfirmationToken confirmationToken = new ConfirmationToken(user1.getUserid());

        MimeMessage mailMessage = emailSenderService.createMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mailMessage, true);
        
        helper.setTo(user.getEmail());
        helper.setSubject("Successfully Registered!");
        helper.setFrom("dsonaje6@gmail.com");
        helper.setText("<html><body style='border-style: solid;\r\n" + 
        		"  border-color: #DCDCDC; background-color: #F0FFFF; height: 250px; width:500px; margin-left:250px'>"
        		+ "<h1>Thanks for registration!</h1><br>" +
        		user+"<br><button type='submit' autofocus style='margin-left:220px; border-radius: 9px; border: 2px solid #DCDCDC'>"
        		+"<a href="+">Show Details</a></button>",true);

        emailSenderService.sendEmail(mailMessage);
	}

	@Override
	public User viewUser(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> viewUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub

	}
	
}