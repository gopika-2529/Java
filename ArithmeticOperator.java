import java.util.*;
class ArithmeticOperator{
	public static void main(String k[]){
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter Two Numbers:");
	int x=sc.nextInt();
	int y=sc.nextInt();
	System.out.println("Enter Any Arithmetic Operator:");
	char op=sc.next().charAt(0);
	String result=(op=='+')?"Result:"+(x+y):
	(op=='-')?"Result:"+(x-y):
	(op=='*')?"Result:"+(x*y):
	(op=='/')?"Result:"+(x/y):
	(op=='%')?"Result:"+(x%y):
	"invalid Operator!";
	System.out.println(result);
	}
}
