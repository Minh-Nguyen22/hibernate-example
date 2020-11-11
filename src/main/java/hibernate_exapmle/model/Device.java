package hibernate_exapmle.model;

import org.apache.commons.lang3.SerializationUtils;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "devices")
public class Device implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "type")
    private String type;

    @Column(name = "model")
    private String model;

    @Column(name = "firm")
    private String firm;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Device() {
    }

    public Device(String type, String firm, String model) {
        this.type = type;
        this.model = model;
        this.firm = firm;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", firm: " + firm + ", model: " + model;
    }
}
