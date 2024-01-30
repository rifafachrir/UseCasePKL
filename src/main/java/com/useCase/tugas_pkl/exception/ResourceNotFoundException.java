package com.useCase.tugas_pkl.exception;

import jakarta.validation.ConstraintDeclarationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends ConstraintDeclarationException{


    public ResourceNotFoundException(String message){
        super(message);
    }
}
