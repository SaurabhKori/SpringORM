package com.jsp.spring_orm_with_xml_config;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.spring_orm_with_xml_config.dao.UserDao;
import com.jsp.spring_orm_with_xml_config.dto.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        UserDao userdao=context.getBean("userDao",UserDao.class);
//        userdao.insert(new User(333,"Ram",63476347));
//        userdao.updateUserDetail(new User(111, "Gaurav", 387483));
//        System.out.println(userdao.getUserData(111));
        for (User user : userdao.getAllUserData()) {
        	System.out.println(user);
			
		}
    }
}
