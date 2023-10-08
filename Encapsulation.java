public class Encapsulation {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


//Test class in separate java code but 

public class Test {
    public static void main(String[] args) {
        Encapsulation ob1 = new Encapsulation();

        ob1.setName("John");
        ob1.setAge(20);
        System.out.println("\nName: " + ob1.getName() + " Age: " + ob1.getAge() + "\n");

        Encapsulation ob2 = new Encapsulation();
        ob2.setName("Steve");
        ob2.setAge(30);
        System.out.println("\nName: " + ob2.getName() + " Age: " + ob2.getAge() + "\n");
    }
}

