package hibernate_exapmle.dao;

import hibernate_exapmle.dao_impl.DeviceDaoImpl;
import hibernate_exapmle.model.Device;
import hibernate_exapmle.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeviceDao implements DeviceDaoImpl {

    public void saveDevice(Device device) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(device);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null)
                transaction.rollback();
            e.getMessage();
        }
    }

    public void updateDevice(Device device) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(device);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.getMessage();
        }
    }

    public Device getDeviceById(int id) {
        Transaction transaction = null;
        Device device = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            device = session.get(Device.class, id);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.getMessage();
        }
        return device;
    }

    public void deleteDeviceById(int id) {
        Transaction transaction = null;
        Device device = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            device = session.get(Device.class, id);
            session.delete(device);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null)
                transaction.rollback();
            e.getMessage();
        }

    }
}
