package Javaproject.service;

import Javaproject.Batch;
import Javaproject.Cource;
import Javaproject.Faculty;
import Javaproject.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aurangabad implements MIT{

    List<Cource> clist = new ArrayList<>();
    List<Faculty> flist = new ArrayList<>();
    List<Student> slist = new ArrayList<>();
    List<Batch> blist = new ArrayList<>();
    //java.util.Scanner sc = new Scanner(System.in);
    java.util.Scanner sc = new Scanner(System.in);

    @Override
    public void addCourse() {
        Cource c = new Cource();
        System.out.println("enter cource id");
        c.setCid(sc.nextInt());
        sc.nextLine();
        System.out.println("enter cource name");
        c.setCname(sc.nextLine());
        clist.add(c);

    }

    @Override
    public void viewCourse() {
        for(Cource c : clist)
        {
            System.out.println(c);
        }

    }

    @Override
    public void addBatch() {
        Faculty f = new Faculty();
        System.out.println("enter faculty id");
        f.setFid(sc.nextInt());
        sc.nextLine();
        System.out.println("enter faculty name");
        f.setFname(sc.nextLine());
        flist.add(f);
        flist.add(f);

    }

    @Override
    public void viewBatch() {
        for(Faculty f : flist)
        {
            System.out.println(f);
        }

    }

    @Override
    public void addStudent() {
        Student s = new Student();
        System.out.println("enter student id");
        s.setSid(sc.nextInt());
        sc.nextLine();
        System.out.println("enter student name");
        s.setSname(sc.nextLine());
        slist.add(s);

    }

    @Override
    public void viewStudent() {

        for(Student s : slist)
        {
            System.out.println(s);
    }
}

    @Override
    public void addFaculty() {
        Faculty f = new Faculty();
        System.out.println("enter faculty id");
        f.setFid(sc.nextInt());
        sc.nextLine();
        System.out.println("enter faculty name");
        f.setFname(sc.nextLine());
        flist.add(f);
    }

    @Override
    public void viewFaculty() {
        for(Faculty f : flist)
        {
            System.out.println(f);
        }
    }
}
