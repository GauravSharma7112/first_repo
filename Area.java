import java.util.*;
class Area
{
	int b,h,a;
	Scanner sc=new Scanner(System.in);
	public void getdata()
	{
		System.out.print("enter b=");
		b=sc.nextInt();
		System.out.print("enter h=");
		h=sc.nextInt();
	}
	public void display()
	{
		a=(h*b)/2;
		System.out.print("area is:"+a);
	}
public static void main(String s[])
{
	Area a1=new Area();
	a1.getdata();
	a1.display();
}
}
