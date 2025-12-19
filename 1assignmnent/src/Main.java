import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Married (True/False: )");
        boolean married = sc.nextBoolean();

        Human human = new Human(name, age, married);

        human.setAge(human.getAge() + 1);

        Employee employee = new Employee("Amir", 22, true, "Google", 5000.5f );
        Student student = new Student("Anel", 18,  false, "AITU", 3.2f);

        human.sayHello();
        human.activity();

        employee.sayHello();
        employee.activity();

        student.sayHello();
        student.activity();

        System.out.println("Department: " + Employee.department);
        sc.close();

    }
}




