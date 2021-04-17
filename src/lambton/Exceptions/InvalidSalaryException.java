package lambton.Exceptions;

public class InvalidSalaryException extends Exception{
    public InvalidSalaryException(String message){
        super("Custom Exception: "+message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String getLocalizedMessage() {
        return super.getLocalizedMessage();
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public static boolean validateSalary(double baseSalary){
        if (baseSalary <0.0){
            return false;
        }
        else if (baseSalary<500.0) {
            return false;
        }
        return true;
    }
}
