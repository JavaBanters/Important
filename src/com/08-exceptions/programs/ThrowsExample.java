class ThrowsExample {

    static void divide(int a) throws Exception{
        System.out.println(10/a);
    }

    static void printArrayElement(int [] arr, int index) throws Exception{
        arr[index] = 4;
    }
    public static void main (String[] args) {
        try{
            divide(0); // comment this line and run the program again
            int [] arr = new int [1];
            printArrayElement(arr, 2);
        }catch(Exception e){ // Exception here is generic it can catch any exception
            System.out.println(e.getMessage());
        }

    }

}