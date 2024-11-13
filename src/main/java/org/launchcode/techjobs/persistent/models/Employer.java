package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    public Employer() {
    };

    @NotBlank(message= "Location cannot be blank")
    @Size(max = 100, message = "Location must not exceed 100 characters.")
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation (String location) {
        this.location = location;
    }
}
