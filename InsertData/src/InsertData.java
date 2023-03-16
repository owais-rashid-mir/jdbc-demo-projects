import java.sql.*;
public class InsertData {

    public static void main(String[] args) {
        
    	//try-catch for handling exceptions.
        try {
        //Get a connection to the database.	
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase" , "root" , "siawo");
		
		//create a Statement
		Statement myStmt = myConn.createStatement();
		
		//execute SQL query. 
		String sql = "insert into student"
					+ " (id, fname, lname, age) "
					+ " values (7 , 'Mudasir' , 'Najar' , 23) ";  //or u could write this in 1 line also,remove
																	// + in that case.
		
		myStmt.executeUpdate(sql);
		
		System.out.println("Insert complete.");
                
	    }
		
		catch(Exception exc){
			exc.printStackTrace();
		}
        
        
    }
    
}
