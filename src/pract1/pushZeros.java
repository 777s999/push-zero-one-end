package pract1;

public class pushZeros {
    public static void main(String[] args){
        int arr[]={9,0,8,0,0,5,0,1,0,2};
        int n=arr.length-1;
        pushZerosEnd(arr,n);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void pushZerosEnd(int arr[], int n){
        int count=0; // to count non zeros elements
        for(int i=0;i<=n;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        while(count<=n){
            arr[count]=0;
            count++;
        }
    }
}
