package skill3;
import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter the values of array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Original array : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+arr[i]);
		}
		int left=0;
		int right=n-1;
		int temp;
		while(left<right)
		{
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		System.out.print(" Reversed array : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+arr[i]);
		}
		sc.close();
	}

}
