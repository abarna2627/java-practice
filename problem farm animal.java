import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int x = read.nextInt();
    		int y = read.nextInt();
    		int z = read.nextInt();
    		if(z%x==0 && z%y==0)
    		System.out.println("ANY");
    		else if(z%x==0)
    		System.out.println("CHICKEN");
    		else if(z%y==0)
    		System.out.println("DUCK");
    		else
    		System.out.println("NONE");
		}
	}
}