package com.ratemyproperty.app.model.user.repository;

import com.ratemyproperty.app.model.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
