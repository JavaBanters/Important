class ExceptionCallStackExample {

    static int divideByZero(int a, int b) {
        int i = a / b; //Exception will occur here
        return i;
    }

    static int division(int a, int b) {
        int res = 0;
        try {
            res = divideByZero(a, b);
        } catch (NumberFormatException ex) {
            System.out.println(
                    "NumberFormatException is occurred");
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            int i = division(a, b);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace(); //check the call stack of the exception
        }
    }
}