public class ReverseWordsInAStringIII {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        // Input: "Let's take LeetCode contest"
        // Output: "s'teL ekat edoCteeL tsetnoc"

        // make an array of s, split white space
        String[] splitString = s.split(" ");

        // make an empty string for reversed string
        String reversedString = "";

        // reverse string of each array
        for (int i = 0; i < splitString.length; i++) {
            StringBuffer stringBuffer = new StringBuffer(splitString[i]);
            reversedString += stringBuffer.reverse().toString().trim() + " ";
        }

        String trim = reversedString.trim();

        // show new array reversed order
        return trim;

    }

}
