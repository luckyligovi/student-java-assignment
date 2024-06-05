public class Student {
    // attributes
    private String id;
    private double gpa;
    private String name;

    // constructor
    public Student(String id, double gpa, String name) {
        this.id = id;
        this.gpa = gpa;
        this.name = name;

    }

    // getters and setters methods

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        if (gpa > 0.0 && gpa < 4.0) {
            this.gpa = gpa;
            System.out.println("Gpa updated to : " + this.gpa);
        } else {
            System.out.println("invalid gpa value.The gpa should be between 0.0 and 4.0");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class InnerStudent {
    public static void main(String[] args) {
        // Student object
        Student studentA = new Student("15363873460", 2.4, "MIcheal");
        System.out.println("Name : " + studentA.getName());
        studentA.setGpa(2);
        studentA.setId("bdjslhjngahkrjetarn" + studentA.getGpa());
        System.out.println(studentA.getGpa());

    }
}