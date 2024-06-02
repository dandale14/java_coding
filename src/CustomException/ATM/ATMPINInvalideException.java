package CustomException.ATM;

public class ATMPINInvalideException extends Exception{
    public ATMPINInvalideException (String sms)
    {
        super(sms);
    }
}
