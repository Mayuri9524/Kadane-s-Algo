# Kadane-s-Algo

Arr = {-2,3,4,-1,5,-10,7,2,-5,12}
Using above array we have to find Max SUBARRAY sum with Time Complexity o(N) and Space Complexity o(1).

Algo:- 
sum=0
for(1 to N-1):
sum += Arr[i]
if(sum<0)
  sum=0;
return sum;
