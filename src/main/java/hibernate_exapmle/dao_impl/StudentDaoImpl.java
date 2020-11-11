package hibernate_exapmle.dao_impl;

import hibernate_exapmle.model.Student;

import java.util.List;

public interface StudentDaoImpl {

    void saveStudent(Student student);
    void updateStudent(Student student);
    Student getStudentById(int id);
    List<Student> getAllStudents();
    void deleteStudentById(int id);

}
