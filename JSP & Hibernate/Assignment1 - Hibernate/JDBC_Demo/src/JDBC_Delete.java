import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Delete {

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
			
			while(true) {
				System.out.println("Enter deletion empId : ");
				int eno = Integer.parseInt(br.readLine());
				
				int count = smt.executeUpdate("delete from emp where eno = " + eno);
				if(count > 0) {
					System.out.println(count + " row deleted");
				}
				else {
					System.out.println("No records deleted");
				}
				
				System.out.println("Do you want to delete more records?");
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
