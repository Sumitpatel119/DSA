class A{
    static void recursiveFunction(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        recursiveFunction(n+1);
    }
    public static void main(String[] args){
        recursiveFunction(1);
    }
}
