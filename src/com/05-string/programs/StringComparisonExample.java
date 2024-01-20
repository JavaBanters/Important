class StringComparisonExample {

    public static void main(String[] args) {
        String s1 = "Java Banters";
        String s2 = "Java Banters";
        String s3 = new String("Java Banters");
        String s4 = "JAVA BANTERS";
        System.out.println("------------ equals Comparison ---------------");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
        System.out.println(s1.equalsIgnoreCase(s4));//true

        System.out.println("------------ == Comparison --------------------");

        System.out.println(s1 == s2);//true (because both refer to same instance)
        System.out.println(s1 == s3);//false(because s3 refers to instance created in non pool)

        System.out.println("------------ compareTo Comparison --------------------");
        System.out.println(s1.compareTo(s2));//0 (because s1 = s2)
        System.out.println(s4.compareTo(s1));//-32 (because s4 > s1)
        System.out.println(s1.compareTo(s4));// 32 (because s1 < s4 )
    }
}