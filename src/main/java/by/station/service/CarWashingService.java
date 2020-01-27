package by.station.service;

import by.com.entity.RSSEntity;
import by.station.repository.RSSEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CarWashingService {

    @Autowired
    private RSSEntityRepository rssEntityRepository;

    @Transactional
    public List<RSSEntity> getNews() {
        return rssEntityRepository.getNews();
    }
}
