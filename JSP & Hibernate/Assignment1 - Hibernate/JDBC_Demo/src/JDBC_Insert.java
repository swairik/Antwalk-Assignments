import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class JDBC_Insert {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
														"jdbc:oracle:thin:@localhost:1521/orcl",
														"SYSTEM",
														"Oracle_1"
														);
			PreparedStatement psmt = con.prepareStatement("insert into emp values(?, ?, ?)");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.println("Enter Emp Id : ");
				int eno = Integer.parseInt(br.readLine());
				
				System.out.println("Enter Emp Name : ");
				String ename = br.readLine();
				
				System.out.println("Enter Emp Salary : ");
				double esal = Double.parseDouble(br.readLine());
				
				psmt.setInt(1, eno);
				psmt.setString(2, ename);
				psmt.setDouble(3, esal);
				
				int count = psmt.executeUpdate();
				if(count > 0) {
					System.out.println(count + " record inserted");
				}
				else {
					System.out.println("No record inserted");
				}
				
				System.out.println("Do you want to insert more records?");
				String ch = br.readLine();
				
				if(ch.equalsIgnoreCase("no")) {
					break;
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
