package tendering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PP4 {
	
	
	public void bidding(String us) {
		
		Scanner sc = new Scanner(System.in);
		String w7,w2,w1,w3;
		System.out.print("Please Bid for the Project : Enter the Project Name:   ");
		System.out.println("------------------------------------------------------\n");
		
		//w7=sc.nextLine();
		w1=sc.nextLine();
		System.out.println();
		
		System.out.print("Budget for the Project : ");
		//String w2;
		//w3=sc.next();
		w2=sc.nextLine();
		System.out.println();
		
		String url= "jdbc:mysql://localhost:3306/eee";
		String uname = "root";
		String pass1 = "shakil**";
		
		try {
			Connection connection = DriverManager.getConnection(url, uname, pass1);
		
		String sql4="INSERT INTO user_bidding (User_id,Project_name,Budget_for_the_Project) VALUES(?,?,?)";
		PreparedStatement statement4 = connection.prepareStatement(sql4);
		
		//statement.setInt(1, 44);
		
		statement4.setString(1, us);
		statement4.setString(2, w1);
		statement4.setString(3, w2);
		
		
		
		int rows4=statement4.executeUpdate();
		//System.out.println(rows4);
		
		if(rows4>0) {
			System.out.println("A row has been inserted\n\n");
		}
		
		statement4.close();
		connection.close();
		
		} catch (SQLException e) {     
			// TODO Auto-generated catch block
			System.out.println("Error");
			e.printStackTrace();
		}
			
		
	}

}
