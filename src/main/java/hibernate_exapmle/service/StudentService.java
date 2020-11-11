package hibernate_exapmle.service;

import hibernate_exapmle.dao.StudentDao;
import hibernate_exapmle.model.Student;

import java.util.List;

public class StudentService {

    StudentDao studentDao = new StudentDao();

    public void saveStudent(Student student){
        studentDao.saveStudent(student);
    }

    public void updateStudent(Student student){
        studentDao.updateStudent(student);
    }

    public void deleteStudent(int id){
        studentDao.deleteStudentById(id);
    }

    public Student getStudentById(int id){
        Student student = studentDao.getStudentById(id);
        return student;
    }

    public List<Student> getAllStudents(){
        List<Student> students = studentDao.getAllStudents();
        students.forEach(s -> System.out.println(s.toString()));
        return students;
    }
}



















