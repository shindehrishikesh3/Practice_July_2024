package january1;

import java.util.Scanner;

public class July2024 
{

	
public static void main(String[] args) 
{


Scanner sc=new Scanner(System.in);
	
System.out.println("Enter Age : ");
/*
	boolean a=sc.nextBoolean();
	boolean b=sc.nextBoolean();
*/
	
int a=sc.nextInt();
System.out.println("DOC : ");
boolean b=sc.nextBoolean();
//int c=300;
	
	
if((a>18) && (b==true))
{
	System.out.println("BOTH HAVE");
}else if((a<18) || (b==true))
{
	System.out.println("ONLY DOC");
}else if((a>18) || (b==false))
{
	System.out.println("ONLY AGE");
}else
{
	System.out.println("FAIL");
}
	
	
	
	
	
	
	
	
	

	
	
	

}}
