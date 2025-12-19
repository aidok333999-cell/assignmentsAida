public class Employee  extends Human{
    private String company;
    private float salary;

    public static String department = "General";
    public Employee(String name, int age, boolean married, String company, float salary) {
        super(name, age, married);
        this.company = company;
        this.salary = salary;
    }
    @Override
    public void activity(){
        System.out.println(getName() + " works at " + company);
    }
    public String getCompany(){
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}