package tendering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PP3 {
	
	public void see_approve_list() {
		
		Scanner sc = new Scanner(System.in);
		String gg1,gg2;
		String url= "jdbc:mysql://localhost:3306/eee";
		String uname = "root";
		String pass1 = "shakil**";
		
		
		try {
			Connection connection14 = DriverManager.getConnection(url, uname, pass1);
			
			String sql14 = "SELECT * FROM approve_bidder_user_id";
			Statement statement14 = connection14.createStatement();
			ResultSet result14= statement14.executeQuery(sql14);
			
			while(result14.next()) {
				
				//cc++;
				//System.out.println("KKKKKKK  : " + cc + "  " + serial_num);
				
				//if(cc==serial_num) {
					
					String v1=result14.getString("user_id");
					
					System.out.println(" **** User_id : " + v1);
					System.out.println();
					
					
					
			}
			
			statement14.close();
			connection14.close();
			result14.close();
					
					} catch (SQLException e) {     //end of try loop
						// TODO Auto-generated catch block
						System.out.println("Error");
						e.printStackTrace();
					}
		
	}
	
	public void approve_list() {
		
		Scanner sc = new Scanner(System.in);
		String gg1,gg2;
		String url= "jdbc:mysql://localhost:3306/eee";
		String uname = "root";
		String pass1 = "shakil**";
		
		try {
			Connection connection12 = DriverManager.getConnection(url, uname, pass1);
			String sql12="INSERT INTO approve_bidder_user_id (user_id) VALUES(?)";
			PreparedStatement statement12 = connection12.prepareStatement(sql12);
			
			System.out.print("** Enter the User_ID:- ");
			
			gg1 = sc.nextLine();
			System.out.println();
			
			statement12.setString(1, gg1);
			
            System.out.println(" A row has been inserted in the database\n");
			
			statement12.close();
			connection12.close();
			
			int rows11=statement12.executeUpdate();
			
		} catch (SQLException e) {     
			// TODO Auto-generated catch block
			System.out.println("Error");
			e.printStackTrace();
		}
			
			
			
	}
	
	public void upload_details() {
		
		
		
		Scanner sc = new Scanner(System.in);
		String ff1,ff2,ff3,ff4,ff5,ff6,ff7;
		String url= "jdbc:mysql://localhost:3306/eee";
		String uname = "root";
		String pass1 = "shakil**";
		
		try {
			Connection connection11 = DriverManager.getConnection(url, uname, pass1);
			String sql11="INSERT INTO e_tender (Project_name,Location,Tender_proposal_amount,Brief_Description_of_Works,Tender_Application_Start_Date,Tender_Application_Last_Date ) VALUES(?,?,?,?,?,?)";
			PreparedStatement statement11 = connection11.prepareStatement(sql11);
			
			
			
		
			
			System.out.print("***Enter the Project_name :-  ");
			//System.out.println("--------------");
			ff1 = sc.nextLine();
			System.out.println();
			
			
			System.out.print("*** Enter the Project Location :- ");
			//System.out.println("---------");
			ff2 = sc.nextLine();
			System.out.println();
			
			System.out.print("*** Tender Proposal Amount :- ");
			ff3 = sc.nextLine();
			System.out.println();
			
			System.out.print("*** Brief_Description_of_Works :- ");
			ff4 = sc.nextLine();
			System.out.println();
			
			System.out.print("*** Tender_Application_Start_Date :- ");
			ff5 = sc.nextLine();
			System.out.println();
			
			System.out.print("*** Tender_Application_Last_Date :- ");
			ff6 = sc.nextLine();
			System.out.println();
			
			
			statement11.setString(1, ff1);
			statement11.setString(2, ff2);
			statement11.setString(3, ff3);
			statement11.setString(4, ff4);
			statement11.setString(5, ff5);
			statement11.setString(6, ff6);
			
			System.out.println(" A row has been inserted in the database\n");
			
			
			
			int rows11=statement11.executeUpdate();
			
			
			
		} catch (SQLException e) {     
			// TODO Auto-generated catch block
			System.out.println("Error");
			e.printStackTrace();
		}
			
			
		
	}
	
	public void adminlogin() {
		
		
		String xx,zz;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the Username : ");
		xx = sc.nextLine();
		System.out.println();
		
		System.out.print(" Enter the Password : ");
		zz = sc.nextLine();
		System.out.println();
		
		if((xx.equals("333") && zz.equals("222")) || (xx.equals("sh877") && zz.equals("69987"))) {
			
			System.out.print("*** If you see all user bidding list, Please Press 1 : \n");
			System.out.print("*** If you approve project bidder name, Please press 2: \n");
			System.out.print("*** If you upload project details, Please press 3: \n\n ");
			
			
			int m;
			m = sc.nextInt();
			
			if(m==1) {
				
				System.out.println("----- Here all the bidder list : -----  ");
				System.out.println("---------------------------------------\n");
				
				
				String url= "jdbc:mysql://localhost:3306/eee";
				String uname = "root";
				String pass1 = "shakil**";
				
				try {
					Connection connection = DriverManager.getConnection(url, uname, pass1);
				
				String sql9="select * from user_bidding";
				Statement statement9 = connection.createStatement();
				ResultSet result9 = statement9.executeQuery(sql9);
				
				
				int ll=0;
				String aaa1,aaa2,aaa3;
				while(result9.next()) {
					
					aaa1 = result9.getString("user_id");
					aaa2 = result9.getString("Project_name");
					aaa3 = result9.getString("Budget_for_the_Project");
					
					ll++;
					//System.out.println( ll + " : " + aaa1 + " : " + aaa2 + " : " + aaa3);
					
					System.out.print("**** Bidder Serial NUmber : " + ll);
					System.out.print("\n-----------------------------\n\n");
					System.out.print("*** User_id : " + aaa1);
					System.out.println();
					
					
					
					System.out.print("*** Project_name : " + aaa2);
					System.out.println();
					
					
					
					System.out.print("*** Budget_for_the_Project : " + aaa3);
					System.out.println("\n\n");
				
				
				
				
				
				
				} 
				
				
				System.out.print("*** If you approve project bidder name, Please press 2: \n\n");
				
				int oo;
				oo = sc.nextInt();
				
				if(oo==2) approve_list();
				
				statement9.close();
				connection.close();
				
				} catch (SQLException e) {     
					// TODO Auto-generated catch block
					System.out.println("Error");
					e.printStackTrace();
				}
					
			
			
		
	}
			
			else if(m==3) {
				
				upload_details();
				
				while(true) {
					
					int h;
					
					System.out.print(" ** If you again project upload details press 1 or for exit press 2 ");
					h = sc.nextInt();
					
					System.out.println();
					
					
					if(h==1) {
						upload_details();
					}
					else break;
				}
			}
	
			else if(m==2) {
				
				approve_list();
			}
			
			
			
		}
		
		else {
			
			System.out.println("Your user_id and password is incorrect,Please right user_id and password");
		}
		
	}


	
}

