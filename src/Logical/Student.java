package Logical;

public class Student {
    public static void main(String[] args) {
        int physic = 85;
        int math=75;
        int biology=90;

        float totalMarks = physic+math+biology;
        System.out.println(totalMarks);

        float percentage = totalMarks /3f;
        System.out.println(percentage);
        char gread;

        if(percentage >=90)
        {
            gread='A';

        } else if (percentage >= 80) {
            gread='b';
        } else if (percentage >=70) {
            gread ='c';

        } else if (percentage>=50) {
            gread='d';

        }
        else {
            gread='e';
        }
        System.out.println("percentage :"+ percentage + "%");
        System.out.println("grade :"+gread);
    }


}
