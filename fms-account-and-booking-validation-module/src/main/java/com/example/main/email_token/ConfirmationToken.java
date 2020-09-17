package com.example.main.email_token;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
@Table(name="confirmation_token")
public class ConfirmationToken {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column(name="confirmation_token")
    private String confirmationToken;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    
    @Column(name="user_id")
    private Long uid;
    
    public ConfirmationToken(Long long1) {
        this.uid = long1;
        createdDate = new Date();
        confirmationToken = UUID.randomUUID().toString();
    }
    
	public ConfirmationToken() {
//		super();
//		// TODO Auto-generated constructor stub
	}

}