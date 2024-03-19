public class Querys
{
    public static final String INSERT_QUERY="insert into customer values(?,?,?,?,?);";
    public static final String SHOW_ALL_QUERY="select * from customer;";
    public static final String UPDATE_QUERY="update customer set CustomerName=?,CustomerAge=?,CustomerContact=?,CustomerNationality=? where CustomerId=?;";
    public static final String DELETE_QUERY="delete from customer where CustomerId=?;";
}
