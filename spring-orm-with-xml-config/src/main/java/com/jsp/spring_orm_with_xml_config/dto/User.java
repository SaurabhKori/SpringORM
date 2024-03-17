package com.jsp.spring_orm_with_xml_config.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	private int userId;
	private String userName;
	private long userPhone;
	
//	public User() {
//		
//	}
//	public User(int userId, String userName, double userPhone) {
//		
//		this.userId = userId;
//		this.userName = userName;
//		this.userPhone = userPhone;
//	}
//	public int getUserId() {
//		return userId;
//	}
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//	public double getUserPhone() {
//		return userPhone;
//	}
//	public void setUserPhone(double userPhone) {
//		this.userPhone = userPhone;
//	}
//	@Override
//	public String toString() {
//		return "User [userId=" + userId + ", userName=" + userName + ", userPhone=" + userPhone + "]";
//	}
//	
 

}
