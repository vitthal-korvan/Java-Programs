package Satya_Technology_Classes_Programs;

import java.util.Scanner;

class Student{
    int rollno;
    String name;
    Student(int rno,String nm){
        rollno=rno;
        name=nm;
    }
}
class StudentArray{
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        Scanner sc = new Scanner(System.in);
        Student a[]=new Student[5];
        a[0]=new Student(1,"Sachin");
        a[1]=new Student(2,"Kapil");
        a[2]=new Student(3,"Dhoni");
        a[3]=new Student(4,"Rohit");
        a[4]=new Student(5,"Virat");
        for (int i=0;i<=a.length;i++)
            System.out.println(a[i].rollno+" "+a[i].name);
    }
}
