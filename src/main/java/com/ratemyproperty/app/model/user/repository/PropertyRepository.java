package com.ratemyproperty.app.model.user.repository;

import com.ratemyproperty.app.model.user.Property;
import org.springframework.data.repository.CrudRepository;

public interface PropertyRepository extends CrudRepository<Property, Long> {

}
