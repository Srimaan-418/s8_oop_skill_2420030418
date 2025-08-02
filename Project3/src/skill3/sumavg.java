package skill3;
import java.util.Scanner;
public class sumavg {

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
int sum=0;
int avg=0;
for(int i=0;i<n;i++)
{
	sum+=arr[i];
}
avg=sum/n;
System.out.println("The sum of the numbers in array is:"+sum);
System.out.println("The avg of the numbers in array is:"+avg);
sc.close();
	}

}
