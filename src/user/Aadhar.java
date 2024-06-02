package user;

public class Aadhar {
    long adharNumber;
    String firstName;
    String lastName;
    String dateOfBirth;
    String address;

    public Aadhar(long adharNumber, String firstName, String lastName, String dateOfBirth, String address) {
        this.adharNumber = adharNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public  Aadhar() {
    }

    public void Detail() {
        Aadhar a = new Aadhar(233234424l, "Kailas", "Dandale", "03/09/1997", "khalyal gsvhsn");
        System.out.println(a.firstName);
        System.out.println(a.lastName);
        System.out.println(a.dateOfBirth);
        System.out.println(a.adharNumber);
        System.out.println(a.address);

    }

    public static void main(String[] args) {
        Aadhar aadhar = new Aadhar();
        aadhar.Detail();

    }
}
