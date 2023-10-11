import java.util.Scanner ;
public class Main{

	public static void main(String[] args) {
	    
    int [] a = new int[3];
    a[0] = 12;
    a[1] = 3;
    a[2] = 4;
    Scanner sc = new Scanner(System.in);
    int index = sc.nextInt();  
    int dividend = sc.nextInt();
    
    try{
        int c = a[index] / dividend;
        System.out.println("The value of result is " + c);   
    }
    catch(ArithmeticException e){
        System.out.println("Not a valid arithmetic operation");
        System.out.println(e);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Please Enter valid index");
        System.out.println(e);
    }
    catch(Exception e){
        System.out.println("This is unfair division cant divide " + index +" value by " + dividend);
        System.out.println(e);
    }
  }
}


import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
	    int [ ] arr = new int[3];
	    arr[0] = 7;
        arr[1] = 56;
        arr[2] = 6;
	    boolean flag = true;
	    Scanner sc = new Scanner(System.in);
	    while(flag){
	        System.out.println("Please Enter an index");
	        int ind = sc.nextInt();
	        try{
	            
	            System.out.println("Try Gussing your luck");
	            try{
	                System.out.println(arr[ind]);
	                flag = false;
	            }
	            catch(ArrayIndexOutOfBoundsException e){
	                System.out.println("PLease enter valid index");
	                ind = sc.nextInt();
	                
	            }
	        }
	        catch(Exception e){
	           System.out.println("general error");
	       }     
	    
	    }
	}
}
