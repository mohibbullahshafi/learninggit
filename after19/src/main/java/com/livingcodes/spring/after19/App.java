package com.livingcodes.spring.after19;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jca.cci.CannotGetCciConnectionException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/livingcodes/spring/after19/beans.xml");
		NoticesDAO noticesDAO = (NoticesDAO) context.getBean("noticesDao");
		// List<Notice> notices = noticesDAO.getNotices();

		try {
			// noticesDAO.delete(7);
			Notice notice1 = new Notice(10, "Check Another", "Test@gmal.com", "Hi checj");
			// noticesDAO.create(notice1);

			noticesDAO.update(notice1);

			List<Notice> notices = noticesDAO.getNotices();
			for (Notice notice : notices) {
				System.out.println(notice);
			}
			Notice notice = noticesDAO.getNotice(1);
			// System.out.println(notice);
		} catch (CannotGetJdbcConnectionException x) {
			System.out.println("Could not get");
		} catch (DataAccessException e) {
			System.out.println(e);
			System.out.println(e.getClass());
		}
	}
}
