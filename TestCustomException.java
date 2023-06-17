class InvalidAgeException  extends Exception{
    public InvalidAgeException (String str){
        super(str);
    }
}

public class TestCustomException{
    static void validate (int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Ineligible to vote");
        }
        else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String args[]){
        try{
            validate(13);
        }
        catch (InvalidAgeException ex){
            System.out.println("Caught the exception!");
            System.out.println("Exception occured: " + ex);
            System.out.println("\n\n");
        }
        
        try{
            validate(25);
        }
        catch (InvalidAgeException ex){
            System.out.println("Caught the exception");
            System.out.println("Exception occured: " + ex);
            System.out.println("\n\n");
        }
    }
}
