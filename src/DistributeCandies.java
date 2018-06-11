import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public static void main(String[] args) {
        int[] candies = {1,1,2,2,3,3};
        int[] candies2 = {1,1,2,3};
        System.out.println(distributeCandies(candies));
        System.out.println(distributeCandies(candies2));
    }

    //        Input: candies = [1,1,2,2,3,3]
    //        Output: 3

    //        Input: candies = [1,1,2,3]
    //        Output: 2
    //        Explanation: For example, the sister has candies [2,3] and the brother has candies [1,1].
    //        The sister has two different kinds of candies, the brother has only one kind of candies.


    public static int distributeCandies(int[] candies) {
        Set<Integer> candySet = new HashSet<>();
        for (int candy : candies) {
            candySet.add(candy);
        }
        return Math.min(candySet.size(), candies.length / 2);
    }


}
