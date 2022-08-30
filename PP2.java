package tendering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PP2 {
	
	public void register() {
		
		String tt,ff,gg;
		
		Scanner sc = new Scanner(System.in);
		
		
		//System.out.println("SHAKIL");
		String url= "jdbc:mysql://localhost:3306/eee";
		String uname = "root";
		String pass1 = "shakil**";
		
		
		try {
			Connection connection1 = DriverManager.getConnection(url, uname, pass1);
			
			String sql8 = "SELECT * FROM checkk";
			Statement statement8 = connection1.createStatement();
			ResultSet result8= statement8.executeQuery(sql8);
			
			while(true) {
			
				System.out.print(" Enter the Username : ");
				System.out.println("---------------------\n");
				ff = sc.nextLine();
				
			int count=0,yy=0,f=0;
			while(result8.next()) {
				
				tt = result8.getString("username");
				
				
				
				
				
				if(tt.equals(ff) ) {
					
					yy=1;
					System.out.println("This username is registered, Please select another username!!!");
					System.out.println("---------------------------------------------------------------\n");
					break;
					
				}
				
				
				
				
			} //end of while loop
			
			if(yy==1) continue;
			else {
				
				System.out.print(" Enter the Password:  \n");
				gg = sc.nextLine();
				System.out.println();
				
				String sql7="INSERT INTO checkk (username,password) VALUES(?,?)";
				PreparedStatement statement7 = connection1.prepareStatement(sql7);
				
				//statement.setInt(1, 44);
				
				//System.out.println("ff : " + ff);
				//System.out.println("gg : " + gg);
				statement7.setString(1, ff);
				statement7.setString(2, gg);
				
				System.out.println("****YES, Registration is complete. ****\n");
				System.out.println();
				
				int rows7=statement7.executeUpdate();
				//System.out.println(rows7);
				
				statement7.close();
				connection1.close();
				
				break;
				
				
			}
			
			
			
			
			
			
			} //while(true) end of while loop
			
			
			
		} catch (SQLException e) {     //end of try loop
			// TODO Auto-generated catch block
			System.out.println("Error");
			e.printStackTrace();
		}
		
	}
	
	

}
