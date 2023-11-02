package Phase1Module4;

import java.util.Scanner;

class ExponentialSearch {

	int a[]= new int[10], n, x, l, h, mid, bound, indx;
	
	void accept() {

		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		n = sc.nextInt();
		System.out.println("Enter the elements of the array : ");

		for(i=0; i<n; i++)
			a[i] = sc.nextInt();

		System.out.println("\nEnter the element to search : ");
		x = sc.nextInt();
	}

	int binary_search(int a[], int l, int h, int x)
	{
		if(l>h)
			return -1;
		mid = (l+h)/2;

		if (x==a[mid])
			return mid;

		else if(x<a[mid])
			return binary_search(a,l,mid-1,x);

		else 
			return binary_search(a, mid+1, h, x);
	}

	void search() {

		bound =1;

		while(bound<n && a[bound]<x) {
		}

		indx = binary_search(a,bound/2,Math.min(bound, n),x);

		if (indx!= -1)
			System.out.println("Element "+x+" found at index "+indx);
		else
			System.out.println("Element not found");	
	}

	public static void main(String[] args) {

		ExponentialSearch e = new ExponentialSearch();

		e.accept();
		e.search();		

	}
}