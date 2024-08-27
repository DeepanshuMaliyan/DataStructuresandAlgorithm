public class Max_Min_in {
    public static void main(String[] args){
        int arr[] = {1,3,5,0,32,43,12};
        int[] result = Max_Min(arr);
        System.out.println("Max : "+result[0]);
        System.out.println("Min : "+result[1]);

    }
    
    public static int[] Max_Min(int arr[]){
        int max = -Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return new int[] {max,min};
    }
}
