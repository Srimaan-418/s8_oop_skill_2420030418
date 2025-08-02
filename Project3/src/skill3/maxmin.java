package skill3;
import java.util.Scanner;
public class maxmin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		System.out.print("Enter the values of array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<n;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("The maximum value in the array is: "+max);
		System.out.println("The minimum value in the array is: "+min);
		sc.close();
	}

}
