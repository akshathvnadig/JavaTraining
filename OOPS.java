public class OOPS {
    int usn;
    String name;
    int marks;
    void evaluate()
    {
    if(marks>=40){
        System.out.println("Pass");
    } else {
        System.out.println("Fail");
    }
    }
    public static void main(String[] args) {
        OOPS student = new OOPS();
        student.usn = 123;
        student.name = "John Doe";
        student.marks = 85;
        student.evaluate();
    }
}