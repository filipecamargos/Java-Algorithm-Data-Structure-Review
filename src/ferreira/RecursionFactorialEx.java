package ferreira;

public class RecursionFactorialEx {
    public static void main(String[] args){

        System.out.println(recursiveFactorialex(1)); //1
        System.out.println(recursiveFactorialex(2)); //2
        System.out.println(recursiveFactorialex(3)); //6
        System.out.println(recursiveFactorialex(4)); //24
        System.out.println(recursiveFactorialex(5)); //120
    }

    /**
     * Factorial formula = n! = n * (n - 1)!
     */
    public static int recursiveFactorialex(int num){
        //To break out of the recursion - You don't want to have a recursion stack overflow in you memory
        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorialex(num -1);
    }
}
