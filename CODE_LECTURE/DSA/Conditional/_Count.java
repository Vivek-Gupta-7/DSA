package DSA.Conditional.Occuring_No;

public class _Count {
    public static void main(String[] args) {
        int n = 135757879;
        int count=0;
        int rem=0;

        while(n!=0){
            rem=n%10;
            if(rem==7){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
