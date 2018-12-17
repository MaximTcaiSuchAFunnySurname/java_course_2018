package classwork;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(fibIterationFunc(10));
    }

    //F(n) = F(n-1) + F(n-2) 1 1 2 3 5 8 13 21 34 55 89 etc
    public static int fib(int value) {
        //
        if (value < 2)
            return 1;
        return fib(value - 1) + fib(value - 2);
    }

    public static int fibIterationFunc(int value){
        /*
        int prev = 1;
        int current = 1;
        if (value < 1){
            return 1;
        }
        for (int i = 2, i<=value, i++){
           temp = current
           current +=prev
           prev = temp

        }
        return curr
        */
        if(value<1){
            return 1;
        }
        int prev = 1;
        int curr = 1;
        for(int i = 2; i <= value; i++){
            int temp = curr;
            curr += prev;
            prev = temp;
        }
        return curr;
    }
}



