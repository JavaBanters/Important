class StringSubstringExample{
    public static void main(String[] args) {
        String s = "Java Banters";

        System.out.println(s.substring(5));

        System.out.println(s.substring(5, 11));

        /*Uncomment below lines to check exceptions
        * The length if the string is 12 . Therefor the permissible index are from 0 - 11
        * If indexes other then the available are accessed then exception would be thrown
        * */
        //System.out.println(s.substring(13));
        //System.out.println(s.substring(7,14));

    }
}