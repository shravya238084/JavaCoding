/*
     Brute force
       -->take set and insert each element into set -->O(nlog n)
       --> then take elements from set and assign back to the original array , -->O(n)
       where the index ends -->that the size of unique array
      --> total time complexity O(nlog n + n) , space --> O(n)

    
    public int removeDuplicates(int[] nums) {
        Set <Integer> num1=new HashSet<Integer>();
        for(int t: nums){
            num1.add(t);
        }
  
        int j=0;
        for(Integer i:num1){
            nums[j]=i;
            j++;
        }
        return j;
    }



    Optimal method
       -->double pointer
     -->navigate through array using i and j
     --> when arr[i] !=arr[j]  {   time complexity -->O(n)
        arr[i+1]=arr[j] ;          space complexity -->O(1)
        i++;
    }
*/  

class Solution {
  public int removeDuplicates(int[] nums) {
      int i=0;
      for (int j=1;j<nums.length;j++){
          if(nums[i]!=nums[j]){
              nums[i+1]=nums[j];
              i++;
          }
      }
      return (i+1);
  }
}