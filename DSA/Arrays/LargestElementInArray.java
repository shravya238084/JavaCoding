/*
int[] arr= new int[5]{8,6,9,2,5};
    Brute force
    --> sort the array
    --> we are finding the largest element at arr[n-1] possition
    -->Time complexity --> for sorting we need merge sort/ or any other -->O(nlog n)
    --> Space complexity --> qick sort -->O(1)

    Better approach
    --> we dont have better approach here

    Optiomal solution
    -->take variable max=arr[0];
    then traverse through loop if element is greater than max then replace max

    */

class LargestElementInArray(){

    public static void main(String args[]){
        int [] arr=new int[5]{8,6,9,2,5};
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max)
            max=arr[i];
        }

        System.out.println("Largest element is " + max);
    }
}