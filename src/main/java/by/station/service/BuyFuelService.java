package by.station.service;

import by.com.entity.GasStation;
import by.station.repository.GasStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BuyFuelService {

    private GasStationRepository gasStationRepository;

    @Autowired
    public void setGasStationRepository(GasStationRepository gasStationRepository) {
        this.gasStationRepository = gasStationRepository;
    }

    @Transactional
    public List<GasStation> getAllGasStations(){
        return gasStationRepository.getAllGasStations();
    }
}
