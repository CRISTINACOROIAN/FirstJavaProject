public class Lab2 {
    public static int x = 3;
    public static int z = 3;

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Print print = new Print();

        double result = calc.sum(x, z);
        System.out.println(result);

        double substractResult = calc.substract(x, z);
        System.out.println(substractResult);

        double multiplyResult = calc.multiply(x, z);
        System.out.println(substractResult);

        print.printStars();
        print.printJava();
        print.printFata();

    }


    }







