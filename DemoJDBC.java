
import java.sql.*;
import java.sql.DriverManager;


public class DemoJDBC
{
    public static void main(String[] args) throws Exception
    {
        String url="jdbc:mysql://localhost:3306/university?useSSL=false";
        String uname="root";
        String pass="sigma@321";
        String query="select * from dept";
        
        
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con=DriverManager.getConnection(url, uname, pass);
       PreparedStatement st=con.prepareStatement(query);
       ResultSet rs= st.executeQuery();
       
       while(rs.next())
       {
           String userData=rs.getString(1)+"    "+rs.getInt(2);
           System.out.println(userData);
       }
       
      
        int id=10;
        String name="NewJDBC1";
        String query1="insert into dept values(?,?)";
        PreparedStatement stmt=con.prepareStatement(query1);
        stmt.setString(1,name);
        stmt.setInt(2,id);
        int count= stmt.executeUpdate();
        System.out.println(count+" row/s updated successfully");
        st.close();
        con.close();
        
       
        //batch method
        String query2="insert into dept values(?,?)";
        PreparedStatement ps=con.prepareStatement(query2);
        con.setAutoCommit(false);
        ps.setString(1,"added with btach");
        ps.setInt(2,12);
        ps.addBatch();
        
        ps.setString(1,"added with btach2");
        ps.setInt(2,13);
        ps.addBatch();
        
        ps.setString(1,"added with btach3");
        ps.setInt(2,14);
        ps.addBatch();
        
        int []coun=ps.executeBatch();
        con.commit();
    }
    
}
