import java.sql.*;
public class Connect {
     private byte[] picture;
      public static Connection ConnectDB(){
       try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/banana";
            Connection con=DriverManager.getConnection(url,"root","123456789");
            return con;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
     public Connect(byte[]pimg){
        this.picture = pimg;
    } 
    public byte[] getImage(){
        return picture;
    }
}
