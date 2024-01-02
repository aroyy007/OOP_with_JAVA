public class Teacher {
    String name, post;
    int salary;

    Teacher(String n, String p, int ph)   //using constructor
    {
        name = n;
        post = p;
        salary = ph;
    }

    // void setinfo(String n, String p, int ph) //using method
    // {
    //     name = n;
    //     post = p;
    //     salary = ph;
    // }

    void print() 
    {
        System.out.println("Name : " + name);
        System.out.println("Post : " + post);
        System.out.println("Salary : $" + salary);

        System.out.println();
        System.out.println();
    }
}
public class Bad0n {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Badhan Brooo","CEO at Amazon",1200000000); // declare and creation
        //using constructor
        
        // t1.name = "Badhan Brooo";
        // t1.post = "CEO at Amazon";
        // t1.salary = 1200000000;
        //t1.setinfo("Badhan Brooo","CEO at Amazon",1200000000); // using method 
        t1.print();


        Teacher t2 = new Teacher("Saimonguuu Brooo","CEO at APPLE",1200000000); // declare and creation
        //using constructor

        // t2.name = "Saimonguuu Brooo";
        // t2.post = "CEO at APPLE";
        // t2.salary = 1200000000;
        //t2.setinfo("Saimonguuu Brooo","CEO at APPLE",1200000000); // using method
        t2.print();


        Teacher t3 = new Teacher("Abir Brooo","CEO at TINDER",1200000000); // declare and creation
        //using constructor

        // t3.name = "Abir Brooo";
        // t3.post = "CEO at TINDER";
        // t3.salary = 1200000000;
        //t3.setinfo("Abir Brooo","CEO at TINDER",1200000000); // using method
        t3.print();

        
    }
}
