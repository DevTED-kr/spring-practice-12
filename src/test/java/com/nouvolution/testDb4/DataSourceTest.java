package com.nouvolution.testDb4;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/application.xml"})
public class DataSourceTest {

	@Inject
	private DataSource datasource;
	
	@Test
	public void testConnection() throws Exception {
		try (Connection connection = datasource.getConnection()){
			System.out.println(connection);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
