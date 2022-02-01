import java.util.*;
class Quick 
{
    public void qi() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements in array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++) 
        a[i]=sc.nextInt();
	System.out.println("enter the element to be found");
	int x=sc.nextInt();
	for (i=0;i<n;i++)
	{
		if(x==a[i])
		{
			System.out.println("ele found at index",+a[i]);
		}
		else
		{
	
			System.out.println("ele found at index",+a[i]);
		}
			
}
}	
public static void main(String args[])
{
	Quick q1=new Quick();
	q1.qi();
}
}
