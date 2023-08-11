package com.cartelera.cartelera.service;

import com.cartelera.cartelera.model.Location;
import com.cartelera.cartelera.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl extends BaseServiceImpl<Location, Long> implements LocationService {
    @Autowired
    public LocationServiceImpl(BaseRepository<Location, Long> baseRepository) {
        super(baseRepository);
    }
}
