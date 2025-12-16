package Arrays;
import java.util.Scanner;
public class firstArray {
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int largestNumber(int arr[]){
        int maxNum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(maxNum<arr[i]){
                maxNum = arr[i];

            }
        }
        return maxNum;
    }
    public static int binarySearh(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid =(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            
        }
        return -1;
    }
    //print arr
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //print pais
    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            
        }
    }
    public static void subArray(int arr[]){
        for(int i=0;i<arr.length;i++){ //arr length = 4
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");

                }
                System.out.println();
            }
        }
    }
    //max sum subArray
       public static int subArrayMaxSum(int arr[]){
      int currSum = 0;
      int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){ //arr length = 4
            for(int j=i;j<arr.length;j++){
                 currSum = 0;
                for(int k=i;k<=j;k++){
                    currSum+=arr[k];
                }
                if(maxSum<currSum){
                    maxSum = currSum;
                }
              
            }
        }
        return maxSum;
    }
    //kadans algorithms
    public static int kadans(int arr1[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++){
            currSum+=arr1[i];
            if(maxSum<currSum){
                maxSum = currSum;
            }


        }
        return maxSum;


    }
    //trapping rainwater
    public static int trappingRainWater(int height[]){
        int n = height.length;
        //leftMax
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //rightMax
        int rightMax[] = new int [n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        //waterLevel
        int trappedWater = 0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            //Trapped Water
            trappedWater+=(waterLevel-height[i])*1;
        }
        return trappedWater;
        
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int arr1[] = {-2-3,4,-1,-2,1,5,-3};
        int height[] = {4,2,0,6,3,2,5};
        // subArray(arr);
        // System.out.println(subArrayMaxSum(arr));
        // pairs(arr);
        // print(arr);
        // reverseArray(arr);
        // print(arr);
        // System.out.println(binarySearh(arr, key));
        // System.out.println(linearSearch(arr, key));
        // System.out.println(largestNumber(arr));
        // System.out.println(kadans(arr1));
        System.out.println(trappingRainWater(height));
        
     
}
}
