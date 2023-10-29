import java.util.Scanner;

class CoOrdinates {
    double x_axis;
    double y_axis;

    public CoOrdinates(double x_axis, double y_axis) {
        this.x_axis = x_axis;
        this.y_axis = y_axis;
    }

    public double calculateDistance(CoOrdinates other) {
        double x_diff = this.x_axis - other.x_axis;
        double y_diff = this.y_axis - other.y_axis;
        return Math.sqrt(x_diff * x_diff + y_diff * y_diff);
    }
}

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the x-coordinate of the first point: ");
        double x1 = in.nextDouble();

        System.out.print("Enter the y-coordinate of the first point: ");
        double y1 = in.nextDouble();

        System.out.print("Enter the x-coordinate of the second point: ");
        double x2 = in.nextDouble();

        System.out.print("Enter the y-coordinate of the second point: ");
        double y2 = in.nextDouble();

        CoOrdinates point1 = new CoOrdinates(x1, y1);
        CoOrdinates point2 = new CoOrdinates(x2, y2);

        double distance = point1.calculateDistance(point2);

        System.out.println("The distance between the two points is: " + distance);
    }
}
