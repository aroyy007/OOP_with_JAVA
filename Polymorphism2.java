public class Person {

    public void display() {
        System.out.println("I am a person");
    }

}

public class Student extends Person{
    public void display()
    {
        System.out.println("I am a Student");
    }
}


public class Teacher extends Person{
    public void display()
    {
        System.out.println("I am a Teacher");
    }
}


public class Polymorphism2 {
    public static void main(String[] args) {
        Person p = new Person();
        p.display();

        Teacher t = new Teacher();
        t.display();

        Student s = new Student();
        s.display();

    }
    
}
