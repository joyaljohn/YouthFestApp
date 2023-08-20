package com.swanthawnam.YouthFestApp.dto;

import java.io.Serializable;

public class LoginDTO implements Serializable{
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LoginDTO(String status) {
        this.status = status;
    }
}


