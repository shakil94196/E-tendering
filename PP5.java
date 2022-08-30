package tendering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PP5 {
	
	public void project_full_description() {
		
		
		Scanner sc = new Scanner(System.in);
		String url= "jdbc:mysql://localhost:3306/eee";
		String uname = "root";
		String pass1 = "shakil**";
		
		
		
		int serial_num,cc=0;
		
		
		try {
			Connection connection13 = DriverManager.getConnection(url, uname, pass1);
			
		serial_num = sc.nextInt();
		String sql13 = "SELECT * FROM e_tender";
		Statement statement13 = connection13.createStatement();
		ResultSet result13 = statement13.executeQuery(sql13);
		
		while(result13.next()) {
			
			cc++;
			//System.out.println("KKKKKKK  : " + cc + "  " + serial_num);
			
			//if(cc==serial_num) {
				
				String v1=result13.getString("Project_name");
				String v2=result13.getString("Location");
				String v3=result13.getString("Brief_Description_of_Works");
				String v4=result13.getString("Tender_Application_Start_Date");
				String v5=result13.getString("Tender_Application_Last_Date");
				
			if(cc==serial_num) {
				System.out.println("----------------------");
				System.out.println("Project_Serial_Number :- " + cc);
				System.out.println("----------------------");
				System.out.println();
				
				System.out.println("--------------");
				System.out.println("Project_name :- " + v1);
				System.out.println("--------------");
				System.out.println();
				
				System.out.println("---------");
				System.out.println("Location :- " + v2);
				System.out.println("---------");
				System.out.println();
				
				System.out.println("---------------------------");
				System.out.println("Brief_Description_of_Works :- " + v3);
				System.out.println("---------------------------");
				System.out.println();
				
				System.out.println("------------------------------");
				System.out.println("Tender_Application_Start_Date :- " + v4);
				System.out.println("------------------------------");
				System.out.println();
				
				System.out.println("-----------------------------");
				System.out.println("Tender_Application_Last_Date :- " + v5);
				System.out.println("-----------------------------");
				System.out.println();
				
			}
			
			}//result3.next while end lopp;
		
		
		statement13.close();
		connection13.close();
		result13.close();
		
		
		
		} catch (SQLException e) {     //end of try loop
			// TODO Auto-generated catch block
			System.out.println("Error");
			e.printStackTrace();
		}
		
		
	}

	

}
