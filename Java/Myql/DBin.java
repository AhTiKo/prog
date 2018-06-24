import java.sql.*;


public class DBin {
	public static void main(String[] args) {
	
	Connection con = null;
	PreparedStatement ps = null;
	try {
		String name = "root";
		String password = "";
		String page = "jdbc:mysql://localhost/My_DB";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		con = DriverManager.getConnection(page,name,password);
		Statement s = con.createStatement();
		ResultSet r = s.executeQuery("SELECT FirstName,LastName FROM Customers");
		while(r.next()){
			
			System.out.println(r.getString("FirstName")+" "+r.getString("LastName"));
		}
		ps = con.prepareStatement("INSERT INTO Customers(id,FirstName,LastName,AddressId) VALUES(?,?,?,?)");
		ps.setString(1, "6");
		ps.setString(2,"Bojana");
		ps.setString(3, "Varbanova");
		ps.setString(4, "116");
		ps.executeUpdate();
		
		r = s.executeQuery("SELECT id,FirstName,LastName,AddressId FROM Customers");
		while(r.next()){
			
			System.out.println(r.getString("id")+" "+r.getString("FirstName")+" "+r.getString("LastName")+" "+r.getString("AddressId"));
		}
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


