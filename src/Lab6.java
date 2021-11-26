import java.util.ArrayList;
import java.util.List;

public class Lab6 {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        LogicalOperation op = new LogicalOperation();
        List<Integer> mySecondList = op.getPopulatedList(100);

        myList.add(1);
        myList.add(2);
        myList.add(3);

        System.out.println(myList);
        myList.remove(Integer.valueOf(3));
        System.out.println(myList);
        myList.clear();
       System.out.println(myList);

        op.printListFromNumber(mySecondList, 50);

        op.getArrayToHundred();


    }


}
