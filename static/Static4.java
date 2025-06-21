/*class Methods
{
static int a=10;
static int b=20;
int c=30;
int d=40;
static void s1()
{
System.out.println("static method 1");
}
static void s2()
{
System.out.println("static method 2");
System.out.println(a);
System.out.println(b);
}
void instancemethod1()
{
System.out.println("instance method 1");
}
void instancemethod2()
{
System.out.println("instance method 2");
}
public static void main(String args[])
{
Methods m=new Methods();
m.s1();
m.s2();
System.out.println("executed successfully");
}
}
static method 1
static method 2
10
20
executed successfully*/

/*class Instancevar
{
int a=10;
int b=20;
static void greet()
{
Instancevar obj=new Instancevar();
System.out.println(obj.a);
System.out.println(obj.b);
}
public static void main(String args[])
{
System.out.println("executed successfully");
greet();
}
}
executed successfully
10
20*/

/*public class Instancevariable
{
 static int a=10;
static  int b=20;
void greet()
{
System.out.println(a);
System.out.println(b);
}
public static void main(String args[])
{
System.out.println("hi");
Instancevariable obj=new Instancevariable();
obj.greet();
}
}
hi
10
20*/

/*class Static
{
void instance()
{
System.out.println("Instance method ");
}
static void staticmethod()
{
Static s=new Static();
s.instance();
}
public static void main(String args[])
{
System.out.println("Main Method ");
staticmethod();
}
}
Main Method
Instance method*/

/*class Static1{
static void a()
{
System.out.println("Static Method ");
}
void ins()
{
a();
}
public static void main(String args[])
{
Static1 s=new Static1();
s.ins();
}
}
Static Method*/

/*class Static3{
static int a=10;
static int b=20;
int c=30;
int d=40;
public static void main(String args[])
{
System.out.println("Static variables:");
System.out.println(a);
System.out.println(b );
Static3 s=new Static3();
System.out.println("Instance variables:");
System.out.println(s.c);
System.out.println(s.d );
}
}
Static variables:
10
20
Instance variables:
30
40*/

class Static4
{
static void a()
{
System.out.println("welcome:");
}
void ins()
{
public static void main(String args[])
{
System.out.println("Main method");
a();
Static4 s=new Static4();
s.ins();
}
}
























