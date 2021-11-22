import AnimalRescue.Dog;

public class Lab5 {


    public static void main(String[] args) {
//        Define and write the values of an array indices,
//        so that the values of the arrays should start from
//        1 and count to 100;

        LogicalOperation op = new LogicalOperation();
//        int[] myArr = op.populateArray(87);
//        op.printArray(myArr);

//        Write a Java program to calculate the average
//        value of array elements.

        int[] array3= op.populateArray(50);
//        System.out.println(op.getAverageValueFromArray(array3));

//        System.out.println(op.isValueInArray(array3, 51));

        String[] myStrings = {"a", "b", "c", "d"};

        Dog rex = new Dog();
        rex.setName("Rex");

        Dog max = new Dog();
        max.setName("Max");
        Dog tex = new Dog();
        tex.setName("Tex");

        Dog[] myDogs = new Dog[3];
        myDogs[0] = rex;
        myDogs[1] = max;
        myDogs[2] = tex;

        op.printArray(myDogs);


    }
}
//Write a Java program to test if
// an array contains a specific value.