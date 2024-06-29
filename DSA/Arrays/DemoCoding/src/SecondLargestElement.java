/*
  Brute force 
    int arr[]=new int[]{1,2,6,7,5,7};
    --> sort the array  , arr[n-2] does not contain second largest in case 
    if we have duplicate elements
    -->store max=arr[n-1]
    --> Then traverse from index(n-2) and if its smaller than max
    --> then it will be the second largest

    arr[]=[1,2,5,6,7,7]  // for sorting we need O(n log n)
    max=arr[n-1];
    for(int i=n-2;i>0;i--){   // O(n)
        if(arr[i]<max){
        secondLargest= arr[i];
        break;
        }
    }
    total complexicity O(n log n) +O(n)

 Better method 
     --> Traverse the array and find first largest --> O(n)
     int firstLargest=arr[0]; 
     for(int i=1;i<arr.length;i++){
            if(arr[i]>firstL)
            firstL=arr[i];
      }
     --> again traverse the array and compare if each element is greater 
     than seconLarge and less than firstLarge --> O(n)

     int secondL=-1;
      for(int i=0;i<arr.length;i++){
        if(arr[i]>secondL && arr[i] !=firstL)
         secondL=arr[i];
      }
     --> Total Complexity O(2n)

 Optimal Approach
  -->intialise firstL=arr[0], secondL=-1
  -->traverse through array check if (arr[i] >firstL)
  copy  secondL=firstL , firstL =arr[i]
  --> else if (arr[i]< firstL && arr[i]> secondL)

  --> O(n)
 */

public class SecondLargestElement {
    //optiomal solotion
    public static void main(String args[]){
        /*int arr[]=new int[]{1,2,6,7,5,7};
        int firstLargest=arr[0]; 
        int secondLargest=-1; 
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]>firstLargest){
                secondLargest=firstLargest;
                firstLargest=arr[i];
            }
            
            else if(arr[i]> secondLargest && arr[i]< firstLargest)
            secondLargest=arr[i];
        }
        System.out.println("Second largest " + secondLargest);
        */
        int arr[]=new int[]{5,3,6,7,1,1};
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
}
    

    
       
     
