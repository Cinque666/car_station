package by.station.service;

import by.com.entity.ServiceVehicleTypeXref;
import by.com.entity.VehicleType;
import by.station.repository.ServiceVehicleTypeXrefRepository;
import by.station.repository.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class WashPricesService {

    private VehicleTypeRepository vehicleTypeRepository;
    private ServiceVehicleTypeXrefRepository serviceVehicleTypeXref;

    @Autowired
    public void setServiceVehicleTypeXref(ServiceVehicleTypeXrefRepository serviceVehicleTypeXref) {
        this.serviceVehicleTypeXref = serviceVehicleTypeXref;
    }

    @Autowired
    public void setVehicleTypeRepository(VehicleTypeRepository vehicleTypeRepository) {
        this.vehicleTypeRepository = vehicleTypeRepository;
    }

    @Transactional
    public List<VehicleType> getAllVehicleTypes() {
        return vehicleTypeRepository.getAllVehicles();
    }

    @Transactional
    public List<ServiceVehicleTypeXref> getAllServiceVehicleTypeXref() {
        return serviceVehicleTypeXref.getAllServiceVehicleTypeXref();
    }
}
