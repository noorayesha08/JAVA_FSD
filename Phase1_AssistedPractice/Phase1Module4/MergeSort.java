package Phase1Module4;

import java.util.Scanner;

public class MergeSort {
	
	public static void main(String[] args)
	   {
	      int i, k=0;
	      int[] merge = new int[100];
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the size of first array: ");
	      int x = scan.nextInt();
	      int[] a = new int[x];
	      System.out.print("Enter " +x+ " elements for first array: ");
	      for(i=0; i<x; i++)
	      {
	         a[i] = scan.nextInt();
	         merge[k] = a[i];
	         k++;
	      }
	      System.out.print("\nEnter the size of second array: ");
	      int y = scan.nextInt();
	      int[] b = new int[y];
	      System.out.print("Enter " +y+ " elements for second array: ");
	      for(i=0; i<y; i++)
	      {
	         b[i] = scan.nextInt();
	         merge[k] = b[i];
	         k++;
	      }
	      
	      System.out.println("\nThe merged array is: ");
	      for(i=0; i<k; i++)
	         System.out.print(merge[i]+ " ");
	   }

}
