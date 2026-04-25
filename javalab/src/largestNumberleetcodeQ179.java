import java.lang.reflect.Array;
import java.util.Arrays;

// int nums [3,30,34,5,9]
// output =
public class largestNumberleetcodeQ179 {
    public static String largest(int[] nums ){
        String[] str = new String[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            str[i] = nums[i] + "";
        }
        Arrays.sort(str, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < str.length;i++){
            ans.append(str[i]);
        }
        return ans.toString();
    }
    public static void main(String [] args){
        int[] arr = {9,3,6,31,2,7,5};
        System.out.println( largest(arr));
    }
}
