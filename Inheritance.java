class One 
{
    public void Print_one() {
        System.out.println("This is class One");
    }
}

class Two extends One //Single Inheritance
{
    public void Print_two() {
        System.out.println("This is class Two");
    }
}

class Three extends Two //Multilevel Inheritance
{
    public void Print_three() {
        System.out.println("This is class Three");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Three obj3 = new Three();
        obj3.Print_one();
        obj3.Print_two();
        obj3.Print_three();

    }
}

