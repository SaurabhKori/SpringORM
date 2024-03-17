package com.jsp.spring_orm_with_xml_config.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.jsp.spring_orm_with_xml_config.dto.User;



public class UserDao {
 private HibernateTemplate hibtemp;
 //insert Data
 @Transactional
 public int insert(User user) {
	 int i=(Integer)this.hibtemp.save(user);
	 return i;
	 
 }
// get one Data from database
 public User getUserData(int userid) {
	 return hibtemp.get(User.class,userid);
	 
 }
 //get all data from table;
 public List<User> getAllUserData(){
	 return hibtemp.loadAll(User.class);
 }
 //delete data from table
 public void deleteOneData(int id) {
	 User user=getUserData(id);
	 hibtemp.delete(user);
	 
	 
 }
 @Transactional
 public void updateUserDetail(User user) {
	 hibtemp.update(user);;
 }
public HibernateTemplate getHibtemp() {
	return hibtemp;
}
public void setHibtemp(HibernateTemplate hibtemp) {
	this.hibtemp = hibtemp;
}

}
