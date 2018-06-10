public class ShortestDistanceToACharacter {

    public static void main(String[] args) {
        System.out.println(shortestToChar("loveleetcode", 'e'));
    }


    public static int[] shortestToChar(String S, char C) {
    // Input: S = "loveleetcode", C = 'e'
    // Output: [3,2,1,0,1,0,0,1,2,2,1,0]
    //         [3,2,1,0,1,0,0,4,3,2,1,0]
    // e = 3,5,6,11

        int position = 0;
        int[] distance = new int[S.length()];

        // get string of C in Array S
        for (int i = 0; i < S.length(); i++) {
            position = S.toLowerCase().indexOf(C, i);
            // check distance from C and show it as integers
            distance[i] = position - i;

        }

        // make new int array for showing integers
        return distance;
    }
}


