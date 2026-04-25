package Recursion.src;

import java.util.ArrayList;

public class find_array_element {
    // Return array list of an indexing
    static ArrayList<Integer> allindex(int []arr, int index , int element){
        if(index == arr.length){
            return new ArrayList<>(); // Return empty array list
        }
        ArrayList<Integer> ans = new ArrayList<>();
        // delf Work
        if(arr[index]==element){
            ans.add(index);
        }
       ArrayList<Integer> smallAnswer =  allindex(arr , index+1, element);
        ans.addAll(smallAnswer);
        return ans;
    }
     public static void main(String[]args){
        int []arr = {1,5,3,4,7,8,9,3,4,5};
        ArrayList<Integer> ans = allindex(arr, 0, 5);
        for(Integer i:ans){
            System.out.println(i);
        }
     }
}
