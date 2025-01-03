
package jan2;
import java.util.Scanner;


 class CheckNumberPositveNegative{
  private int num;


	public void input() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	num = sc.nextInt();
	}
	
	public void checkNumber() {
	if(num==0) {
		System.out.println("Input number is zero");
	}
	else if(num>0) {
		System.out.println(num+" is positive");
	}
	else {
		System.out.println(num+" is negative");
	}
  }


}


public class LargestThree {
	
	public static void main(String[] args) {
		CheckNumberPositveNegative obj=new CheckNumberPositveNegative();
		 obj.input();
		 obj.checkNumber();
		
}
}