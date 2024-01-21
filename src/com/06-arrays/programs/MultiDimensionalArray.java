class MultiDimensionalArray {
    public static void main(String[] args) {
        //declaring and initializing 2D array
        int arr1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int arr2[][] = new int [3][3];
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;
        arr2[1][0] = 4;
        arr2[1][1] = 5;
        arr2[1][2] = 6;
        arr2[2][0] = 7;
        arr2[2][1] = 8;
        arr2[2][2] = 9;


        //printing arr1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        //printing arr2 in reverse
        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }
}