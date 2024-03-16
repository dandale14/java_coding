package Demo;

public class Company {

    String cname;
    int cid;
    long cmomno;
    String addr;

    public  Company(String cname,int cid,long cmomno,String addr)
    {
      this.cname = cname;
      this.cid=cid;
      this.cmomno=cmomno;
      this.addr=addr;

      System.out.println(cname);
        System.out.println(cid);
        System.out.println(cmomno);
        System.out.println(addr);

    }
}



