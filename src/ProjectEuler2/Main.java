package ProjectEuler2;
/*
By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Main {
    public static void main(String[] args) {
        int first = 1;
        int second = 2;
        int next;
        int sum = 0;
        while(first<4_000_000){
            if(first%2==0) sum = first+sum;
            next = first + second;
            first = second;
            second = next;
        }
        System.out.println(sum);
    }
}
