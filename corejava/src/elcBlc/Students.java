package elcBlc;

public class Students {
	private int id;
	private int rollno;
	private String name;
	
	public int getId() {
		return id;
	}
	public int getRollNo() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public void setId(int sid) {
		id=sid;
	}
	public void setRollNo(int rno) {
		rollno=rno;
	}
	public void setName(String sname) {
		name=sname;
	}
	public static Students getStudentDetails(int id, int rollno,String name) {
		Students stu=new Students();
		stu.setId(id);
		stu.setRollNo(rollno);
		stu.setName(name);
		return stu;
		
		
	}
	   
}
