import java.util.*;
class ArNum{
	public static void main(String x[]){
	int a[]=new int[10];
	Scanner sc=new Scanner (System.in);	
	System.out.println("Enter The Limit:");
	int n=sc.nextInt();
	System.out.println("Accept The Req Numbers:");
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	System.out.print("The Numbers Are");
	for(int i=0;i<n;i++)
		System.out.println(a[i]);
	}
}