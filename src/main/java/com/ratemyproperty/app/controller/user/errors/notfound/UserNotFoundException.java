package com.ratemyproperty.app.controller.user.errors.notfound;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not find user "+ id);
    }
}
