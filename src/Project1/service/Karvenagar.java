package Project1.service;

import Project1.Batch;
import Project1.Cource;
import Project1.Faculty;
import Project1.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Karvenagar implements CJC {


    List<Cource> clist = new ArrayList<>();
    List<Faculty> flist = new ArrayList<>();
    List<Batch> blist = new ArrayList<>();
    List<Student> slist = new ArrayList<>();

    java.util.Scanner sc = new Scanner(System.in);
    @Override
    public void addCourse() {
        Cource c = new Cource();
        System.out.print("Enter Course ID: ");
        //c.setCid(sc.nextInt());
        c.setCid(sc.nextInt());
        sc.nextLine();  // consume newline
        System.out.print("Enter Course Name: ");
        c.setCname(sc.nextLine());
        clist.add(c);
    }

    @Override
    public void viewCourse() {
        for (Cource c : clist) {
           // System.out.println("Course ID: " + c.getCid() + ", Course Name: " + c.getCname());
            System.out.println(c);
        }
    }

    @Override
    public void addFaculty() {
        Faculty f = new Faculty();
        System.out.print("Enter Faculty ID: ");
        f.setFid(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Faculty Name: ");
        f.setFname(sc.nextLine());
        addCourse();
       f.setCourse(clist.get(clist.size() - 1));
        flist.add(f);
    }

    @Override
    public void viewFaculty() {
        for (Faculty f : flist) {
            //System.out.println("Faculty ID: " + f.getFid() + ", Faculty Name: " + f.getFname() + ", Course: " + f.getCourse().getCname());
            System.out.println(f);
        }
    }

    @Override
    public void addBatch() {
        Batch b = new Batch();
        System.out.print("Enter Batch ID: ");
        b.setBid(sc.nextInt());
        sc.nextLine();  // consume newline
        System.out.print("Enter Batch Name: ");
        b.setBname(sc.nextLine());
        addFaculty(); // Assume a batch must be associated with a faculty
        b.setFaculty(flist.get(flist.size() - 1));
        blist.add(b);
    }

    @Override
    public void viewBatch() {
        for (Batch b : blist) {
           // System.out.println("Batch ID: " + b.getBid() + ", Batch Name: " + b.getBname() + ", Faculty: " + b.getFaculty().getFname());
            System.out.println(b);
        }

    }

    @Override
    public void addStudent() {
        Student s = new Student();
        System.out.print("Enter Student ID: ");
        s.setSid(sc.nextInt());
        sc.nextLine();  // consume newline
        System.out.print("Enter Student Name: ");
        s.setSname(sc.nextLine());
        addBatch(); // Assume a student must be associated with a batch
        s.setBatch(blist.get(blist.size() - 1));
        slist.add(s);
    }

    @Override
    public void viewStudent() {
        for (Student s : slist) {
           // System.out.println("Student ID: " + s.getSid() + ", Student Name: " + s.getSname() + ", Batch: " + s.getBatch().getBname());
            System.out.println(s);
        }
    }
}

