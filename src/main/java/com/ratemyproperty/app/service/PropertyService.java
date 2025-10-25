package com.ratemyproperty.app.service;

import com.ratemyproperty.app.model.user.Property;
import com.ratemyproperty.app.model.user.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    public Property saveProperty(Property property, Long ownerId) {
        property.setOwnerId();
        return propertyRepository.save(property);
    }

    public Iterable<Property> getAllProperties() {
        return propertyRepository.findAll();
    }
}
