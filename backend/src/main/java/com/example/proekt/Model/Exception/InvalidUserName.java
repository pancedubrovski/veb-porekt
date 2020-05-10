package com.example.proekt.Model.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;



@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidUserName extends RuntimeException  {

    public InvalidUserName(String message){
        super(message);
    }

}
