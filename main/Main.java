import java.sql.*;

public class Main {

	public static void main(String[] ar) throws ClassNotFoundException, SQLException {

		//Quiz quiz = new Quiz();
		//connecting to postgres db from application
		
		
		//load and register driver
		String url = "jdbc:postgresql://localhost:5433/student";
		String uname = "postgres";
		String password = "password";
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url, uname, password);
//		Statement state = con.createStatement();
//		ResultSet rs = state.executeQuery("SELECT * FROM students");
//		while(rs.next()) {
//			String data = rs.getInt("sid") + " " + rs.getString("name") + " " + rs.getInt("marks");
//			System.out.println(data);
//		}
		String insertSql = "INSERT INTO students values (?,?,?)";
		PreparedStatement ps = con.prepareStatement(insertSql);
		ps.setInt(1, 106);
		ps.setString(2, "Johnny");
		ps.setInt(3, 44);
		ps.execute();		
		con.close();
		
	}
}
