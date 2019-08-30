class e509 {
    public static int fib(int N) {
        if (N == 0){
            return 0;
        } else if (N == 1 || N == 2){
            return 1;
        }
        return fib(N-1) + fib(N-2);
    }

    public static void main(String[] args){
        System.out.println(fib(2)); //1
        System.out.println(fib(3)); //2
        System.out.println(fib(4)); //3
    }
}