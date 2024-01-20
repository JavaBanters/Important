import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

// String Constructors in Java
class StringConstructorsExample {
    public static void main(String[] args) {
        //1. It uses the platform’s default character set for decoding
        byte[] arr1 = {74, 97, 118, 97, 32, 66, 97, 110, 116, 101, 114, 115};
        String s_byte1 =new String(arr1);
        System.out.println("Example 1--->"+s_byte1);

        //2. It uses the char_set for decoding
        byte[] arr2 = {74, 97, 118, 97, 32, 66, 97, 110, 116, 101, 114, 115};
        Charset cs1 = Charset.defaultCharset();
        String s_byte2 = new String(arr1, cs1);
        System.out.println("Example 2--->"+s_byte2);

        /*3. It uses the char_set_name for decoding
             Try using ISO_8859_1 ,UTF_8*/
        byte[] arr3 = {74, 97, 118, 97, 32, 66, 97, 110, 116, 101, 114, 115};
        String s_byte3 = null;
        try {
            s_byte3 = new String(arr3, "UTF_16BE");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Example 3--->"+s_byte3);

        /*4. Construct a string from the byte array depending on the start index
             and the number of characters to print after the start index. */
        byte[] arr4 = {74, 97, 118, 97, 32, 66, 97, 110, 116, 101, 114, 115};
        String s_byte4 = new String(arr4, 5, 6);
        System.out.println("Example 4--->"+s_byte4);

        /*5. Construct a string from the byte array depending on the start index
             and the number of characters to print after the start index. Uses charSet for decoding */
        byte[] arr5 = {74, 97, 118, 97, 32, 66, 97, 110, 116, 101, 114, 115};
        Charset cs2 = Charset.defaultCharset();
        String s_byte5 = new String(arr5, 5, 6, cs2);
        System.out.println("Example 5--->"+s_byte5);

        /*6. Construct a string from the byte array depending on the start index
             and the number of characters to print after the start index. Uses char Set Name for decoding */
        byte[] arr6 = {74, 97, 118, 97, 32, 66, 97, 110, 116, 101, 114, 115};
        String s_byte6 = null;
        try {
            s_byte6 = new String(arr6, 5, 6, "UTF_16BE");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Example 6--->"+s_byte6);

        //7. Create a new String from the given Character array
        char char_arr1[] = {'J', 'a', 'v', 'a', ' ', 'B', 'a', 'n', 't', 'e', 'r', 's'};
        String s1 = new String(char_arr1);
        System.out.println("Example 7--->"+s1);

        //8. Create a String from a given character array but choose count characters from the start_index.
        char char_arr2[] = {'J', 'a', 'v', 'a', ' ', 'B', 'a', 'n', 't', 'e', 'r', 's'};
        String s2 = new String(char_arr2,5,6);
        System.out.println("Example 8--->"+s2);

        //9. create a string from int uni code array
        int[] uni_code = {74, 97, 118, 97, 32, 66, 97, 110, 116, 101, 114, 115};
        String s3 = new String(uni_code, 5, 6);
        System.out.println("Example 9--->"+s3);

        //10. Create a string from StringBuffer
        StringBuffer s_buffer = new StringBuffer("Java Banters");
        String s4 = new String(s_buffer);
        System.out.println("Example 10--->"+s4);

        //11. Create a string from StringBuffer
        StringBuilder s_builder = new StringBuilder("Java Banters");
        String s5 = new String(s_builder);
        System.out.println("Example 11--->"+s5);


    }
}