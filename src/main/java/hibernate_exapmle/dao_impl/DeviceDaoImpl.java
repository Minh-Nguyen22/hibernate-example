package hibernate_exapmle.dao_impl;

import hibernate_exapmle.model.Device;
import hibernate_exapmle.model.Student;

import java.util.List;

public interface DeviceDaoImpl {

    void saveDevice(Device device);
    void updateDevice(Device device);
    Device getDeviceById(int id);
    void deleteDeviceById(int id);
}
