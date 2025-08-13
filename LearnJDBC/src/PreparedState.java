import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedState {

	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/employee_database";
		 String UPDATE_QUERY = "update employee_tbl set salary = ? where id = ?;";
		
		try {
			Connection conn = DriverManager.getConnection(url, "root", "Ap8825466127&");
			PreparedStatement ps = conn.prepareStatement(UPDATE_QUERY);
			ps.setInt(1, 3000);
			ps.setInt(2, 100);
			int rs = ps.executeUpdate();
			System.out.println("Updated Rows: " + rs);
            ps.close();
            conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
