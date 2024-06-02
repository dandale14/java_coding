package Interface_A;

public class Oracle implements Connection{

    @Override
    public void commite() {
        System.out.println("Oracle commite");
    }

    @Override
    public void rollback() {
        System.out.println("Oracle rollback");
    }
}
