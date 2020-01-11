package com.deloitte.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int id;
	@Column(name="user_name")
	private String name;
	@Column(name="user_gender")
	private String gender;
	@Column(name="user_age")
	private String age;
	@Column(name="user_email")
	private String email;
	@Column(name="user_mobile")
	private String mobile;

	public User() {
	}
	
	public User(int id, String name, String gender, String age, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@NotEmpty(message="user Name is required")
	@Pattern(regexp="^[A-Z][A-Za-z]{2,40}$", 
	   message="user name should have only characters and first letter should be uppercase")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	@NotEmpty(message = "Age is required")
	@Pattern(regexp = "[0-9]{2}", message = "Age cannot be more than 99")
	public void setAge(String age) {
		this.age = age;
	}


	@NotEmpty(message="user Email is required")	
	@Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
			message="email is not in proper format")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@NotEmpty(message="Mobile is required")
	@Pattern(regexp = "[6-9][0-9]{9}",
		message="Mobile should start with 6,7,8 or 9 and have 10 digits")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", email=" + email
				+ ", mobile=" + mobile + "]";
	}

	


















	/*public User(int id, String name, String gender, String category,
			String email, String mobile) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.category = category;
		this.email = email;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@NotEmpty(message="user Name is required")
	@Pattern(regexp="^[A-Z][A-Za-z]{2,40}$", 
	   message="user name should have only characters and first letter should be uppercase")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@NotEmpty(message="Gender not selected")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Pattern(regexp = "^(?:(?!Select).)*$",
			message="Select a category")
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@NotEmpty(message="user Email is required")	
	@Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
			message="email is not in proper format")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", gender=" + gender
				+ ", category=" + category + ", email=" + email + ", mobile="
				+ mobile + "]";
	}

	@NotEmpty(message="Mobile is required")
	@Pattern(regexp = "[7-9][0-9]{9}",
		message="Mobile should start with 7,8 or 9 and have 10 digits")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
*/
}
