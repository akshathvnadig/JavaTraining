public class Emp {
    int id;
    String name;
    double salary;
    static String company="TCS";
    Emp()
    {
        this(0,"Unknown",0);
    }
    public Emp(int id, String name) {
       this(id,name,30000);
    }
    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //this is Constructir Channing where one constructor is calling another constructor in the same class using this keyword
    //Benefit: Reusability and avoid code duplication
    //One is dependent on another constructor and the dependent constructor is called as a primary constructor and the other constructor is called as a secondary constructor
    void display()
    {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary );
    }
    public static void main(String[] args) {
        Emp e1=new Emp();
        Emp e2=new Emp(101,"John");
        Emp e3=new Emp(102,"Jane",50000);
        e1.display();
        e2.display();
        e3.display();
    }

}