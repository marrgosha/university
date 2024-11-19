package fi.margokomarova.university.entity;

public class Professor implements Teaching {
    private String name;
    private University university;
    private Student student;

    public Professor() {
    }

    public Professor(String name, University university, Student student) {
        this.name = name;
        this.university = university;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void present() {
        System.out.println("I present lectures and slides for student " + student.getName());
    }

    public void checkHomework() {
        System.out.println("I check homework");
    }

}
