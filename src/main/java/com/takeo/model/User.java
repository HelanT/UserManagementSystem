package com.takeo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="USER_DTLS")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name ="UID")
	private int uid;
	@NotBlank(message = "Name is Mandatory")
	@Size(min = 2, message ="UserName Should Have at least 2 characters")
	@Column(name ="FNAME")
	private String firstName;
	@Column(name ="LNAME")
	private String lastName;
	@Column(name ="EMAIL")
	@NotBlank(message = "Email is Mandatory")
	@Email
	private String email;
	@Column(name ="ADDRESS")
	private String address;
	@Column(name ="MOBILENUMBER")
	private long mobileNumber;
	@Column(name ="UNAME")
	private String userName;
	@NotEmpty
	@Size(min = 2, message =" passWord should have at least 8 characters ")
	@Column(name ="PASS")
	private String password;
	
	

}
