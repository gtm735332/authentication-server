package com.cts.auth.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "USER")
@Data
@NoArgsConstructor
@AllArgsConstructor


@NamedQueries({
	@NamedQuery(name = "User.getUserByUserName", query = "SELECT u FROM User u WHERE u.userName= :userName")
})

public class User {
	
	@Id
	@Column(name="USER_ID")
	private long userId;
	
	@Column(name="USER_NAME")
	private String userName;
	
	private String password;

	@Column(name="EMAIL_ID")
	private String emailId;
	
}
