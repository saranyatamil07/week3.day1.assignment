package week3.day1.assignment;

public class Students {
	public void getStudentInfo(int id)
	{
		
	System.out.println("student id is " +id);	
	}
	public void getStudentInfo(int id, String name)
	{
	System.out.println("student id and name is "+id+" "+name);	
	}
	public void getStudentInfo(String email,long number)
	{
	System.out.println("student mailid and mob number is "+email+" "+number);	
	}
	
public static void main(String[] args )
{
	Students stud=new Students();
	stud.getStudentInfo(100);
	stud.getStudentInfo(200, "saranya");
	stud.getStudentInfo("saran@gmail.com", 996554477);
}
}
