public class Practice01MathRecursive implements Practice01Math {
    public int fib(int n) {
        if (n==0) {
            return 0;
        } else if (n==1) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public int fact(int n) throws Exception {
        if (n < 0) {
            throw new Exception();
        }
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 1;
        } else {
            return n*fact(n-1);
        }
    }
}
