class UncheckedExceptionExample {

    public static void main(String[] args) {
        String a= null;
        try{
            System.out.println(a.length());
        }
        catch(NullPointerException e){
            System.out.println("e.getMessage() => "+e.getMessage());
            System.out.println("e.toString() => "+e.toString());
            e.printStackTrace();
        }
    }

}