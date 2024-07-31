public class SubArraySum {
    public int subSum(int[] arr)
    {
        int ans=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(sum>ans)
            {
                ans=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return ans;
    }
}
