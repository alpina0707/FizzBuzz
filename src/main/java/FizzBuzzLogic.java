public class FizzBuzzLogic {

    public String convertNumber(int inputNumber) {
        if(inputNumber % 5 == 0 && inputNumber % 3 == 0) return "FizzBuzz";
        if(inputNumber % 3 == 0) return "Fizz";
        if(inputNumber % 5 == 0) return "Buzz";
        else return Integer.toString(inputNumber);
    }
}
