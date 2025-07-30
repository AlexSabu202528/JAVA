class Student
{
	String name;
	int roll_number;
	int mark1;
	int mark2;
	int mark3;
	float avg;
	Student(String name,int roll_number,int mark1,int mark2,int mark3)
	{
		this.name=name;
		this.roll_number=roll_number;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	public void Calculate_average()
	{
		avg = (mark1+mark2+mark3)/3;
	}
	public void Display_Details()
	{
		System.out.println("Name:"+name);
		System.out.println("Roll Number:"+roll_number);
		System.out.println("Mark1:"+mark1);
		System.out.println("Mark2:"+mark2);
		System.out.println("Mark3:"+mark3);
		System.out.println("Average:"+avg);
	}

}
public class Student_constructor 
{
	public static void main(String args[])
	{
		Student student1 = new Student("Alwin",18,90,99,98);
		student1.Calculate_average();
		student1.Display_Details();
		Student student2 = new Student("Anugrah",26,80,84,90);
		student2.Calculate_average();
		student2.Display_Details();
		Student student3 = new Student("Davis",34,90,91,70);
		student3.Calculate_average();
		student3.Display_Details();
	}

}
