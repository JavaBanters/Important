class StringConcatenationExample {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Banters";

        System.out.println("---Concatenation using + operator---");
        System.out.println(s1+s2);

        System.out.println("---Concatenation using concat() method---");
        System.out.println(s1.concat(s2));
    }
}