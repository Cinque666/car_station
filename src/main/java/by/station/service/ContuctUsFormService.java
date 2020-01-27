package by.station.service;

import by.com.entity.ContactUs;
import by.station.repository.ContactUsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ContuctUsFormService {

    @Autowired
    private ContactUsRepository contactUsRepository;

    @Transactional
    public void save(ContactUs contactUs) {
        contactUsRepository.save(contactUs);
    }
}
