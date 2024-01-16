public class ClassAndObjectExample {
   public String name;
   public String breed;
   public int year;

   public void talk() {
       System.out.println("This object is talking");
   }

   public static void main(String[] args) {
      ClassAndObjectExample objectExample = new ClassAndObjectExample ();
      objectExample.talk();
   }
}