package jan2;

import java.util.Scanner;

class Example {
	public void Input(){
		
	
	int i;
	//int j;
	Scanner sc=new Scanner(System.in);
	//
	System.out.println("Enter the first numbers:");
	//accept the numbers
	i=sc.nextInt();
	//System.out.println("Enter the Second numbers:");
	//j=sc.nextInt();
	

	if(i%2==0) {
		
	
		System.out.println(i+ " is an even number");
	}
	
	else
	{
		System.out.println(i+ " is an odd number");
	}
}
}

public class EvenOdd{
	public static void main (String args[]) {
		
	Example ex=new Example();//creating  object
	ex.Input();//calling the method largest
	}
}



