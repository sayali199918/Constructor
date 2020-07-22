class Student
{
	String name;
	int student_id;

	Student(String name, int student_id)
	{
		this.name=name;
		this.student_id=student_id;
	}

	public static void main(String[] args)
	{
		Student s1=new Student("Tom",101);
		Student s2=new Student("Jerry",102);
		System.out.println("Student 1 : "+s1.name+" "+s1.student_id);
		System.out.println("Student 2 : "+s2.name+" "+s2.student_id);
	}
}
