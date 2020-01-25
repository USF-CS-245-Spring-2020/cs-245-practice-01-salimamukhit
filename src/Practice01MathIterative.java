public class Practice01MathIterative implements Practice01Math {
    public int fib(int n) {
        int prev = 0;
        int next = 1;
        int fibNum = 0;
        if (n==1) {
            return 1;
        }
        if (n>1) {
            for (int i=0; i<n-1; i++) {
                fibNum = prev+next;
                prev = next;
                next = fibNum;
            }
        }
        return fibNum;
    }

    public int fact(int n) throws Exception {
        if (n<0) {
            throw new Exception();
        }
        if (n==0) {
            return 1;
        } else if (n==1){
            return 1;
        }
        int factorial = 1;
        for (int i=1; i<=n; i++) {
            factorial = factorial*i;
        }
        return factorial;
    }
}
