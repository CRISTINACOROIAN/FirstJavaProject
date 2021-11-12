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


}
