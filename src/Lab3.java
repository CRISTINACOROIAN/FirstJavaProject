public class Lab3 {

    public static void main(String[] args) {
        //Given two numbers, see which one
        // is the greatest and print it

        int x = 13;
        int y = 13;

        LogicalOperation op = new LogicalOperation();
//        System.out.println(op.getHigherNumber(x, y));

//        Given a text input and a number input, if the text is
//        equal to “FastTrack” AND the number is equal to or lower than 3,
//        print the text and the number. If the text is not “FastTrack”
//        AND the number is equal to or higher than 4, print the number
//        and the text, in this order.

        String text = "FastTrack";
        int number = -13;

        System.out.println(op.verifyProvidedText(text, number));


    }
}
