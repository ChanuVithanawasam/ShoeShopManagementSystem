package lk.ijse.customerservice.advisor;


import lk.ijse.customerservice.exception.NotFoundException;
import lk.ijse.customerservice.exception.ValidationException;
import lk.ijse.customerservice.util.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {
    @ExceptionHandler({Exception.class})
    public ResponseEntity<Response> handleException(Exception ex) {
        return new ResponseEntity<>(new Response("Error",ex.getMessage(),null), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler({NotFoundException.class})
    public ResponseEntity<Response> handleNotFoundException(NotFoundException ex) {
        return new ResponseEntity<>(new Response("Error",ex.getMessage(),null), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({ValidationException.class})
    public ResponseEntity<Response> handleValidationException(ValidationException ex) {
        return new ResponseEntity<>(new Response("Error",ex.getMessage(),null), HttpStatus.NOT_FOUND);
    }
}
