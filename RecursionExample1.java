public class RecursionExample1 {

    // 팩토리얼
    public static int factorial(int n){
        if(n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }

    // x의 n 제곱
    public static double power(double x, int n){
        if(n==0)
            return 1;
        else
            return x * power(x, n-1);
    }

    // 피보나치 수열
    public static int fibonacci(int n){
        if(n<2)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    //최대공약수 Euclid method
    public static int gcd(int m, int n){
        if(m<n){
            int tmp=m; // swap m and n
            m=n;
            n=
            tmp;
        }
        if(m%n == 0)
            return n;
        else
            return gcd(n,m%n); //m%n 을 해도 m,n의 최대공약수가 보존됨 -> gcd(n,m%n) 을 하는 이유는 안에 숫자를 줄이기 위헤
    }

    // 최대공약수 Euclide method
    public static int gcd2(int p, int q){
        if(q==0)
            return p;
        else
            return gcd2(q,p%q);
    }
}