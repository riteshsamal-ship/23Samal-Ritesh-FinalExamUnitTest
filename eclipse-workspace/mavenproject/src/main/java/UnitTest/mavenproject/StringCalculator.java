import javax.management.RuntimeErrorException;

public class StringCalculator {
    public static int add(String numbers) {
        int returnValue=0;
        String[] numbersArray = numbers.split(",|\n");
        if (numbersArray.length > 2) 
        {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        }
        
        else if(numbersArray[0].parseInt<0||numbersArray[2].parseInt<0)
        {
            throw new RuntimeErrorException("No Negative numbers are allowed!");
        }

        else if(numbersArray[0].parseInt>1000||numbersArray[2].parseInt>1000)
        {
            throw new RuntimeErrorException("No numbers greater than 1000 allowed!");
        }

        else 
        {
            for (String number : numbersArray) {
                if (!number.trim().isEmpty()) {
                    returnValue+=Integer.parseInt(number.trim()); // If it is not a number, parseInt will throw an exception
                }
            }
        }
        return returnValue;

    }
}
