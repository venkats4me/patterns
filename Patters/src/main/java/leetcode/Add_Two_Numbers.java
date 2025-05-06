package leetcode;

public class Add_Two_Numbers {
    public static void main(String[] args) {
      int[] arr={9,1,0};
      String st="";
      int num=0;
        for (int i = arr.length-1; i>=0 ; i--) {
          num=num*10+arr[i];
        }
        System.out.println(num);
    }

}
