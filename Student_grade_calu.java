import java.util.*;
class task
{
	String name;
	int py,nt,st,os,wt;
	double  avg;
	int total;
	Scanner sc = new Scanner(System.in);
	public void input()
	{
		System.out.println(" Student Grade Calulator System");
		System.out.println("Enter a name of student :-");
		name=sc.next();
		System.out.println("Enter Subject Marks ");
		System.out.println("Python Programming :-");
		py=sc.nextInt();
		System.out.println("Networking :-");
		nt=sc.nextInt();
		System.out.println("Software Testing :-");
		st=sc.nextInt();
		System.out.println("Operating System :-");
		os=sc.nextInt();
		System.out.println("Web Technology :-");
		wt=sc.nextInt();
	}
	public void totalmarks()
	{
		total=py+nt+st+os+wt;
	}
	public void avg_per()
	{
		avg=total/5.0;
	}
	public void grade_cal()
	{
		System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
	}
	public void dis_res()
	{
		System.out.println("Student Name :- "+name);
		System.out.println("Total Subject Marks :- "+total);	
		System.out.println("Average Percentage :-"+avg);	
	}
}
class Student_grade_calu
{
public static void main(String args[])
{
	task t1=new task();
	t1.input();
	t1.totalmarks();
	t1.avg_per();
	t1.dis_res();
	t1.grade_cal();
}
}