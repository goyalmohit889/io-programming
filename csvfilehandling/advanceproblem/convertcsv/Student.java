package csvfilehandling.advanceproblem.convertcsv;

public class Student {
    private int id;
    private String name;
    private String email;
    private int marks;

    public Student(int id, String name, String email, int marks) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getMarks() { return marks; }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Email='" + email + '\'' +
                ", Marks=" + marks +
                '}';
    }
}

