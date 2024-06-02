package CustomException.VotingAge;

public class TestVoting {

    public void m1(int age)throws AgeVotingIssue
    {
        System.out.println("m1-start");

        if(age <20)
            throw new AgeVotingIssue("Age is too low");
    }

    public static void main(String[] args) {

        TestVoting tv = new TestVoting();

        try
        {
            tv.m1(21);
        }
        catch (AgeVotingIssue e)
        {
            System.out.println(e.getMessage());
        }
    }
}
