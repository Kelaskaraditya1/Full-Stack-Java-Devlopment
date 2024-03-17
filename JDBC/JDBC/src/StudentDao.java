import java.sql.*;
import java.util.*;
public class StudentDao
{
    public static final String URL="jdbc:mysql://localhost:3306/grocery";
    public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    public static final String USERNAME="root";
    public static final String PASSWORD="9819375722Aditya";
    public static final String SEARCH_QUERY="select Customer_name,Customer_Age,Customer_Contact from customer where Customer_id=?;";
    public static final String INSERT_QUERY="insert into customer values(?,?,?,?,?);";
public static Student getInfo(int sid)
{
    Student student = new Student();
    try {
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        Statement statement = connection.createStatement();
        String SEARCH_QUERY="select Customer_name,Customer_Age,Customer_Contact,Customer_nationality from customer where Customer_id="+sid+";";
        ResultSet set = statement.executeQuery(SEARCH_QUERY);
        set.next();
        student.setName(set.getString("Customer_name"));
        student.setAge(set.getInt("Customer_Age"));
        student.setContact(set.getString("Customer_Contact"));
        student.setNationality(set.getString("Customer_nationality"));
        statement.close();
        connection.close();
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return student;
}
public static void insertStudent(Student student)
{
    try
    {
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        PreparedStatement statement = connection.prepareStatement(INSERT_QUERY);
        statement.setInt(1,student.getSid());
        statement.setString(2,student.getName());
        statement.setInt(3,student.getAge());
        statement.setString(4,student.getContact());
        statement.setString(5,student.getNationality());
        statement.executeUpdate();
        statement.close();
        connection.close();
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
}

public StudentDao()
{}

}
