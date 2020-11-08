package hibernate_exapmle.dao;

import hibernate_exapmle.dao_impl.StudentDaoImpl;
import hibernate_exapmle.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class StudentDao implements StudentDaoImpl {

    public void saveStudent(hibernate_exapmle.model.Student student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null)
                transaction.rollback();
            e.getMessage();
        }
    }

    public void updateStudent(hibernate_exapmle.model.Student student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.getMessage();
        }
    }

    public hibernate_exapmle.model.Student getStudentById(int id) {
        Transaction transaction = null;
        hibernate_exapmle.model.Student student = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            student = session.get(hibernate_exapmle.model.Student.class, id);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.getMessage();
        }
        return student;
    }

    public List<hibernate_exapmle.model.Student> getAllStudents() {
        Transaction transaction = null;
        List<hibernate_exapmle.model.Student> students = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            students = session.createQuery("from Student ").list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null)
                transaction.rollback();
            e.getMessage();
        }
        return students;
    }
//    public List<hibetnate_exapmle.model.Student> getAllStudents() {
//        Configuration configuration = null;
//        try (Session session = configuration.buildSessionFactory().openSession()) {
//            return session.createQuery("from Student", Student.class).list();
//        }
//    }

    public void deleteStudent(int id) {
        Transaction transaction = null;
        hibernate_exapmle.model.Student student = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            student = session.get(hibernate_exapmle.model.Student.class, id);
            session.delete(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null)
                transaction.rollback();
            e.getMessage();
        }

    }
}
