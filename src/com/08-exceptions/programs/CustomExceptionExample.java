
class InvalidAgeCustomException  extends Exception
{
    public InvalidAgeCustomException (String str)
    {
        super(str);
    }
}
class CustomExceptionExample{

    public static void main(String[] args) {
        try
        {
            validate(13);
        }
        catch (InvalidAgeCustomException ex)
        {
            System.out.println("Exception occured: " + ex.getMessage());
        }
    }

    static void validate (int age) throws InvalidAgeCustomException{
        if(age < 18){
            throw new InvalidAgeCustomException("age should be greater than 18");
        }
        else {
            System.out.println("Welcome to adulthood");
        }
    }

}

