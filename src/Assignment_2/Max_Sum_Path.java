package Assignment_2;
import java.util.*;
class Max_Sum_Path {

	static int max(int x, int y) 
    { 
        return (x > y) ? x : y; 
    }

	static int maxPathSum(int ar1[], int ar2[], int m, int n)
	{
		int i = 0, j = 0;
		int result = 0, sum1 = 0, sum2 = 0;
		while (i < m && j < n) {
			
			if (ar1[i] < ar2[j])
				sum1 += ar1[i++];
			else if (ar1[i] > ar2[j])
				sum2 += ar2[j++];
			else {
				result += max(sum1, sum2) + ar1[i];
				sum1 = 0;
				sum2 = 0;
				i++;
				j++;
			}
		}

		
		while (i < m)
			sum1 += ar1[i++];

		while (j < n)
			sum2 += ar2[j++];
		result += max(sum1, sum2);

		return result;
	}

	
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-- > 0){
         int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[] = new int[m];
		int a[] = new int[n];
      for(int i=0;i<m;i++)
          arr[i]=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
        int ma=maxPathSum(arr,a,m,n);
	     System.out.println(ma);
        }
	}
}
