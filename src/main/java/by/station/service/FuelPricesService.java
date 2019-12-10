package by.station.service;

import by.com.entity.Fuel;
import by.station.repository.FuelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FuelPricesService {

    private FuelRepository fuelRepository;

    @Autowired
    public void setFuelRepository(FuelRepository fuelRepository) {
        this.fuelRepository = fuelRepository;
    }

    @Transactional
    public List<Fuel> getAllFuels(){
        return fuelRepository.getAllFuels();
    }
}
