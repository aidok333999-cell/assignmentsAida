public class Human {

    private String name;
    private int age;
    private boolean married;

    public Human() {
    }

    public Human(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    public void activity() {
        System.out.println("Human is doing something");
    }


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

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
