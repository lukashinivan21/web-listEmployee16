package pro.sky.java.lesson16.weblistemployee16.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeIsAlreadyInsideListException extends RuntimeException{

    public EmployeeIsAlreadyInsideListException() {

    }

    public EmployeeIsAlreadyInsideListException(String message) {
        super(message);
    }

    public EmployeeIsAlreadyInsideListException(String message, Throwable throwable) {
        super(message, throwable);
    }


}
