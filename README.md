# february24_2025
The problem that I solved today

1.Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1. You must write an algorithm with O(log n) runtime complexity.

Code:
class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                l=mid+1;
            else
                r=mid-1;
        }
        return -1;
    }
}

2.Given a sorted array arr[] (with unique elements) and an integer k, find the index (0-based) of the largest element in arr[] that is less than or equal to k. This element is called the "floor" of k. If such an element does not exist, return -1.

Code:
class Solution {
    static int findFloor(int[] arr, int k) {
        int ans=-1;
        int l=0,r=arr.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]<=k)
            {
                ans=mid;
                l=mid+1;
            }
            else
                r=mid-1;
        }
        return ans;
    }
}

3.Given an unsorted array arr[] of integers and an integer x, find the floor and ceiling of x in arr[].
Floor of x is the largest element which is smaller than or equal to x. Floor of x doesn’t exist if x is smaller than smallest element of arr[].
Ceil of x is the smallest element which is greater than or equal to x. Ceil of x doesn’t exist if x is greater than greatest element of arr[].
Return an array of integers denoting the [floor, ceil]. Return -1 for floor or ceiling if the floor or ceiling is not present.

Code:
class Solution {
    public int getFloor(int[] arr,int x)
    {
        int l=0,r=arr.length-1,ans=-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]<=x)
            {
                ans=arr[mid];
                l=mid+1;
            }
            else
                r=mid-1;
        }
        return ans;
    }
    public int getCeil(int[] arr,int x)
    {
        int l=0,r=arr.length-1,ans=-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]>=x)
            {
                ans=arr[mid];
                r=mid-1;
            }
            else
                l=mid+1;
        }
        return ans;
    }
    public int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        int a=getFloor(arr,x);
        int b=getCeil(arr,x);
        return new int[]{a,b};
    }
}
