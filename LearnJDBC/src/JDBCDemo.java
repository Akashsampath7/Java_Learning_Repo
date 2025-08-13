import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		
		//Step 1: Give correct url with ip port with database name.
		String url = "jdbc:mysql://127.0.0.1:3306/employee_database";
		try {
			// Step 2: Establish Connecion object 
			Connection conn = DriverManager.getConnection(url, "root", "Ap8825466127&");
			
			//Step 3: create a statement object to send to the database
			Statement statement = conn.createStatement();
			
			//Insert new row of data in database using executeUpdate
			statement.executeUpdate("insert into employee_tbl (id, name, dept, salary)" + "values(800, 'Jackie', 'Stuntman', 9000);");
			System.out.println("Executed on Insert Statement.");
			
			//Step 4: Execute the statement object
			ResultSet resultSet = statement.executeQuery("select * from employee_tbl");
			
			//Step 5: Process the result
			int salaryTotal = 0;
			while(resultSet.next()) {
				System.out.println(resultSet.getString("salary"));			
				salaryTotal = salaryTotal + Integer.parseInt(resultSet.getString("salary"));
			}
			System.out.println("Total salary is: "+ salaryTotal);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
