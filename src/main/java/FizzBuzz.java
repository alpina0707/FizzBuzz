public class FizzBuzz {

    private static final int MAX_Number = 100;
    FizzBuzzLogic logic = new FizzBuzzLogic();

    public void count() {
        for (int i = 0; i < MAX_Number; i++) {
            logic.convertNumber(i);
        }
    }
}
