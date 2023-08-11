package com.cartelera.cartelera.controller;

import com.cartelera.cartelera.model.Location;
import com.cartelera.cartelera.service.LocationServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = "*")
@RequestMapping(path = "locations")
public class LocationController extends BaseControllerImpl<Location, LocationServiceImpl> {
}
