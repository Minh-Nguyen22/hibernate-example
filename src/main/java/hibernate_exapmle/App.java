package hibernate_exapmle;

import hibernate_exapmle.dao.StudentDao;
import hibernate_exapmle.model.Student;
import hibernate_exapmle.service.StudentService;

import java.util.List;

public class App {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();

        Student student = new Student("Minh", "Nguyen", 17);
        Student student2 = new Student("Sy", "Nguyen", 19);
        Student student3 = new Student("Dung", "Nguyen", 23);
        Student student4 = new Student("Them", "Nguyen", 18);

        studentService.saveStudent(student3);
        studentService.saveStudent(student);
        studentService.saveStudent(student2);
        studentService.saveStudent(student4);

        student3.setLastName("Vu");
        student4.setLastName("Karate");

        studentService.updateStudent(student);
        studentService.updateStudent(student4);

        studentService.getStudentById(1);

        studentService.deleteStudent(3);
//        studentService.getAllStudents();

    }
}
