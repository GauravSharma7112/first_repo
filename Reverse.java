import java.util.*;
class Reverse
{
	int number,reverse=0;
	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
        	System.out.printf("\nEnter the number which you want to reverse=");
        	number=sc.nextInt();
        while(number != 0)   
        {  
            int remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number/10;  
        }        
        System.out.println("The reverse of the given number is: "+reverse);
}
public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            
        System.out.printf("Reverse\n Enter 1 for Reverse number\n Enter 2 for string \nenter your choice(1-2:)");
        int opt=sc.nextInt();
        switch(opt)
        {
            case 1:Reverse r1=new Reverse();
                r1.getdata();
                break;
	    case 2:exit(0);
	
        }
        }
    }
}  