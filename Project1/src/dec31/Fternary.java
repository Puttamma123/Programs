package dec31;

public class Fternary {
	
	    public static void main(String[] args) {
	        int a = 10, b = 20, c = 15, d = 25;
	        int max;

	        if (a > b) {
	            if (a > c) {
	                if (a > d) {
	                    max = a;
	                } else {
	                    max = d;
	                }
	            } else {
	                if (c > d) {
	                    max = c;
	                } else {
	                    max = d;
	                }
	            }
	        } else {
	            if (b > c) {
	                if (b > d) {
	                    max = b;
	                } else {
	                    max = d;
	                }
	            } else {
	                if (c > d) {
	                    max = c;
	                } else {
	                    max = d;
	                }
	            }
	        }

	        System.out.println("Maximum of four numbers: " + max);
	    }
	}


