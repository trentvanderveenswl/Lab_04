public class Task1 {
    public static void main(String[] args) {
        int intOperandA = 5;
        int intOperandB = 10;

        int intSum = intOperandA + intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intProuct = intOperandA * intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;

        double doubleOperandA = 5.5;
        double doubleOperandB = 11.5;

        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;
        double doubleModulo = doubleOperandA % doubleOperandB;

        // int outputs
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB +  " is " + intSum);
        System.out.println("The difference using ints of " + intOperandA + " " + intOperandB +  " is " + intDifference);
        System.out.println("The product using ints of " + intOperandA + " " + intOperandB +  " is " + intProuct);
        System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB +  " is " + intQuotient);
        System.out.println("The modulo using ints of " + intOperandA + " " + intOperandB +  " is " + intModulo);

        System.out.println(" ");

        // double outputs
        System.out.println("The sum using doubles of " + doubleOperandA + " " + doubleOperandB +  " is " + doubleSum);
        System.out.println("The difference using doubles of " + doubleOperandA + " " + doubleOperandB +  " is " + doubleDifference);
        System.out.println("The product using doubles of " + doubleOperandA + " " + doubleOperandB +  " is " + doubleProduct);
        System.out.println("The quotient using doubles of " + doubleOperandA + " " + doubleOperandB +  " is " + doubleQuotient);
        System.out.println("The modulo using doubles of " + doubleOperandA + " " + doubleOperandB +  " is " + doubleModulo);
    }
}
