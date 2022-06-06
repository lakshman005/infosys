package questions;

import java.util.*;
public class Bitwise
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr=new int[n];
		List<Integer>list = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++){
		    int ans = (arr[i]&arr[i+1])*2;
		    int a = arr[i] | arr[i+1];
		    if(ans<a){
		        list.add(arr[i+1]);
		    }
		}
		int[] sum= new int[list.size()];
		Arrays.fill(sum,1);
		for(int i=1;i<list.size();i++){
		    int j=0;
		    while(i!=j){
		        if(list.get(j)<list.get(i) && sum[i]>=sum[j]){
		            sum[i]=sum[j]+1;
		            j++;
		        }
		        else{
		            j++;
		        }
		    }
		}
		Arrays.sort(sum);
		System.out.println(sum[sum.length-1]);
	}
}
