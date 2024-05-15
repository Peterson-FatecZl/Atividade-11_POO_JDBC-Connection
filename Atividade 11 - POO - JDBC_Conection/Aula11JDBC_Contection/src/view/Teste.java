package view;

import java.sql.Connection;
import java.sql.SQLException;

import persistance.GenericDao;

public class Teste {

	public static void main(String[] args) {

		GenericDao gDaoMySQL = new GenericDao();
		try {
			Connection c = gDaoMySQL.getConnection();
			String sgbdName = c.getMetaData().getDatabaseProductName();
			String sgbdVersion = c.getMetaData().getDatabaseProductVersion();
			System.out.print(sgbdName + " ");
			System.out.println(sgbdVersion);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
