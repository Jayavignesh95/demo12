package demo12;
class as
{
	static void a()
	{
		System.out.println("Static ");
	}
}
class as1 extends as
{
String name;
static void a()
{
	System.out.println("Static 1");
}
as1(String str)
{
name = str;
System.out.println("I am inside parameterized constructor.");
System.out.println(str);
    }

}
class asd {
public static void main(String args[]){
          as1.a();
    }
}