package hibernate_exapmle;

import hibernate_exapmle.model.Student;
import hibernate_exapmle.model.Device;
import hibernate_exapmle.service.StudentService;
import hibernate_exapmle.service.DeviceService;
import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        DeviceService deviceService = new DeviceService();

        Device samsungS9 = new Device("telephone", "Samsung", "S9");
        Device asusVivoBookS14 = new Device("notebook", "Asus", "VivoBook S14");
        Device playStation5 = new Device("game console", "PlayStation", "5");
        Device iphoneXs = new Device("telephone", "Apple", "Iphone XS");
        Device iphoneXs1 = SerializationUtils.clone(iphoneXs);

        Student student1 = new Student("Minh", "Nguyen", 17);
        Student student2 = new Student("Sy", "Nguyen", 19);
        Student student3 = new Student("Dung", "Nguyen", 23);
        Student student4 = new Student("Them", "Nguyen", 18);
        Student student5 = new Student("Susan", "Belova", 15);

        studentService.saveStudent(student1);
        studentService.saveStudent(student2);
        studentService.saveStudent(student3);
        studentService.saveStudent(student4);
        studentService.saveStudent(student5);

        asusVivoBookS14.setStudent(student4);
        samsungS9.setStudent(student4);
        playStation5.setStudent(student3);
        iphoneXs.setStudent(student5);
        iphoneXs1.setStudent(student2);

        deviceService.saveDevice(iphoneXs1);
        deviceService.saveDevice(iphoneXs);
        deviceService.saveDevice(asusVivoBookS14);
        deviceService.saveDevice(samsungS9);
        deviceService.saveDevice(playStation5);

        student3.setLastName("Vu");
        student4.setLastName("Karate");

        studentService.updateStudent(student1);
        studentService.updateStudent(student2);
        studentService.updateStudent(student3);
        studentService.updateStudent(student4);
        studentService.updateStudent(student5);

        studentService.deleteStudent(1);
        studentService.getAllStudents();

    }
}
