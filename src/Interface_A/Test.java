package Interface_A;

public class Test {
    public static void main(String[] args) {

        Connection con = new Mysql();
        con.commite();
        con.rollback();

        Connection con1 = new Oracle();
        con1.commite();
        con1.rollback();


    }
}
