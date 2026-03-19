import java.util.*;
public class evenOddSeperation{
    public static void main(String[] args) {
        int [] arr= {1,2,4,77,8,96,5};
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int num : arr){
            if(num % 2 == 0) even.add(num);
            else odd.add(num);
        }
        System.out.println("Even : " + even +"\nOdd : " + odd );}
}