package Collection;

public class Employee {
    private int id;
    private String ename;
    private double esalary;
    private String addr;
    private long mb;
    private String designation;
    private String gender;

    public int getId(){
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getEname (String Ename)
    {
        return Ename;
    }
    public void setEname(String ename)
    {
        this.ename=ename;
    }

    public double getEsalary() {
        return esalary;
    }
    public void setEsalary(double esalary)
    {
        this.esalary=esalary;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    public long getMb()
    {
        return mb;
    }

    public void setMb(long mb) {
        this.mb = mb;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
