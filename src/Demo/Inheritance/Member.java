package Demo.Inheritance;

public class Member {

    String name;
    int age;
    String phoneNo;
    String address;

    public Member(String name,int age,String phoneNo,String address)
    {
        this.name=name;
        this.age=age;
        this.phoneNo=phoneNo;
        this.address=address;

    }
    public void salary (double salary)
    {
        System.out.println("salary is :" + salary);
    }
}
