import java.util.Scanner;

class Data {
    private String name;
    private int CGPA;
    private String department;

    public Data() // Default Constructor
    {
        System.out.println("All students details are below ...");
    }

    public Data(String name, int CGPA, String department) // Parameterized Constructor
    {
        this.name = name;
        this.CGPA = CGPA;
        this.department = department;
    }

    public Data(Data other) // Copy Constructor
    {
        this.name = other.name;
        this.CGPA = other.CGPA;
        this.department = other.department;
    }
    public void display() {
        System.out.print("Name: " + name);
        System.out.print(" || CGPA: " + CGPA);
        System.out.println(" || Department: " + department);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Data d1 = new Data();
        System.out.print("Enter Name : ");
        String n = in.nextLine();
        System.out.print("Enter CGPA : ");
        int c = in.nextInt();
        in.nextLine(); // Consume the newline character left in the input buffer
        System.out.print("Enter Department : ");
        String d = in.nextLine();
        Data d2 = new Data(n, c, d);

        d2.display();

        Data d3 = new Data(d2);
        System.out.println("After Copy : ");
        d3.display();

    }
}
