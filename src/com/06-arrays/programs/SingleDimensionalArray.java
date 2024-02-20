class SingleDimensionalArray {
    public static void main(String[] args) {
        int array1[] = new int[5];//declaration and instantiation
        array1[0] = 10;//initialization
        array1[1] = 20;
        array1[2] = 70;
        array1[3] = 40;
        array1[4] = 50;

        int array2 [] = {10, 20 , 30, 40, 50};

        //traversing array1
        for (int i = 0; i < array1.length; i++)//length is the property of array1
            System.out.print(array1[i]+" ");

        System.out.println("");
        System.out.println("-----------------------");

        //traversing array2 in reverse
        for (int i = array1.length - 1; i >= 0; i--)//length is the property of array1
            System.out.print(array1[i]+" ");
    }
}