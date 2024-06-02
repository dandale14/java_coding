package CustomException.ATM;

public class TestATM {

    public void m1(int no)throws ATMPINInvalideException
    {
        throw new ATMPINInvalideException("Wrong PIN");
    }

}
