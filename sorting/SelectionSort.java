class SelectionSort{
    static int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={36,82,2,10,22,1,87,45};
        selectionSort(arr);
        for(int item : arr){
            System.out.print(item+" ");
        }
    }
}
