package day2lab;

import java.util.Scanner;

public class StudentGrade
{
	public static void student1()
	{
		String name;
	    int rollno;
	    double total;
	    String grade;
	    int marks;double percent;int m1,m2,m3,m4,m5;
	    Scanner s=new Scanner(System.in);
	    
	    System.out.println("Name of Student");
	    name=s.next();
	    System.out.println("Roll no.");
	    rollno=s.nextInt();
	    System.out.println("Marks in m1");
	    m1=s.nextInt();
	    System.out.println("Marks in M2");
	    m2=s.nextInt();
	    System.out.println("Marks in M3");
	    m3=s.nextInt();
	    System.out.println("Marks in M4");
	    m4=s.nextInt();
	    System.out.println("Marks in M5");
	    m5=s.nextInt();
	    
	    
	    
	    total=m1+m2+m3+m4+m5;
	    
	    
	    percent=total/5;
	    
	    
	    if(percent>75)
	    
	    	grade="A";
	    
	    else if(percent<74 && percent>60)
	    
	    	grade="B";
	    
	    else
	    
	    	grade="c";
	    
	    System.out.println("Name of Student is: "+name);
	    System.out.println("Roll No. of Student is: "+rollno);
	    System.out.println("Total Marks of Student is: "+total);
	    System.out.println("Percentege of Student: "+percent);
	    System.out.println("Grade of Student: "+grade);
	   
	}
    public static void main(String args[])
    {
    
        student1();
    }
}