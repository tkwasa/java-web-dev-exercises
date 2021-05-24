package exercises1B;

import java.util.Arrays;

public class ArrayTwo1B {

    public static void main(String[] args) {
        String splitString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";

        String[] splitStringArray;

        String delimiter = "\\.";

        splitStringArray = splitString.split(delimiter);

        // let us print all the elements available in list
        for (int i = 0; i < splitStringArray.length; i++)
            System.out.println(splitStringArray[i]);

        System.out.println(Arrays.toString(splitStringArray));

    }
}


