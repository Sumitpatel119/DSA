class BubbleSort{
    static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={99,82,2,10,77,1,45};
        BubbleSort.bubbleSort(arr);
        for(int item : arr){
            System.out.print(item+" ");
        }
    }
}
