import java.sql.*;
public class UserDao
{
    public static final String DRIVER_PATH="com.mysql.cj.jdbc.Driver";
    public static final String URL="jdbc:mysql://localhost:3306/grocery";
    public static final String USERNAME="root";
    public static final String PASSWORD="9819375722Aditya";

    public static void insertUser(User user)
    {
        try {
            Class.forName(DRIVER_PATH);
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            PreparedStatement statement = connection.prepareStatement(Querys.INSERT_QUERY);
            statement.setInt(1,user.getSid());
            statement.setString(2,user.getName());
            statement.setInt(3,user.getAge());
            statement.setString(4,user.getContact());
            statement.setString(5,user.getNationality());
            statement.executeUpdate();
            statement.close();
            connection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    public static void showUsers()
    {
        try {
            Class.forName(DRIVER_PATH);
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery(Querys.SHOW_ALL_QUERY);
            while(set.next())
                System.out.println("CustomerName: "+set.getString("CustomerName")+" CustomerAge: "+set.getInt("CustomerAge")+" CustomerContact: "+set.getString("CustomerContact")
                +" CustomerNationality: "+set.getString("CustomerNationality"));
            statement.close();
            connection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void updateUser(User user,int sid)
    {
        try {
            Class.forName(DRIVER_PATH);
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            PreparedStatement statement = connection.prepareStatement(Querys.UPDATE_QUERY);
            statement.setString(1,user.getName());
            statement.setInt(2,user.getAge());
            statement.setString(3,user.getContact());
            statement.setString(4,user.getNationality());
            statement.setInt(5,sid);
            statement.executeUpdate();
            statement.close();
            connection.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void deleteQuery(int sid)
    {
        try
        {
            Class.forName(DRIVER_PATH);
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            PreparedStatement statement = connection.prepareStatement(Querys.DELETE_QUERY);
            statement.setInt(1,sid);
            statement.executeUpdate();
            statement.close();
            connection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
