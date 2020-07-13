import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaPracticeClass {

	public static void main(String[] args) {
		
		// How to find an odd number ;
		int a =22;  
		
		if (a%2==0) {
			System.out.println(a+ " is an odd number ");
			}
		else {
			System.out.println(a+ " is not an odd number");
		}
	
		
		
		
		//2.How to reverse String and Integer;
	//string 
	
	String b = "Hello America";
	StringBuffer sb=new StringBuffer(b);
	System.out.println(sb.reverse());
	
	///Reverse integer
	int s = 1234;
	
	String numbers= String.valueOf(s);
	StringBuffer stb= new StringBuffer(numbers);
	System.out.println(stb.reverse());
		
	//3Write a program to sort array in ascending order?
	
	int [] r= {23,5,7,1,8,22};
	Arrays.sort(r);
	System.out.println(Arrays.toString(r));
		
	//desc order 
	int [] d = {3,9,8,0,6};
	Arrays.sort(d);
	System.out.println(Arrays.toString(d));
	
		//4 Verify if two giving String are equel
	
	String t="Fara";
	String y= "Farang";
	if (t.equals(y)) {
		System.out.println("String " +t+ " and String " +y+ " are equal");}
		else {
			System.out.println("String " +t+ " and String " +y+ "are not equal\"");
		}
	}
		
	}
	