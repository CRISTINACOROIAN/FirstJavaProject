public class LogicalOperation {
    public int getHigherNumber(int first, int second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }

    public String verifyProvidedText(String text, int number) {
        if (text.equals("FastTrack") && number <= 3) {
            return text + number;
        } else if (!text.equals("FastTrack") && number >= 4) {
            return number + text;
        }

        return "Not found!";

    }
    public String checkText(String learning_text_comparison, String text) {

        if (text.equals("FastTrackIT")) {
            return "Learning text comparison.";
        } else {
            return "Got to try some more.";
        }
    }
    public String orCondition(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm): " + number;
        } else {
            return "The forecast snow is(cm): " + number;
        }
    }
    public void countBackwards(int small, int big){
        for (int i = big; i >= small; i--){
            System.out.println(i);
        }
    }

    public float getAverageFromInterval(int start, int max){
        float sum = 0;
        for (int i = start; i <=max; i++){
            sum = i + sum;
        }
        return  sum / (max - start + 1);
    }

    public float getAverageDivisibleBySeven(int start, int max) {
        int x = start;
        float sum = 0;
        int count = 0;
        while (x <= max) {
            if (x % 7 == 0) {
                sum += x; //  sum = sum + x;
                count++;
            }

            x++;
        }
        return sum/count;
    }
    public int[] populateArray(int max){
        int[] myArr = new int[max];
        for (int i = 0; i < max; i++){
            myArr[i] = i+1;
        }
        return myArr;
    }

    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public void printArray(String[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void printArray(Dog[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i].getName());
        }
    }

    public float getAverageValueFromArray(int[] array){
        float sum = 0;

        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return(sum/array.length);
    }

    public boolean isValueInArray(int[] array, int value){
        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                return true;
            }
        }
        return false;
    }

    public void countHundred(int a) {

        for (int i = a; i <= 100; i++) {

            System.out.println(i);

        }

    }

    public void countMinusHundred(int a) {

        for (int i = a; i >= -100; i--) {

            System.out.println(i);

        }

    }
    public void countBetween(int a, int b) {

        for (int i = a; i <= b; i++) {

            System.out.println(i);

        }


        for (int i = a; i >= b; i--) {

            System.out.println(i);

        }

    }
    public void countBetween(int a, int b) {

        if(a < b){

            for (int i = a; i <= b; i++) {

                System.out.println(i);

            }

        } else if(b < a){

            for (int i = b; i <= a; i++) {

                System.out.println(i);

            }

        }else{

            System.out.println("Numbers are equal"!);

        }

    }

    public void displayUnevenNumbers() {

        for(int i = 0; i<= 100;i++){

            if(i % 2 != 0){

                System.out.println(i);

            }

        }

    }

    public int returnSum(int a) {

        int sum = 0;

        for(int i = a; i<= 100;i++){

            sum += i;

        }

        return sum;

    }
    public int returnAverage(int a) {

        int sum = 0;

        int counter = 0;

        for(int i = a; i<= 100;i++){

            sum += i;

            counter ++;

        }

        return sum/counter;

    }
    public void printPattern() {

        for (int j = 7; j >= 1; j--) {

            String text = "";

            for (int i = j; i >= 1; i--) {

                text = text + "*";

            }

            System.out.println(text);

        }

    }
    public void countToHundredWhile(int givenNumber) {

        while (givenNumber <= 100) {

            System.out.println(givenNumber);

            givenNumber++;

        }

    }
    public void countBackwardsWhile(int givenNumber) {

        while (givenNumber >= -100) {

            System.out.println(givenNumber);

            givenNumber--;

        }

    }
    public void countBetweenWhile(int firstNumber, int secondNumber) {

        while (firstNumber <= secondNumber) {

            System.out.println(firstNumber);

            firstNumber++;

        }

    }

    public void countBetweenWhile(int firstNumber, int secondNumber) {

        if(firstNumber < secondNumber){

            while (firstNumber <= secondNumber) {

                System.out.println(firstNumber);

                firstNumber++;

            }

        }

        else if(secondNumber < firstNumber){

            while (secondNumber <= firstNumber) {

                System.out.println(firstNumber);

                firstNumber++;

            }

        }

        else{

            System.out.println("The numbers are equal");

        }

    }
    public void evenNumbersWhile() {

        int number = 1;

        while (number <= 100) {

            number++;

            if (number % 2 == 0) {

                System.out.println(number);

            }

        }

    }
    public void unevenNumbersWhile() {

        int number = 1;

        while (number <= 100) {

            number++;

            if (number % 2 != 0) {

                System.out.println(number);

            }

        }

    }
    public void sumAndAverageWhile() {

        int firstNumber = 111;

        int secondNumber = 8899;

        double sum = 0;

        int count = 0;



        while (firstNumber <= secondNumber) {

            sum += firstNumber;

            firstNumber++;

            count++;

        }

        System.out.println(sum);

        double average = sum / count;

        System.out.println("The average of the numbers is: " + average);

    }
    public float divideBySevenWhile(int firstNumber, int lastNumber) {

        float count = 0F;

        float sum = 0F;

        while (firstNumber <= lastNumber) {

            if (firstNumber % 7 == 0) {

                count ++;

                sum += firstNumber;

            }

            firstNumber++;

        }

        float average = sum / count;

        return average;

    }
    public void fibonacci() {

        int count = 20;

        int num1 = 0;

        int num2 = 1;



        int i=1;

        while(i<=count)

        {

            System.out.print(num1+" ");

            int sumOfPrevTwo = num1 + num2;

            num1 = num2;

            num2 = sumOfPrevTwo;

            i++;

        }

    }

    public void wozaCozaLoza() {

        int i = 1;

        while (i <= 110) {

            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {

                System.out.print("CozaLozaWoza ");

            } else if (i % 5 == 0 && i % 7 == 0) {

                System.out.print("WozaLoza ");

            } else if (i % 3 == 0 && i % 7 == 0) {

                System.out.print("CozaWoza ");

            } else if (i % 3 == 0 && i % 5 == 0) {

                System.out.print("CozaLoza ");

            } else if (i % 7 == 0) {

                System.out.print("Woza ");

            } else if (i % 5 == 0) {

                System.out.print("Loza ");

            } else if (i % 3 == 0) {

                System.out.print("Coza ");

            } else {

                System.out.print(i + " ");

            }

            if (i % 11 == 0) {

                System.out.println();

            }

            i++;

        }

    }
}


