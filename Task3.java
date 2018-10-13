import java.sql.DriverManager;
import java.sql.*;


public class Task3
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
       String query1="create table BookTask3(ISBN varchar(10),title varchar(20),Price double)";
       PreparedStatement ps=con.prepareStatement(query1);
       ps.executeUpdate();
        */
       
       //inserting valued into Book table
       /*
       String query2="insert into BookTask3 values('Isbn001','Engineering',1200),('Isbn002','Commerce',1140),('Isbn003','Arts',950),('Isbn004','Science',1000),('Isbn005','Mathametics',1290)";
       PreparedStatement ps1=con.prepareStatement(query2);
       ps1.executeUpdate();
       */
       
       //printing BookTask3 table
       
       String query3="select * from BookTask3";
       String query4="insert into BookTask3 values('Isbn011','Management',7200)";
       String query5="insert into ookTask3 values('Isbn012','Agriculture',600)";
       
       /*
       PreparedStatement ps3=con.prepareStatement(query3);
       PreparedStatement ps4=con.prepareStatement(query4);
       PreparedStatement ps5=con.prepareStatement(query5);
       */
       Statement cs3=con.createStatement();
       Statement cs4=con.createStatement();
       Statement cs5=con.createStatement();
       
       
       ResultSet rs3=cs3.executeQuery(query3);
       
       System.out.println("Data before commit:\n ");
        while(rs3.next())
        {
            String ISBN=rs3.getString("ISBN");
            String title=rs3.getString(2);
            Double price=rs3.getDouble("Price");
            
            System.out.println(ISBN +"  "+title+"  "+price);
        }
       
       
       
        //Transaction
        //Connection con1=DriverManager.getConnection(url,uname,pas);
        
       //exception occured and rollback worked because in qury 5 we are using ookTable which doesn't exist
       try    
       {
         cs4.executeUpdate(query4);
         System.out.println("First entery added");
         cs5.executeUpdate(query5);
         //ResultSet rs4=cs3.executeQuery(query3);
         System.out.println("Second entery added");
       }
       catch(Exception e)
       {
        
        con.rollback();
        System.out.println("Eception occured and we've rolled back the transaction");
         
       }
       con.commit();
       /*
        System.out.println("\n\nData before commit true:\n ");
        while(rs4.next())
        {
            String ISBN=rs4.getString("ISBN");
            String title=rs4.getString(2);
            Double price=rs4.getDouble("Price");
            
            System.out.println(ISBN +"  "+title+"  "+price);
        }
*/
        con.close();
    }
    
}
