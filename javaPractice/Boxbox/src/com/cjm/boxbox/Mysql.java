package com.cjm.boxbox;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
// import java.sql.SQLException;
import java.sql.Statement;
// import java.util.Date;
public class Mysql {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
	public void readDataBase() throws Exception {
		try {
		// Loading MySQL diver, each DB has its own driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Trying to connect");
		// Setup connection with DB
		connect = DriverManager
				.getConnection("jdbc:mysql://localhost/feedback?" +
		"user=amazon&password=password");
		System.out.println("Connection Established Successfull and the databse name is:" +
		connect.getMetaData().getDatabaseProductName());
		// Statements allow to issue SQL queries to the database
		// statement = connect.createStatement();
		// ResultSet stores the result of the query
		// resultSet = statement
		//		.executeQuery("select * from feedback.comments");
		// writeResultSet(resultSet);
			} catch (Exception e) {
				System.out.println("Unable to make connection with DB");
				e.printStackTrace();
				throw e;
			} 
		}

//	private void writeResultSet(ResultSet resultSet) throws SQLException {
//		// Prints out query results
//		while (resultSet.next()) {
//			String name = resultSet.getString("name");
//			int length = resultSet.getInt("length");
//			int width = resultSet.getInt("width");
//			
//		}
//		
//	}

	

}
