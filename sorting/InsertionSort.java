class InsertionSort{
    static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={36,82,2,10,22,1,87,45};
        insertionSort(arr);
        for(int item : arr){
            System.out.print(item+" ");
        }
    }
}
