package fi.margokomarova.university.entity;

public class Student implements Studying, General {
    private String name;
    private int age;
    private Professor professor;
    private University university;

    public Student() {
    }

    public Student(String name, int age, Professor professor, University university) {
        this.name = name;
        this.age = age;
        this.professor = professor;
        this.university = university;
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public void visitLecture() {
        System.out.println("I visit lectures and seminars of professor " + professor.getName());
    }

    @Override
    public void doHomework() {
        System.out.println("I do homework");
    }

    public void eat() {
        System.out.println("I eat burgers");
    }

    public void sleep() {
        System.out.println("I sleep 7 hours");
    }

    public void travel() {
        System.out.println("I go to the University by public transport");
    }
}
