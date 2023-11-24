//call the method to add, subtract, multiply and divide two vectors.

package Practice;

import java.util.Scanner;

class Vector {
    int x, y, z;

    Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector add(Vector v) {
        Vector v1 = new Vector(this.x + v.x, this.y + v.y, this.z + v.z);
        return v1;
    }

    public Vector sub(Vector v) {
        Vector v1 = new Vector(this.x - v.x, this.y - v.y, this.z - v.z);
        return v1;
    }

    public Vector mul(Vector v) {
        Vector v1 = new Vector(this.x * v.x, this.y * v.y, this.z * v.z);
        return v1;
    }

    public Vector div(Vector v) {
        Vector v1 = new Vector(this.x / v.x, this.y / v.y, this.z / v.z);
        return v1;
    }
}

public class Lab_Test_Vector {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the x, y, z coordinates of Vector 1 : ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int z1 = in.nextInt();


        System.out.print("Enter the x, y, z coordinates of Vector 2 : ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int z2 = in.nextInt();

        System.out.println();
        Vector v1 = new Vector(x1, y1, z1);
        Vector v2 = new Vector(x2, y2, z2);

        Vector v3 = v1.add(v2);
        System.out.println("Addition of v1 and v2 Vector : " + v3.x + " " + v3.y + " " + v3.z);
        System.out.println();

        v3 = v1.sub(v2);
        System.out.println("Subtraction of v1 and v2 Vector : " + v3.x + " " + v3.y + " " + v3.z);
        System.out.println();

        v3 = v1.mul(v2);
        System.out.println("Multiplication of v1 and v2 Vector : " + v3.x + " " + v3.y + " " + v3.z);
        System.out.println();

        v3 = v1.div(v2);
        System.out.println("Division of v1 and v2 Vector : " + v3.x + " " + v3.y + " " + v3.z);
        System.out.println();
    }
}
