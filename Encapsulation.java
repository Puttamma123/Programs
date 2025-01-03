package jan2;

class Student {
	private int sid;
	private String sname;
	
	public void display() {
		System.out.println("sid:"+sid);
		System.out.println("sname:"+sname);
	}

}

public class Encapsulation {
	public static void main(String args[]) {
	Student stu=new Student();
	stu.display();
}
}
