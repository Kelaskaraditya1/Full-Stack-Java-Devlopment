public class User
{
    public int sid,age;
    public String name,contact,nationality;
    public User(int sid,String name,String contact,String nationality,int age)
    {
        this.sid=sid;
        this.name=name;
        this.contact=contact;
        this.nationality=nationality;
        this.age=age;
    }
    public User(String name,String contact,String nationality,int age)
    {
        this.name=name;
        this.contact=contact;
        this.nationality=nationality;
        this.age=age;
    }
    public User()
    {}

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
