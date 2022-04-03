package com.codegym.service;

import com.codegym.model.Smartphone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codegym.repository.SmartphoneRepository;

import java.util.Optional;

@Service
public class SmartphoneService implements ISmartphoneService{
    @Autowired
    SmartphoneRepository smartphoneRepository;

    @Override
    public Iterable<Smartphone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Long id) {
        return smartphoneRepository.findById(id);
    }

    @Override
    public Smartphone save(Smartphone smartphone) {
        return smartphoneRepository.save(smartphone);
    }

    @Override
    public void delete(Smartphone smartphone) {
        smartphoneRepository.delete(smartphone);
    }

    @Override
    public void deleteById(Long id) {
        smartphoneRepository.deleteById(id);
    }
}
