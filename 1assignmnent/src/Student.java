public class Student extends Human{
    private String university;
    private float grade;

    public Student(String name, int age, boolean married, String university, float grade){
        super(name, age, married);
        this.university = university;
        this.grade = grade;
    }
    @Override
    public void activity() {
        System.out.println(getName() + " studies at " + university);
    }

    // Getters and setters
    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}