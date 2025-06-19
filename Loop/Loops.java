import java.util.Scanner;
class Loop{
public static void main(String args[])
{
/*for(int i=0;i<10;i++)
System.out.println("Bright IT Career");
}
}
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career*/
/*int i=1;
while(i<=20)
{
System.out.println(i);
i++;
}
}
}
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20*/


/*int a=10;
int b=10;
int c=5;
if(a==b)
{
System.out.println("a is equal to b");
}
if(b==c)
{
System.out.println("b is equal to c");
}
}
}
a is equal to b*/

/*int limit=20;
System.out.println("Odd numbers upto"+limit+":");
for(int i=1;i<=limit;i++)
{
if(i%2!=0)
{
System.out.println(i+" ");
}
}
System.out.println("Even numbers upto"+limit+":");
for(int i=1;i<=limit;i++)
{
if(i%2==0)
{
System.out.println(i+" ");
}
}
}
}
Odd numbers upto20:
1
3
5
7
9
11
13
15
17
19
Even numbers upto20:
2
4
6
8
10
12
14
16
18
20*/

/*Scanner scanner=new Scanner(System.in);
System.out.println("Enter the first number:");
int num1=scanner.nextInt();
System.out.println("Enter the second number:");
int num2=scanner.nextInt();
System.out.println("Enter the third number:");
int num3=scanner.nextInt();
int largest;
if(num1>=num2&&num1>=num3){
largest=num1;
}
else if(num2>=num1&&num2>=num3){
largest=num2;
}
else{
largest=num3;
}
System.out.println("The Largest number is:"+largest);
}
}
Enter the first number:
12
Enter the second number:
6
Enter the third number:
15
The Largest number is:15*/

/*int i=1;
do{
System.out.println(i);
i++;
}
while(i<=10);
}
}
1
2
3
4
5
6
7
8
9
10*/

/*int number=10;
System.out.println("Even number between 10 and 100:");
while(number<=100){
if(number%2==0){
System.out.println(number);
}
number++;
}
}
}
even number between 10 and 100:
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
100*/

/*int n,i,rem,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
n=s.nextInt();
i=n;
while(n>0){
rem=n % 10;
sum+=rem*rem*rem;
n/=10;
}
if(i==sum){
System.out.println(i+"is a armstrong number");
}
else{
System.out.println(i+"is not a armstrong number");
}
}
}
Enter the number:
371
371is a armstrong number*/



/*int num=89;
System.out.println("The given number is:"+num);
int count=0;
if(num==2){
System.out.println(num+ "is a prime number");
}
else{
for(int i=1;i<=num;i++){
if(num%i==0){
count++;
}
}
if(count==2){
System.out.println(num+"is a prime number");
}
else{
System.out.println(num+"is not a prime number");
}
}
}
}
The given number is:89
89is a prime number*/

/*Scanner s=new Scanner(System.in);
System.out.println("Enter an integer:");
int number=s.nextInt();
int remainder=number%2;
switch(remainder)
{
case 0:
System.out.println(number+"is an even number");
break;
case-1:
System.out.println(number+"is an odd number");
break;
default:
System.out.println("Invalid input or unexpected remainder");
}
s.close();
}
}
Enter an integer:
12
12is an even number*/

/*Scanner s=new Scanner(System.in);
System.out.println("Enter gender(M/F):");
char genderChar=s.next().charAt(0);
switch(genderChar){
case 'M':
case 'm':
System.out.println("Male");
break;
case 'F':
case 'f':
System.out.println("Female");
break;
default:
System.out.println("Invalid input.Please enter M or F:");
break;
}
s.close();
}
}
Enter gender(M/F):
f
Female*/

/*int n,rev=0,i,digit;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of n:");
n=s.nextInt();
i=n;
while(n>0){
digit=n%10;
rev=(rev*10)+digit;
n=n/10;
}
if(i==rev){
System.out.println(i+"is a palindrome");
}
else
{
System.out.println(i+"is not a palindrome");
}
}
}
Enter the value of n:
323
323is a palindrome*/

int a=10;
int b=20;
int c=30;
int largest;
if(a>=b&&a>=c){
largest=a;
}
else if(b>=a&&b>=c){
largest=b;
}
else{
largest=c;
}
System.out.println("The largest number is:"+largest);
}
}
The largest number is:30


















