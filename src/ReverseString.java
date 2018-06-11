public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }

    public static String reverseString(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        String toReverse = stringBuffer.reverse().toString();
        return toReverse;
    }

}
