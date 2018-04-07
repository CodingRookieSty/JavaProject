package java_fund_10;

public class MyCourse {
	private String courseName;
	private String[] students;
	int numberofstudents;
	
	public MyCourse()
	{
		this.courseName = "Math";
		this.students = new String[16];
		this.numberofstudents = 0;
	}
	
	public MyCourse(String courseName)
	{
		this.courseName = courseName;
		this.students = new String[16];;
		this.numberofstudents =  0;
	}
	
	public String getCourseName()
	{
		return this.courseName;
	}
	
	public void addStudent(String student)
	{
		students[numberofstudents++] = student;
	}
	
	public void dropStudent(String student)
	{
		for (int i = 0; i < numberofstudents; i++)
		{
			if (students[i].equals(student))
			{
				for (int j = i + 1; j < numberofstudents; j++)
				{
					students[j - 1] = students[j];
				}
				
				this.numberofstudents--;
				this.students[numberofstudents] = null;
			}
		}
	}
	
	public int getNumberOfStudents()
	{
		return this.numberofstudents;
	}
	
	public void enlargeStudents(int largeSize)
	{
		String[] newStudents = new String[largeSize + this.students.length];
		
		for (int i = 0; i < this.students.length; i++)
		{
			newStudents[i] = this.students[i];
			this.students = newStudents;
		}
	}
	
	public void clean()
	{
		int i = 0;
		
		for (i = 0; i < this.students.length; i++)
		{
			students[i] = null;
		}
		
		this.numberofstudents = 0;
	}
	
	public void showStudents()
	{
		for (int i = 0; i < this.students.length; i++)
		{
			System.out.print(students[i] + " ");
		}
		
		System.out.print("\n");
	}
	
	public static void main(String[] args)
	{
		MyCourse course = new MyCourse("Art");
		course.addStudent("liliao");
		course.addStudent("maoyutian");
		course.addStudent("wuyiming");
		
		course.dropStudent("liliao");
		course.addStudent("xietingfeng");
		
		course.showStudents();
	}
}
