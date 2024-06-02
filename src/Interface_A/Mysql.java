package Interface_A;

public class Mysql implements Connection {

    @Override
    public void commite() {
        System.out.println("Mysql commite");
    }

    @Override
    public void rollback() {
        System.out.println("Mysql rollback");
    }
}
