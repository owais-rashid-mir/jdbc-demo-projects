package jdbcdemo;

import java.sql.*;
public class jdbcdemo {

    public static void main(String[] args) {
        
    	//try-catch for handling exceptions.
        try {
        //Get a connection to the database.	'mydatabase' is the name of DB schema. 'root' and 'siawo' are
        //...MySQL Workbench's user name and password.
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase" , "root" , "siawo");
		
		//create a Statement
		Statement myStmt = myConn.createStatement();
		
		//execute SQL query. 'student' is the table under 'mydatabase' DB schema in MySql WB.
		ResultSet myRs = myStmt.executeQuery("select * from student");
				
		//process the result set. 'id' and 'fname' from  'student' table would be printed in Eclipse's 
		//output window.
		while(myRs.next()) {
				System.out.println(myRs.getString("id") + " , " + myRs.getString("fname") + " , " + myRs.getString("lname") + " , " + myRs.getString("age") );
		}
                
	    }
		
		catch(Exception exc){
			exc.printStackTrace();
		}
        
        
    }
    
}
