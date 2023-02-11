import java.io.*;
import java.sql.*;

public class JDBC_update {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
														"jdbc:oracle:thin:@localhost:1521/orcl",
														"SYSTEM",
														"Oracle_1"
														);
			Statement smt = con.createStatement();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter empId : ");
			int eid = Integer.parseInt(br.readLine());
			
			System.out.println("Enter new salary : ");
			double esal = Double.parseDouble(br.readLine());
			
			int count = smt.executeUpdate("update emp set esal = " + esal + " where eno = " + eid);
			if(count > 0) {
				System.out.println(count + " row updated");
			}
			else {
				System.out.println("No records found");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
