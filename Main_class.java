package tendering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.sql.*;

public class Main_class {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
	
	
	while(true) {	
	
	System.out.println("\t\t\t----------------------------------------------------\n\n");
	System.out.println("\t\t\t    Welcome to the login page                       \n\n ");
	System.out.println("\t\t\t                MENU                                 \n");
	System.out.println("                                                           \n");
	
	
	System.out.println(" Press 1 to LOGIN                                           ") ;
	System.out.println(" Press 2 to REGISTER                                        ");
	System.out.println(" Press 3 to ADMIN LOGIN                                     ");
	System.out.println(" Press 4 to Exit                                             ");
	System.out.print(" Please Enter Your Choice: ");
	
	
	
		
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b,y=0,l;
	
	PP1 obj1 = new PP1();
	PP2 obj2 = new PP2();
	PP3 obj3 = new PP3();
	
	switch(a) {
	
	case 1:
		b=obj1.login();
		
		
	if(b==1) {
		System.out.println("                       ");
		System.out.println("| Please register for login |");
		System.out.println("-----------------------------\n\n");
		
		continue;
	}
	
	else if(b==0) {
		System.out.println(" You want this MENU again?\n");
		System.out.println(" IF your answer is yes : Press 1 ");
		System.out.println(" Else Press 2 ");
		
		
		y=sc.nextInt();
		if(y==1) {
			continue;
		}
		
	}
	
	break;
	
	case 2:
		obj2.register();
		System.out.println(" IF you want login to the page ,  Press 1 for the Menu:  ");
		
		int q;
		q=sc.nextInt();
		
		if(q==1) {
			continue;
		}
		
		break;
		
	case 3:
		obj3.adminlogin();
		
		
	
		
		
		
		
	}
	
	if(y==2)break;
	
	}
	
		
	}

}
