package vansh;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("select an option");
		System.out.println("1. Personal details ");
		System.out.println("2. Calculator ");
		System.out.println("3. Table");
		System.out.println("4. Factorial ");
		System.out.println("enter an optin no. = ");
Scanner option=new Scanner(System.in);
String ss=option.next();
switch(ss)
{
case "1" :
System.out.println("enter your personal details :-");
Scanner a=new Scanner(System.in);0
System.out.println("enter your name = ");
String name=a.nextLine();
System.out.println("enter your age = ");
int age=a.nextInt();
System.out.println("enter your father's name = ");
String fn=a.next();
System.out.println("enter your mother's name = ");
String mn=a.next();
System.out.println("enter your phone number  = ");
long phone=a.nextLong();
System.out.println("enter your gender = ");
String gender=a.next();
System.out.println("enter your marital status ( Married / Unmarried / divorcee / widow )= ");
String ms=a.next();
System.out.println("enter your caste ( Genral / OBC / SC / ST ) = ");
String c=a.next();
System.out.println("----------------------------------------------------");
System.out.println("Name = "+name);
System.out.println("Age = "+age);
System.out.println("Fateher's Name = "+fn);
System.out.println("Mother's Name = "+mn);
System.out.println("Phone Number = "+phone);
System.out.println("Gender = "+gender);
System.out.println("Marital status = "+ms);
System.out.println("Caste = "+c);
break;

case "2" :
Scanner s=new Scanner(System.in);
System.out.println("enter a first number = ");
int no1=s.nextInt();
System.out.println("enter second number = ");
int no2=s.nextInt();
int result=no1+no2;
System.out.println("first no. + second no. ="+result);
int res=no1-no2;
System.out.println("first no. - second no. ="+res);
int res2=no1*no2;
System.out.println("first no. * second no. ="+res2);
int res3=no1/no2;
System.out.println("first no. / second no. ="+res3);
break;

case "3" :
	int e,f,g,h;
	System.out.println("enter a number to print their multiplication table = ");
	Scanner in=new Scanner(System.in);
	e=in.nextInt();
	f=in.nextInt();
	for (g=e;g<=f;g++)
	{
		System.out.println("multiplication table of "+g);


		for(h=1;h<=10;h++)
		{
			System.out.println(g+"*"+h+"="+(g*h));
			
		}
	}
	break;
	
case "4" :

	Scanner j=new Scanner(System.in);
	System.out.println("enter a number = ");
	int n=j.nextInt();
	int fact=1;
	for (int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
	break;

	default:
		System.out.println("invalid choice");

}
}	
	}
	



