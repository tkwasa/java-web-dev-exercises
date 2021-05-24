package exercises1B;

//import java.util.Arrays;

public class Studio1B {

    public static void main(String[] args) {

        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there";

        char[] charactersInString = myString.toCharArray();

        int[] freq = new int[charactersInString.length];

        int i;

        int j;

        //
        for (i = 0; i < myString.length(); i++) {
            freq[i] = 1;
            for (j = i + 1; j < myString.length(); j++) {
                if (charactersInString[i] == charactersInString[j]) {
                    freq[i]++;

                    //Set string[j] to 0 to avoid printing visited character
                    charactersInString[j] = '0';
                }
            }
        }

        for (i = 0; i < freq.length; i++) {
            if (charactersInString[i] != ' ' && charactersInString[i] != '0')
                System.out.println(charactersInString[i] + "-" + freq[i]);
        }

    }
}