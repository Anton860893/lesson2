public class Main {
    public static void main(String[] args) {
        System.out.println("First task:");
        int[] array1 = {1, 1, 0, 1, 0, 0, 1, 0};
        System.out.print("Initial: ");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();
        firstMethod(array1);
        System.out.print("Result: ");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Second task:");
        int[] array2 = new int[8];
        System.out.print("Initial: ");
        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.println();
        secondMethod(array2);
        System.out.print("Result: ");
        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Third task:");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Initial: ");
        for (int i : array3) {
            System.out.print(i + " ");
        }
        System.out.println();
        thirdMethod(array3);
        System.out.print("Result: ");
        for (int i : array3) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Fourth task:");
        int[][] array4 = new int[4][4];
        System.out.println("Initital: ");
        for (int[] i : array4){
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        fourthMethod(array4);
        System.out.println("Result: ");
        for (int[] i : array4){
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        System.out.println("Fifth task:");
        int[] array5 = {-5, 0, 2, -39, 36, 38, 11, -20};
        System.out.print("Initial: ");
        for (int i : array5) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Result:");
        fifthMethod(array5);
        System.out.println();
        System.out.println();

        System.out.println("Sixth task:");
        int[] array6 = {1, 1, 1, 2, 1};
        System.out.print("Initial: ");
        for (int i : array6) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Result: " + sixthMethod(array6));
        System.out.println();
        System.out.println();

        System.out.println("Seventh task:");
        int[] array7 = {1, 2, 3, 4, 5};
        int n = 1;
        System.out.print("Initial: ");
        for (int i : array7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("n = " + n);
        seventhMethod(array7, n);
        System.out.print("Result: ");
        for (int i : array7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    static void firstMethod(int[] array) {
        int i = 0;
        do {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            i++;
        } while (i < array.length);
    }

    static void secondMethod(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }
    }

    static void thirdMethod(int[] array) {
        int i = 0;
        while (i < array.length ) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
            i++;
        }
    }

    static void fourthMethod(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                if (i == j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
        }
    }

    static void fifthMethod(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            } else if (array[i] >= max) {
                max = array[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    static boolean sixthMethod(int[] array) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                sum1 += array[j];
            }
            for (int k = i; k < array.length; k++) {
                sum2 += array[k];
            }
            if (sum1 == sum2) {
                return true;
            } else {
                sum1 = 0;
                sum2 = 0;
            }
        }
        return false;
    }

    static void seventhMethod(int[] array, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int a = 0;
                int b = array[array.length - 1];
                for (int j = 0; j < array.length - 1; j++) {
                    a = array[j + 1];
                    array[j + 1] = array[0];
                    array[0] = a;
                }
                array[0] = b;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int a = 0;
                int b = array[0];
                for (int j = array.length - 1; j > 0; j--) {
                    a = array[array.length - 1];
                    array[array.length - 1] = array[j - 1];
                    array[j - 1] = a;
                }
                array[array.length - 1] = b;
            }
        }
    }
}