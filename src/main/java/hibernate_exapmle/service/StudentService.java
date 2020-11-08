package hibernate_exapmle.service;

import hibernate_exapmle.dao.StudentDao;
import hibernate_exapmle.model.Student;

import java.util.List;

public class StudentService {

    public void saveStudent(Student student){
        StudentDao studentDao = new StudentDao();
        studentDao.saveStudent(student);
    }

    public void updateStudent(Student student){
        StudentDao studentDao = new StudentDao();
        studentDao.updateStudent(student);
    }

    public void deleteStudent(int id){
        StudentDao studentDao = new StudentDao();
        studentDao.deleteStudent(id);
    }

    public Student getStudentById(int id){
        StudentDao studentDao = new StudentDao();
        Student student = studentDao.getStudentById(id);
        return student;
    }

    public List<Student> getAllStudents(){
        StudentDao studentDao = new StudentDao();
        List<Student> students = studentDao.getAllStudents();
        students.forEach(s -> System.out.println(s.getId()));
        return students;
    }
}



















