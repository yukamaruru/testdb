package testdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestUserDAO2 {
	String name = "";
	String password = "";

	public void select(String name,String password){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select * from test_table where user_name=? and password=?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}



}
