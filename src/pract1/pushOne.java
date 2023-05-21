package pract1;

public class pushOne {
    public static void main(String[]args){
        int arr[]={1,0,1,0,0,1,0,1,1,0,1,0,1,0,0};
        int n=arr.length;
        pushAllOne(arr,n);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void pushAllOne(int arr[], int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[count]=0;
                count++;
            }
        }while(count<n){
            arr[count]=1;
            count++;
        }
    }
}
