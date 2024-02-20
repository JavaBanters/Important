class ExceptionExample {
    public static void main(String[] args) {
        int array [] = {10, 20 , 30, 40, 50};

        System.out.println(array[0]); // element at 0th index 10
        System.out.println(array[4]); //element at 4th index 50
        System.out.println(array[7]); //7th index does not exist hence exception is thrown
    }
}