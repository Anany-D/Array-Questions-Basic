public class maximumElement {
    public static void main(String[] args) {
        int [] arr = {895,44,78,9,774,444};
        int max = arr[0];
        for(int i : arr){
            if (i > max){
                max = arr[i];
            }
        }
        System.out.println(max);}
}
