package testdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";
	//jdbcのドライバーの名前を変数に代入している。ドライバーはJavaとデータベースを繋げる工具箱。

	private static String url = "jdbc:mysql://localhost/testdb?autoReconnct=true&useSSL=false";

	private static String user = "root";
	private static String password = "root";

public Connection getConnection(){
//接続状態にする
	Connection con = null;
	//一度状態を初期化。
	//↑この二つは接続しかしないクラス。公式として覚える。

	try{
		Class.forName(driverName);
		con = DriverManager.getConnection(url,user,password);
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e){
		e.printStackTrace();
	}
	return con;
}

}
