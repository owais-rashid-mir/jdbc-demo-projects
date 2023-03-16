import java.sql.*;
public class PreparedStatements {

    public static void main(String[] args) throws SQLException{
    	
        try {
        //Get a connection to the database.
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase" , "root" , "siawo");
		
		//create a Prepared Statement
		PreparedStatement myStmt = myConn.prepareStatement("select * from student where fname = ? and age = ?");
		
		//set the parameters
		myStmt.setString(1, "Owais");
		myStmt.setInt(2, 22);
		
		//execute sql query
		ResultSet myRs  = myStmt.executeQuery();
		
		//display the Result Set
		while(myRs.next()) {
			System.out.println(myRs.getString("fname") + " , " + myRs.getString("age") );
		}
		
		//display(myRs);  - according to tutorial, this line is written instead of while() lines, but it throws an error.
           
		// --------------------------------------
		

        //Reusing the Prepared Statement
        System.out.println("Reusing the Prepared Statement. fname = suhail ,  age =22");
        
        //set the parameters
      		myStmt.setString(1, "Suhail");
      		myStmt.setInt(2, 22);
      		
      		//execute sql query
      		myRs  = myStmt.executeQuery();
      		
      		//display the Result Set
      		while(myRs.next()) {
      			System.out.println(myRs.getString("fname") + " , " + myRs.getString("age") );
      		}
		
		
		
	    } //end of try
        
		catch(Exception exc){
			exc.printStackTrace();
		}
        
        
    }
    
}
