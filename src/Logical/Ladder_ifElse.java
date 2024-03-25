package Logical;

public class Ladder_ifElse {

    int math = 55;
    int physic = 66;
    int chemistry=80;
    float total;
    float percentage;
     public void Markaddition()
     {
         total = math+physic+chemistry;
         System.out.println(total);
         percentage = total/3;
         System.out.println(percentage);
         if(percentage >75)
         {
             System.out.println("Distictions");
         } else if (percentage >60 && percentage <75) {
             System.out.println("1st class");
             
         } else if (percentage <45 && percentage<50 ) {
             System.out.println("2nd class");

         }
         else {
             System.out.println("fail");
         }

     }

    public static void main(String[] args) {
        System.out.println("student marks details");
        Ladder_ifElse p = new Ladder_ifElse();
        p.Markaddition();

    }
}
