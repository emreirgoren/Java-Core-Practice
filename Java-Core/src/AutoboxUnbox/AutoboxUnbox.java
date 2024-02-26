package AutoboxUnbox;

import java.util.ArrayList;
import java.util.List;

public class AutoboxUnbox {

    public static void main(String[] args) {

        int num = 7;
        Integer autobox = num; //autoboxing: int to Integer

        System.out.println("Autoboxed Integer is " + autobox);

        int unbox = autobox.intValue(); //auto-unboxing: Integer to int

        System.out.println("Unboxed int is " + unbox);

        String str = "10";
        int num3 = Integer.parseInt(str); //String to Integer

        System.out.println("String 10 has been converted into a Integer " + num3);
        System.out.println("Converted Integer multiplied by two: " + num3 * 2);

        int number =5;
        String intToString = String.valueOf(number);
        System.out.println("Primitive int has been converted into a String " + intToString); //int to String

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //autoboxing
        //add() int primitive types
        arrayList.add(1);
        arrayList.add(22);

        System.out.println("ArrayList: " + arrayList);

        List<Integer> arrayList1 = new ArrayList<Integer>();

        // add() int primitives type by converting them into Integer wrapper object
        for (int i = 0; i < 10; i++){
            arrayList1.add(Integer.valueOf(i));

        }
        System.out.println("Second ArrayList: " + arrayList1);


    }

}
