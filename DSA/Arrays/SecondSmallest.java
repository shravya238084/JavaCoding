import javax.print.DocFlavor.INPUT_STREAM;

public class SecondSmallest {
    // O(n)
    int arr[]=new int[]{1,3,6,7,2,7};
    int firstSm=arr[0]; 
    int secondSn=Integer.MAX_VALUE;

    for(int i=1;i<arr.length;i++){
        if(arr[i]<firstSm){
        secondSn=firstSm;
        firstSm=arr[i];
        }
        else if(arr[i] > firstSm && arr[i]<secondSn){
            secondSn=arr[i];
        } 
    }
    System.out.println(secondSn);
}
