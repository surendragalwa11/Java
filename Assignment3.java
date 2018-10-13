import java.sql.*;
/*
Commit is used to group the queries together and don't let them run/change database automatically until you commit these
Rollback is used when you wan't to commit only when no exception occures so in catch block you can rollback your transation as it will run only when exception occurs
Rollback is used before commit statement.
*/
public class Assignment3
{

   
    public static void main(String[] args) throws Exception
    {
         String url="jdbc:mysql://localhost:3306/JDBC?useSSL=false";  //here JDBC is name of database
       String uname="root";
       String pas="sigma@321";
       
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,uname,pas);
       con.setAutoCommit(false);
       
       /*
       String query1="create table Assignment3(ISBN varchar(10),title varchar(20),Price double)";
       PreparedStatement ps=con.prepareStatement(query1);
       ps.executeUpdate();
       */
       
       String query2="insert into Assignment3 values('Isbn001','Engineering',1200),('Isbn002','Commerce',1140),('Isbn003','Arts',950),('Isbn004','Science',1000),('Isbn005','Mathametics',1290)";
       PreparedStatement ps1=con.prepareStatement(query2);
       ps1.executeUpdate();
       
      // String query3="select * from Assignment3";
      // PreparedStatement ps2=con.prepareStatement(query3);
      // ResultSet rs2=ps2.executeQuery();
      //con.rollback();  
                           //rollback always works before commit,after commit we can't rollback that transaction
        con.commit();     //if you'll comment this statement then these queries won't work means theses values won't added to database
       /*
        while(rs2.next())
        {
            String ISBN=rs2.getString("ISBN");
            String title=rs2.getString(2);
            Double price=rs2.getDouble("Price");
            
            System.out.println(ISBN +"  "+title+"  "+price);
        }
       */
       //always measure changes in database,if you'll try to measure changes here then it won't because we are extracting values from resultset and printing
       //commit don't stop resultset to get values.It just control the enteries to database and don't let enter to the database
    }
    
}
