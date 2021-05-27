public class RecursiveTest {
    public static void main(String[] args) {
        
        int index = 0;
        RecursiveTest rt = new RecursiveTest();
        int result = rt.re(index, 0);
        System.out.println("result : " + result);

        long fib_result = rt.fib(12);
        System.out.println(fib_result);

        // int result1 = new RecursiveTest().test(index, 0);
        // System.out.println("test : " + result1);
    }

    //call stack 확인
    public int re(int index, int sum) {

        if(index >= 10 || sum >= 30) {
            System.out.println("final : " + sum);
            return sum;
        }
        System.out.println(index + " : "+ sum);
        re(index+1, sum + index);
        System.out.println("end " + sum);
        return sum; //0

        // else {
        //     System.out.println(index + " : "+ sum);
        //     re(index+1, sum + index);
        //     re(index+1, sum - index);
        //     System.out.println("end " + sum);
        //     // re(index+1, sum + index);
        //     return sum; //0
        //     // return re(index+1, sum + index);
        // }
        // return re(index+1, sum + index);
    }

    public long fib(long n) {
        if ((n == 0) || (n == 1))
           return n;
        else
           return fib(n - 1) + fib(n - 2);
     }

    // public int test(int index, int sum) {
    //     index = 10;
    //     if(index == 10) {
    //         return 100;
    //     }

    //     return 200;
    // }
}