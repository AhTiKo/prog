import java.sql.*;
public class SQL {

	public static void main(String[] args) {
	
		Connection con = null;
		try {
			String name = "root";
			String password = "";
			String page = "jdbc:mysql://localhost/My_DB";
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(page,name,password);
		}catch(Exception e){
			System.out.println("Error: " + e);
		}finally{
			if (con != null){
				System.out.println("Connection open!");
				try {
					con.close();
					System.out.println ("Connection closed!");
				} catch (SQLException e) {
					System.out.println ("Error : " + e);
				}
				
			}
		}
	}

}
 