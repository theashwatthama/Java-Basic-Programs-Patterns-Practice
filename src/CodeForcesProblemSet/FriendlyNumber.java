package CodeForcesProblemSet;

import java.util.Scanner;

            //2197A - 13
public class FriendlyNumber {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while (t--> 0){
            long x= sc.nextLong();
            int count=0;
            for (long y = x; y<=x+81 ; y++) {
            long sum=0,temp=y;
            while (temp>0){
                sum+=temp%10;
                temp/=10;
            }
            if(y-sum==x){
                count++;
            }
            }
            System.out.println(count);
        }

    }
}
