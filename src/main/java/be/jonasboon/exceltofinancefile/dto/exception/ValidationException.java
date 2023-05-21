package be.jonasboon.exceltofinancefile.dto.exception;

public class ValidationException extends Exception {
    public ValidationException(String message) {
        super(message);
    }
}
