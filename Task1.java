import java.util.*;
import java.sql.*;

public class Task1
{

   
    public static void main(String[] args) throws Exception
    {
       //System.out.println("Creating databse and inserting values");
       Scanner sc=new Scanner(System.in);
       
       /* 
       String url="jdbc:mysql://localhost:3306/";
       String uname="root";
       String pas="sigma@321";
       
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,uname,pas);
       
       String query= "create database JDBC";
       PreparedStatement ps=con.prepareStatement(query);
       
       ps.executeUpdate();
       System.out.println("JDBC database created");  */
      
       //crating book table in JDBC database
       
       String url="jdbc:mysql://localhost:3306/JDBC?useSSL=false";  //here JDBC is name of database
       String uname="root";
       String pas="sigma@321";
       
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,uname,pas);
       /*
       String query1="create table Book(ISBN int,title varchar(20),Price double)";
       PreparedStatement ps=con.prepareStatement(query1);
       ps.executeUpdate();
      */
       
       //inserting valued into Book table
       /*
       String query2="insert into Book values(1112,'Engineering',1200),(1113,'Commerce',1140),(1114,'Arts',950),(1115,'Science',1000),(1116,'Mathametics',1290)";
       PreparedStatement ps1=con.prepareStatement(query2);
       ps1.executeUpdate();
      */
       
       //selecting values and printing 
       /*
       String query3="select * from Book";
       PreparedStatement ps3=con.prepareStatement(query3);
       ResultSet rs3=ps3.executeQuery();
        while(rs3.next())
        {
            int ISBN=rs3.getInt("ISBN");
            String title=rs3.getString(2);
            Double price=rs3.getDouble("Price");
            
            System.out.println(ISBN +"  "+title+"  "+price);
        }
       */
       
        
       //finding book by isbn number and printing message if no found
      
       System.out.println("Enter ISBN number to find book details: ");
       int a=sc.nextInt();
       /*
       //method 1       
       
       String query4="select * from Book where ISBN="+a;
       PreparedStatement ps4=con.prepareStatement(query4);
       ResultSet rs4=ps4.executeQuery();
       
       if(rs4.next()==false)
       {
               System.out.println("Sorry! No book available with this ISBN.");
       }
       else
       { 
          System.out.println("\nBook found Details are: ");
         do
         {  int ISBN=rs4.getInt("ISBN");
            String title=rs4.getString(2);
            Double price=rs4.getDouble("Price");
            
            System.out.println(ISBN +"  "+title+"  "+price);
         } 
         while (rs4.next()); 
       }

       */
       
       //method if 
       String query5="select * from Book ";
       PreparedStatement ps5=con.prepareStatement(query5);
       ResultSet rs5=ps5.executeQuery();
       int flag=0;
       
       while(rs5.next())
       {
           if(rs5.getInt(1)==a)             //equals() for string
           {
             flag=1;
             int ISBN=rs5.getInt("ISBN");
             String title=rs5.getString(2);
             Double price=rs5.getDouble("Price");
            
             System.out.println(ISBN +"  "+title+"  "+price);
           }
       }
       if(flag==0)
       {
           System.out.println("Sorry! No book available with this ISBN.");
       }
       
    }
    
}
