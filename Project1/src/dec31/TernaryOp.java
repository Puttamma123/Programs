package dec31;

public class TernaryOp {
	
	    public static void main(String[] args) {
	        int a = 10, b = 20, c = 15, d = 25;

	        // Finding the maximum of four numbers
	        int max = (a > b) 
	                    ? ((a > c) ? (a > d ? a : d) : (c > d ? c : d)) 
	                    : ((b > c) ? (b > d ? b : d) : (c > d ? c : d));

	        System.out.println("Maximum of four numbers: " + max);
	    }
}
