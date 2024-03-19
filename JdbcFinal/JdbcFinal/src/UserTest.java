public class UserTest
{
    public static void main(String[] args)
    {
        User user = new User(32,"Mayur Khatal","9545651254","Indian",22);
        UserDao.insertUser(user);
        User aditya = new User("Aditya","8591059220","Indian",22);
//        UserDao.updateUser(aditya,31);
//        UserDao.deleteQuery(31);
        UserDao.showUsers();

    }
}
