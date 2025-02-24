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