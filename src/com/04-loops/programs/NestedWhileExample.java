class NestedWhileExample {
    public static void main(String[] args) {
        int i = 0, j = 0; // you can declare variables in this way too!!
        while (i < 3) {
            j = 0; // reinitializing j to 0 . but why ?
            //loop of j
            while(j < 3){
                System.out.print(i + "" + j +" ");
                j++;
            }//end of i
            i++;
            System.out.println();
        }//end of j
    }
}