package level1.lesson2;


import java.util.Arrays;

public class lesson2 {
    public static void main(String[] args) {
        System.out.println("First exercise");
        invertArray();

        System.out.println("Second exercise");
        fillArray();
        System.out.println(" ");

        System.out.println("Third exercise");
        changeArray();
        System.out.println(" ");

        System.out.println("Fourth exercise");
        fillDiagonal();

        System.out.println("Fifth exercise");
        findMinUndMax();

        System.out.println("Sixth exercise");
        System.out.println(checkBalance());

        System.out.println("Seventh exercise");
        moveArray( 2);

    }

    public static void invertArray () {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*2);
            System.out.print(arr[i] + " ");
            if (arr[i] == 0 ) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void fillArray () {
        int []arr = new int[8];

//        for (int i = 0,  temp = 0; i < arr.length; i++, temp +=3 ) {
//          arr[i] = temp;
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=i*3;
            System.out.print(arr[i] + " ");
        }
    }

    public static void changeArray () {
        int [] arr =  {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]< 6) {
                arr[i] = arr[i]*2;
                System.out.print(arr[i] + " ");
            } else {
                System.out.print((arr[i])+ " ");
            }

        }
    }

    public static void fillDiagonal () {
        int [][]arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length ; j++) {
                if (i==j || (j ==arr.length-1-i)) System.out.print("1");
                else System.out.print(0);
            }
            System.out.println("");
        }

    }

    public static void findMinUndMax() {
        int []arr = {10, 4, -4, 23,5, 35, 5};
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]< min) {
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    public static boolean checkBalance () {
        int []arr = new int[5];
        int sumArr = 0;
        int rightSide = 0;
        int leftSide = 0;
        boolean check = false;
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int) (Math.random()*11);
            System.out.print(arr[i] + " ");
            sumArr += arr[i];
        }
        System.out.println("sum = " + sumArr);


        for (int j = 0; j < arr.length ; j++) {
            leftSide += arr[j];
            rightSide = sumArr - leftSide;
            if (rightSide == leftSide) check = true;
        }
        return check;
    }

    public static void moveArray ( int n) {
        int []arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));

        if (n < 0) {
            for (int j = 0; j < -n; j++) {
                int temp = arr [0];
                for (int i = 0; i < arr.length-1; i++) {
                    arr[i] = (arr[i+1]);
                }
                arr[arr.length-1] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }


        if (n > 0) {

            for (int j = 0; j < n; j++) {
                int temp = arr[arr.length-1];
                for (int i = arr.length-2; i >= 0 ; i--) {
                    arr[i+1] = arr[i];
                }
                arr[0] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }

    }

}




