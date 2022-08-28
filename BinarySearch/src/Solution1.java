class Solution1 {
    public static int search(int[] data,int target){
        int l=0, r=data.length;

        //在data[l.r]的范围中查找target
        while (l<r){

            int mid=l+(r-l)/2;

            if (data[mid]==target)
                return mid;
            if (data[mid]<target)
                l=mid+1; //继续在data[mid+1,r]范围里寻找解
            else
                r=mid; //继续在data[l,mid)范围里寻找解
        }
        return -1;
    }
}
