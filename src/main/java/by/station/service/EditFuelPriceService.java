package by.station.service;

import by.com.entity.Fuel;
import by.station.repository.FuelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EditFuelPriceService {

    private FuelRepository fuelRepository;

    @Autowired
    public void setFuelRepository(FuelRepository fuelRepository) {
        this.fuelRepository = fuelRepository;
    }

    @Transactional
    public Fuel getFuelById(Integer id){
        return fuelRepository.getFuelById(id);
    }

    @Transactional
    public boolean editFuel(Fuel fuel) {
        if(fuel == null || fuel.getName().isEmpty() || fuel.getPrice() < 0){
            return false;
        }

        fuelRepository.overrideFuel(fuel);

        return true;
    }
}
