package com.ratemyproperty.app.controller.property;

import com.ratemyproperty.app.dto.request.AddProperty;
import com.ratemyproperty.app.model.user.Property;
import com.ratemyproperty.app.service.PropertyService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.net.URL;

@RestController
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping("/properties")
    public Iterable<?> getAllProperties() {
        return propertyService.getAllProperties();
    }

    @PostMapping("/properties")
    public Property addProperty(@Valid @RequestBody AddProperty addProperty) throws MalformedURLException {

        Property property = new Property();
        property.setDescription(addProperty.getDescription());
        property.setAddress(addProperty.getAddress());
        property.setImageUrl(new URL(addProperty.getImageUrl()));


        return propertyService.saveProperty(property);
    }

}
