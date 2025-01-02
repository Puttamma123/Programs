package dec31;

class Test {
    private int i, j, s;

    // Constructor with no arguments
    public Test() {
        // Optionally initialize i and j
        this.i = 0;
        this.j = 0;
    }

    // Constructor with arguments
    public Test(int i, int j) {
        this.i = i;
        this.j = j;
        System.out.println("this = " + this); // `this` refers to the current object
    }

    // Method to calculate and display the sum
    public void add() {
        s = i + j;
        System.out.println("Sum = " + s);
    }

    // Overriding the toString method
    @Override
    public String toString() {
        return "Test [i=" + i + ", j=" + j + ", s=" + s + "]";
    }
}
public class MainThis {

public static void main(String[] args) {
    // Creating an object of the Test class with parameters
    Test tobj = new Test(6, 7);
    
    // Calling the add method to compute and display the sum
    tobj.add();
    
    // Printing the object using the overridden toString method
    System.out.println(tobj);
}
}

