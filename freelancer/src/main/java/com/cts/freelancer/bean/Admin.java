package com.cts.freelancer.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Admin {
 
	private String firstName;
	private String lastName;
		@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int adminId;
}
