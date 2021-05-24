package exercises1B;

public class Array1B {

    public static void main(String [] args) {
        int[] list = {1, 1, 2, 3, 5, 8};

            for (int oneInt : list) {
                if (oneInt % 2 != 0) {
                    System.out.println(oneInt);
                }
            }
    }
}

