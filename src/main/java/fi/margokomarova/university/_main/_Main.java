package fi.margokomarova.university._main;

import fi.margokomarova.university.entity.Professor;
import fi.margokomarova.university.entity.Student;
import fi.margokomarova.university.entity.University;
import fi.margokomarova.university.util.UniService;

public class _Main {
    public static void main(String[] args) {
        University university = new University("Technological University");
        Student student = new Student();
        student.setName("Mike");
        student.setAge(32);
        student.setUniversity(university);
        Professor professor = new Professor("Sergeev", university, student);
        student.setProfessor(professor);
        UniService uniservice = new UniService();
        uniservice.makeStudy(student);
        uniservice.makeTeach(professor);
        uniservice.makeGeneral(student);

    }

}
