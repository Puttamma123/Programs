/*Program to find the largest of 3 numbers  */
package jan2;


import java.util.Scanner;


class LargestNumbers{
	private int num1,num2,num3,large;
	
	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		num3=scanner.nextInt();
	}
	
	public void checkLargest() {
		if(num1>num2 && num1>num3) {
			large=num1;
		}else if(num2>num1 && num2>num3) {
			large=num2;
		}else {
			large=num3;
		}
		
		System.out.println("The largest of "+num1+" ,"+num2+" and "+num3+" is "+large);
	}
	
}
public class LargestThree {


	public static void main(String[] args) {
		LargestNumbers largestNumbers = new LargestNumbers();
		largestNumbers.inputData();
		largestNumbers.checkLargest();


	}


}