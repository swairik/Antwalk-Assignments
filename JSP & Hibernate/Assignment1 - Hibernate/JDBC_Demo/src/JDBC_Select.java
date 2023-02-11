import java.sql.*;

public class JDBC_Select {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection(
														"jdbc:oracle:thin:@localhost:1521/orcl",
														"SYSTEM",
														"Oracle_1"
														);
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from emp");
			while(rs.next()) {
				int eno = rs.getInt(1);
				String ename = rs.getString(2);
				double esal = rs.getDouble(3);
				
				System.out.print("EmpId : " + eno);
				System.out.print(" EmpName : " + ename);
				System.out.print(" EmpSalary : " + esal);
				
				System.out.println();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
