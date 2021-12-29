package fms1;

import java.net.PortUnreachableException;

public class ValidationResult {
     private boolean isValid;
     private static String comment;

    public ValidationResult(boolean isValid, String comment) {
        this.isValid = isValid;
        ValidationResult.comment = comment;
    }

    public static ValidationResult valid(){
        return new ValidationResult(true, "");
    }

    private static String fillComment(char symbol, int pos){
        return String.format("", symbol, pos);
    }

    public static ValidationResult unexpectedSymbol(char symbol, int pos){
        return new ValidationResult(false, fillComment(symbol, pos));
    }

    public static ValidationResult unexpectedEOF(){
        return new ValidationResult(false, "Unexpected EOF");
    }

    public boolean isValid() {
        return isValid;
    }
}