package jan2;

import java.util.Scanner;

class Ex {
	public void largest(){
		
	
	Double i;
	Double j;
	Scanner sc=new Scanner(System.in);
	//
	System.out.println("Enter the first numbers:");
	//accept the numbers
	i=sc.nextDouble();
	System.out.println("Enter the Second numbers:");
	j=sc.nextDouble();

	if(i>j) {
		
	
		System.out.println(i+ " is bigger thean " +j);
	}
	else if (i<j)
	{
		System.out.println(j+ " is greater than " +i);
	
	}
	else
	{
		System.out.println("Both numbers are equal");
	}
}
}

public class LargestOfTwo{
	public static void main (String args[]) {
		
	Ex ex=new Ex();//creating  object
	ex.largest();//calling the method largest
	}
}


