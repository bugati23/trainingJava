package task;

public class DoSomething {
    public static double hypotenuseСalculation(double a, double b){
        if( a <= 0 || b <= 0 ){
            throw new IllegalArgumentException("Invalid values!!!");
        }
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }
    public static double areaСalculation(double a, double b){
        if( a <= 0 || b <= 0 ){
            throw new IllegalArgumentException("Invalid values!!!");
        }
        return a*b/2;
    }
    public static int[] fillArray(int n){
        if(n < 1){
            throw new IllegalArgumentException("Negative size!!!");
        }
        int[] array = new int[n];
        for(int i = 0 ; i < n; i++){
            array[i] = (int)(Math.random()*100);
        }
        return array;
    }
    public static void printArray(int[] array){
        for(int el : array) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
    public static int summaOfK(int k, int[] array){
        if( k == 0){
            throw new IllegalArgumentException("Invalid values!!!");
        }
        int summa = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] % k == 0){
                summa+=array[i];
            }
        }
        return summa;
    }
    public static double[] fillSequence(int n){
        if(n < 1){
            throw new IllegalArgumentException("Negative size!!!");
        }
        double[] sequence = new double[n];
        for(int i = 0 ; i < n; i++){
            sequence[i] = (Math.random()*200) - 100;
        }
        return sequence;
    }
    public static void printSequence(double[] sequence){
        for(double el : sequence) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
    public static boolean isIncreasing(double[] sequence){
        for(int i = 1; i < sequence.length; i ++){
            if(sequence[i-1] > sequence[i]){
                return false;
            }
        }
        return true;
    }
}
