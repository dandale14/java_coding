package CustomException;

public class AgeInvalideException extends Exception{

    public AgeInvalideException()
    {

    }
    public AgeInvalideException(String msg)
    {
        super(msg);
    }
}
