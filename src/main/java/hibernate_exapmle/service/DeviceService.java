package hibernate_exapmle.service;

import hibernate_exapmle.dao.DeviceDao;
import hibernate_exapmle.model.Device;

public class DeviceService {

    DeviceDao deviceDao = new DeviceDao();

    public void saveDevice(Device device) {
        deviceDao.saveDevice(device);
    }

    public Device getDeviceById(int id) {
        Device device = deviceDao.getDeviceById(id);
        return device;
    }
    public void updateDevice(Device device){
        deviceDao.updateDevice(device);
    }
    public void deleteDeviceById(int id) {
        deviceDao.deleteDeviceById(id);
    }
}
