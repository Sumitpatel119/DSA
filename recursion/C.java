class C{
    static void recursiveFunction(int i,int n,int sum){
        if(i>n){
            System.out.println(sum);
            return;
        }
        sum +=i;
        recursiveFunction(i+1,n,sum);
    }
    public static void main(String[] args){
        recursiveFunction(1,10,0);
    }
}
