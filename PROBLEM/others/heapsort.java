package PROBLEM.others;

import java.util.Arrays;

public class heapsort{
	
	public static void main(String[] args) {
		 int []a= {16,7,22,3,19,9,33};
		
		
		heapsort obj=new heapsort();
		obj.sort(a, a.length);
		System.out.println(Arrays.toString(a));
	}
	
	public void sort(int []a, int size) {
		for (int i=size/2-1; i>=0; i--) {
			hepify(a, size, i);
			
		}
		for(int i=size-1; i>=0; i--) {
			int temp= a[0];
			a[0]=a[i];
			a[i]=temp;
			hepify(a,i,0);
			
		}
	}
	public void hepify(int[]a, int size, int i) {
		
	int  largest= i;
	int left=2*i+1;
	int right =2*i+2;
	if(left< size && a[left]>a[largest]) {
		largest=left;
		
			}
	if(right<size && a[right]>a[largest]) {
		largest=right;
	}
	if(largest!=i) {
		int temp=a[i];
		a[i]=a[largest];
		a[largest]= temp;
		
		hepify(a, size, largest);
		
	}
		
	}
	
}