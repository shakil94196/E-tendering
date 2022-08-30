package tendering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


import com.mysql.cj.jdbc.DatabaseMetaData;

class PP1 {
	private String aa,bb;
	
	public int login() {
		
		Scanner sc= new Scanner(System.in);
		
		String us,pass;
		PP3 obj3 = new PP3();
		PP4 obj4 = new PP4();
		PP5 obj5 = new PP5();
		
		
		System.out.print(" Enter the Username:  ");
		us=sc.nextLine();
		
		System.out.print(" Enter the Password:  ");
		pass=sc.nextLine();
		System.out.println();
		
		
		//System.out.println("SHAKIL");
		String url= "jdbc:mysql://localhost:3306/eee";
		String uname = "root";
		String pass1 = "shakil**";
		
		
		try {
			Connection connection = DriverManager.getConnection(url, uname, pass1);
			
			String sql = "SELECT * FROM checkk";
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			/*String sql1 = "SELECT * FROM stdd";
			Statement statement1= connection.createStatement();
			ResultSet result1= statement1.executeQuery(sql1);*/
			
			int count=0,yy=0,f=0;
			while(result.next()) {
				
				aa = result.getString("username");
				bb = result.getString("password");
				
				count++;
				//System.out.println("checkk " + count + " : " + aa + " : " + bb);
				
				/*System.out.println(" us " + us);
				System.out.println("pass "+ pass);
				
				System.out.println(" aa " + aa);
				System.out.println("bb "+ bb);
				
				System.out.println(aa.equals(us));*/
				
				if(aa.equals(us) && bb.equals(pass)) {
					
					yy=1;
					System.out.println("***Yes,you are logged in successfully ***");
					System.out.println("   ----------------------------------\n");
					break;
					
				}
				
				if(aa==us) {
					
					f=1;
				}
				
				
			} //end of while loop
			
			
			
			
			
			
			if(yy==1) {
				
				System.out.print(" *** IF you would like to see all project name list, Please Prss 1 or  exit the page press 2 !!!\n\n\n");
				System.out.print(" *** IF you would like to  bid for the project,  Please Press 3 \n");
				System.out.print(" *** IF you would like to see approve list, Please press 4\n\n");
				
				
				int dd;
				dd = sc.nextInt();
				
				
				if(dd==4) {
					obj3.see_approve_list();
				}
				else if(dd==1) {
				
				while(true) {
				
				System.out.println("----- Here all project Name : -----  ");
				System.out.println("-------------------------------------\n");
					
				//rr++;
				String sql1 = "SELECT * FROM e_tender";
				Statement statement1= connection.createStatement();
				ResultSet result1= statement1.executeQuery(sql1);
				int rr=0;
				
				while(result1.next()) {
					
					
					rr++;
					String vv=result1.getString("Project_name");
					System.out.println( "Project_Serial_Number :- " + rr + " : " + vv);
					System.out.println();
				}
				
				
				
				///I will see 4 num of project
				
				System.out.println("***IF you see project full description,Please press Project_Serial_Number \n");
				System.out.println();
				
				System.out.println("***IF you want bidding a project Please press 44\n");
				int pp;
				
				pp = sc.nextInt();
				
				if(pp==44) {
					obj4.bidding(us);
				}
				
				
				else {
				
				obj5.project_full_description();
				
				}
				
				System.out.println("(1) IF you see again all project ? Please Press 1 for back :- ");
				System.out.println("-----------------------------------------------------------\n");
				
				
				
				
				System.out.println("(2) IF you don't see again all project ? Please Press 2  :- ");
				System.out.println("---------------------------------------------------------\n");
				
				
				
				
				int hh;
				hh=sc.nextInt();
				
				if(hh==1) {
					continue;
				}
				
				else {
					break;
				}
				
				
				}// while(true) end loop //start if loop
				
				}
				
				else if(dd==2) return 2;
				
				else if(dd==3) {
				
				
				obj4.bidding(us);
				//statement4.close();
				
				}
				
			}
			
			else if(f!=1) return 1;
			
			else {
				
				System.out.println("Your Password is wrong!!! Please try again.\n ");
			}
			
			
			
			
			
			
			/*int count1=0;
			while(result1.next()) {
				int a=result1.getInt("id");
				String name = result1.getString("name");
				String district = result1.getString("district");
				
				count1++;
				System.out.println("stdd " + count1 + " : " + name + " : " + district );
				
			}*/
				
			statement.close();
			connection.close();
			
			} catch (SQLException e) {     //end of try loop
				// TODO Auto-generated catch block
				System.out.println("Error");
				e.printStackTrace();
			}
				
		
		
		
		return 0;


	}

}
