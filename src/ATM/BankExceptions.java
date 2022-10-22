
package ATM;

public class BankExceptions extends Exception{

    String message;

    public static class AcocuntNotFoundException extends BankExceptions{
        AcocuntNotFoundException(){
            message  = "Account not found";
        }

    }

    public static class NegativeAmountException extends BankExceptions{
        NegativeAmountException(){
            message  = "Your balance is not enough.";
        }
    }


}

