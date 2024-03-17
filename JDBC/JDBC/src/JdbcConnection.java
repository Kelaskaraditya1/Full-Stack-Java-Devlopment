import java.sql.*;
import java.util.*;
public class JdbcConnection
{
    public static final String URL="jdbc:mysql://localhost:3306/grocery";
    public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    public static final String USERNAME="root";
    public static final String PASSWORD="9819375722Aditya";
    public static final String QUERY="select Customer_name,Customer_Age,Customer_Contact from customer where Customer_id=6;";
    public static final String SELECT_QUERY="Select * from customer;";
    public static final String INSERT_QUERY="insert into customer values(?,?,?,?,?);";
    public static void fetch_data()
    {
        try
        {
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            Statement selectStatement = connection.createStatement();
            ResultSet set = selectStatement.executeQuery(SELECT_QUERY);
            while(set.next())
                System.out.println("Name: "+set.getString("Customer_name")+" "+" Age: "+set.getString("Customer_Age"));
            selectStatement.close();
            connection.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void insert_data(int user_id,String name,int age,String contact,String nationality)
    {
        try {
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            PreparedStatement statement = connection.prepareStatement(INSERT_QUERY);
            statement.setInt(1,user_id);
            statement.setString(2,name);
            statement.setInt(3,age);
            statement.setString(4,contact);
            statement.setString(5,nationality);
            statement.executeUpdate();
            statement.close();
            connection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)
    {
        insert_data(31,"Aditya",21,"8591059220","Indian");
        fetch_data();
    }
}
