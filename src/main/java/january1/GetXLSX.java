package january1;

public class GetXLSX 
{

public static void main(String[] args) 
{

// 1) Arithmetic Operators (+ - * / %)
	
	int a=13, b=2;
	
	System.out.println("Sum of a and b is : " + (a + b));
	System.out.println("Diff of a and b is : " + (a - b));	
	System.out.println("Multiplication of a and b is : " + (a * b));
	System.out.println("Division of a and b is : " + (a / b));
	System.out.println("Modulo division of a and b is : " + (a % b));
	
// 2) Relational Operators / Comparison Operators (> >= < <= != ==)	
      // Returns Boolean values : True/False	
	
	System.out.println(a > b);    //true
	System.out.println(a < b);    //false
	System.out.println(a >= b);   //true
	System.out.println(a <= b);	  //false
	System.out.println(a != b);   //true
	System.out.println(a == b);   //false
	
// 3) Logical Operators	(&& || !)
	// Returns Boolean values : True/False
	// works between 2 boolean values
	
	boolean x=true;
	boolean y=false;
	
	System.out.println(x && y);   //false
	System.out.println(x || y);   //true
	System.out.println(!x);       //false
	System.out.println(!y);       //true
	
// 4) Increment/Decrement Operators (++ --)
	  // a) ++ is called increment operator
	
	     //case-1
	     int p=10;
	     System.out.println(p);    //10
	     
	     p++;         // p=p+1;
	     System.out.println(p);    //11
	     
	    //case-2  post increment
	    int q=10;
	    int res=q++;
	    
	    System.out.println(res);   //10
	    System.out.println(q);     //11
	          
	    //case-3  pre increment	     
	    int r=10;
	    int res1=++r;
	    
	    System.out.println(res1);   //11
	    System.out.println(r);      //11 
	
	  // b) -- is called decrement operator	
		
	     //case-1
	     int d=10;
	     System.out.println(d);    //10
	     
	     d--;          //d=d-1;
	     System.out.println(d);    //9	
	
		 //case-2  post increment
	     int e=10;
	     int res2=e--;
		    
   	     System.out.println(res2);   //10
		 System.out.println(e);      //9	
		 
		 //case-3  pre increment
		 int f=10;
		 int res3=--f;
		 
		 System.out.println(res3);   //9
		 System.out.println(f);      //9
	
// 5) Assignment Operators (= += -= *= /= %=)	
	
	  int g=10;
	  g+=2;                     
	  System.out.println(g);  //12
	
	  int h=10;
	  h-=2;
	  System.out.println(h);   //8
	 
	  int i=10;
	  i*=2;
	  System.out.println(i);   //20
	  
	  int j=10;
	  j/=2;
	  System.out.println(j);   //5
	  
	  int k=10;
	  k%=2;
	  System.out.println(k);   //0
	
//  6) Conditional/Ternary Operators (? :)	
	   // var = exp ? result1 : result2 ;
	
	   //Exp.1
	   String l= (j > k) ? "Yes" : "NO";
	   System.out.println(l);
	   
	   //Exp.2
	   int age=17;	
	   String az=(age>=30)?"yes":"no";
	   System.out.println(az);
	
	
	
	
	
	
	
	
	

    	
}
}