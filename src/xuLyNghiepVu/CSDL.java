package xuLyNghiepVu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CSDL {
	String dbURL = "jdbc:sqlserver://localhost:1433;"
			+ "DatabaseName=QLBH;"
			+ "user=sa;"
			+ "password=man12345;";
	Connection conn;
	Statement stmt;
	
	public Connection getConn() {
		return conn;
	}
	
	public Statement getStmt() {
		return stmt;
	}
	
	public CSDL() {
		try {
			conn = DriverManager.getConnection(dbURL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	public ResultSet truyVan(String query) {
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public static void main(String[] args) {
		CSDL csdl = new CSDL();
		
	}
}
