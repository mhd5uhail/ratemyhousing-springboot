package com.ratemyproperty.app.controller.user.errors.creationfailed;

public class UserCreationFailed extends RuntimeException {
    public UserCreationFailed() {
        super("User cannot be created - validation failed");
    }
}
