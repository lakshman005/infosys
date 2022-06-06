package questions;
import java.util.*;
public class hardestQuest
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pow =sc.nextInt();
		int[] arr= new int[n];
		int[] ar= new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		    ar[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++){
		    for(int j=0;j<n-i-1;j++){
		        if(arr[j]>arr[j+1]){
		            int temp =arr[j+1];
		            arr[j+1]=arr[j];
		            arr[j]=temp;
		            int tem=ar[j+1];
		            ar[j+1]=ar[j];
		            ar[j]=tem;
		        }
		    }
		}
		int sum=0;
		for(int i=0;i<n;i++){
		    if(pow>=arr[i]){
		        pow+=ar[i];
		        sum++;
		    }
		    
		}
		System.out.println(sum);
	}
}

