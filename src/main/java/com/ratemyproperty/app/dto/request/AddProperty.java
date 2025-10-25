package com.ratemyproperty.app.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class AddProperty {
    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Owner ID is required")
    private String ownerId;

    @Pattern(regexp = "^(http|https)://.*$", message = "Invalid URL format")
    private String imageUrl;

    @Size(max = 500, message = "Description must not exceed 500 characters")
    private String description;
    // Getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}