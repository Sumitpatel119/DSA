class D{
    static int calculateFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int prevFact=calculateFactorial(n-1);
        int fact=n*prevFact;
        return fact;
    }
    public static void main(String[] args){
        System.out.println(calculateFactorial(10));
    }
}
