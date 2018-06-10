import java.util.HashMap;
import java.util.Map;

public class JudgeRouteCircle {

    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LDRRLRUULR"));
    }

    // R -------
    //         |
    //         |
    // ---------

    //

    // move = string, each move = char
    // R (Right), L (Left), U (Up) and D (down)


    public static boolean judgeCircle(String moves) {
        // declare x and y
        int x = 0;
        int y = 0;

        // get char of moves String
        for (char movesToChar: moves.toCharArray()) {
            // if char is "R" or "U" add ++
            // if char is "L" or "D" add --
            switch (movesToChar) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }
        }

        // if x = y return true, if not return false
        if (x == 0 && y == 0) {
            return true;
        } else {
            return false;
        }
    }
}



