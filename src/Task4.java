public class Task4 {
    public static void main(String[] args) {
        int CARD_BALANCE = 5000;
        double INTEREST_RATE = 0.17;

        System.out.println("Your credit card balance after one month with a 17% interest rate is $" + ((CARD_BALANCE * INTEREST_RATE * 1) + CARD_BALANCE));
        System.out.println("Your credit card balance after two months with a 17% interest rate is $" + ((CARD_BALANCE * INTEREST_RATE * 2) + CARD_BALANCE));
    }
}
