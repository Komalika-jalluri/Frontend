/*program1
class Array
{
public static void main(String[] args)
{
int a[]=new int[3];
int sum=0;
a[0]=1;
a[1]=2;
a[2]=3;
sum=a[0]+a[1]+a[2];
System.out.println("the sum is:"+sum);
}
}
output:-the sum is:6*/

/*program2
class Array
{
public static void main(String[] args)
{

int a[]=new int[3];
int sum=0;
int length=a.length;
double avg;
a[0]=4;
a[1]=2;
a[2]=3;
sum=a[0]+a[1]+a[2];
avg=sum/length;
System.out.println("the avg is:"+avg);
}
}
output:-the avg is:3.0*/
/*program3
import java.util.Scanner;
class Array6{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the no.ofvalues");
int n= s.nextInt();
int a[]=new int[n];
System.out.println("enter the numbers"+n);
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("enter the element to find");
int b=s.nextInt();
int index=-1;
for(int i=0;i<n;i++)
{
if(a[i]==b)
{
index=i-1;
System.out.println("the index is"+i);
}
}
}
}
output:-Enter the no.ofvalues
4
enter the numbers4
2
3
4
6
enter the element to find
6
the index is3*/
/*program4
import java.util.Scanner;
public class Array5{
public static void main(String args[])
{
int n;
boolean found=false;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of n:");
n=s.nextInt();
int a[]={10,20,30,40,50};
for(int i=0;i<a.length;i++)
{
if(a[i]==n)
{
found = true;
}
}
if(found)
{
System.out.println("found a specified value ");
}
else {
System.out.println(" not found a specified value");
}
}
}
output:-Enter the value of n:20
found a specified value*/
/*program5
import java.util.Scanner;
class RemoveElement {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of elements: ");
int n = sc.nextInt();
int arr[] = new int[n];
for(int i=0; i<n; i++) {
System.out.print("Enter value " + (i+1) + ": ");
arr[i] = sc.nextInt();
}
System.out.print("Enter value to remove: ");
int value = sc.nextInt();
int count = 0;
for(int i=0; i<n; i++) {
if(arr[i] != value) {
count++;
}
}
int newArr[] = new int[count];
int j = 0;
for(int i=0; i<n; i++) {
if(arr[i] != value) {
newArr[j] = arr[i];
j++;
}
}
System.out.print("Array after removing " + value + ": ");
for(int i=0; i<newArr.length; i++) {
System.out.print(newArr[i] + " ");
}
}
}
output:-Enter number of elements: 4
Enter value 1: 2
Enter value 2: 4
Enter value 3: 6
Enter value 4: 8
Enter value to remove: 4
Array after removing 4: 2 6 8
*/
/*program6
import java.util.Scanner;
class Array
{
public static void main(String args[])
{
int n,i;
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of an array:");
n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
System.out.print("Enter the values of an array:"); 
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("the values of an array a:");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("the values of an array b:");
for(i=0;i<n;i++)
{
System.out.println(b[i]=a[i]);
}
s.close();
}
}
output:-Enter the size of an array:4
Enter the values of an array:1 2 3 4
Display the values of an array a:
1
2
3
4
Display the values of an array b:
1
2
3
4
*/

/*program7
import java.util.Scanner;
class InsertElement {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter size: ");
int n = sc.nextInt();
int arr[] = new int[n+1];
System.out.println("Enter elements:");
for(int i=0; i<n; i++) {
arr[i] = sc.nextInt();
}
System.out.print("Enter position (0 to " + n + "): ");
int pos = sc.nextInt();
System.out.print("Enter value: ");
int val = sc.nextInt();
for(int i=n; i>pos; i--) {
arr[i] = arr[i-1];
}
arr[pos] = val;
System.out.print("Array after insertion: ");
for(int i=0; i<=n; i++) {
System.out.print(arr[i] + " ");
}
}
}
output:-Enter size: 4
Enter elements:
1
3
5
6
Enter position (0 to 4): 1
Enter value: 1
Array after insertion: 1 1 3 5 6*/
/*program8
class Arrays
{
public static void main(String args[])
{  int arr[]={2,5,9,4};
int max=arr[0], min=arr[1];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
max=arr[i];
if(arr[i]<min)
min=arr[i];
}
System.out.println("max"+max);
System.out.println("min"+min);
}
}
output:-max9
min2
*/
/*program9
import java.util.Scanner;
class Array2{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter array element " + (i + 1) + ":");
            arr[i] = s.nextInt();
        }

        System.out.println("Original elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Reverse elements:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
output:=Enter the size of an array:4
Enter the values of an array:2
4
6
8
Display the values of an array a:
2
4
6
8
Display the values of an array b:
2
4
6
8*/
/*program10
class Array3{
public static void main(String args[])
{
int arr[]={3,1,3,5};
for(int i=0; i<arr.length-1;i++)
{
for(int j=1; j<arr.length; j++)
{
if(arr[i]==arr[j])
{
System.out.println("duplicate numbers"+arr[i]);
}
}
}
}
}
output:-duplicate numbers3
duplicate numbers1
duplicate numbers3*/

/*program11
import java.util.Scanner;
class CommonValues {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter size of first array: ");
int n = sc.nextInt();
int arr1[] = new int[n];
System.out.println("Enter elements of first array:");
for(int i=0; i<n; i++) {
arr1[i] = sc.nextInt();
}
System.out.print("Enter size of second array: ");
int m = sc.nextInt();
int[] arr2 = new int[m];
System.out.println("Enter elements of second array:");
for(int i=0; i<m; i++) {
arr2[i] = sc.nextInt();
}
System.out.println("Common values: ");
for(int i=0; i<n; i++) {
for(int j=0; j<m; j++) {
if(arr1[i]==arr2[j]) {
System.out.print(arr1[i] + " ");
break;
}
}
}
}
}
output:-
Enter size of first array: 4
Enter elements of first array:
1
2
3
4
Enter size of second array: 4
Enter elements of second array:
2
4
6
8*/
/*program12
import java.util.Scanner;
class RemoveDuplicates
{public static void main(String[] args) {Scanner sc = new Scanner(System.in);
System.out.print("Enter size: ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter elements:");
for(int i=0; i<n; i++) 
{ 
arr[i] = sc.nextInt();
}
System.out.print("Array without duplicates: ");
for(int i=0; i<n; i++) 
{
boolean isDuplicate = false;
for(int j=0; j<i; j++) {
if(arr[i]==arr[j]) 
{
isDuplicate = true;
break;
}
}
if(!isDuplicate)
{
System.out.print(arr[i] + " ");
}
}
}
}
output:-Enter size: 4
Enter elements:
1
2
2
4
Array without duplicates: 1 2 4*/
/*program13
class SecondLargest
{
public static void main(String[] args)
{
 int[] a = {10, 12, 5, 8, 2};
        int temp;
for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
System.out.println("Second largest number is: " + a[1]);
    }
}
output:-Second largest number is: 10*/

/*program14
class SecondLargest
{
public static void main(String[] args)
{
 int[] a = {20, 15, 6, 9, 1};
        int temp;
for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
System.out.println("Second largest number is: " + a[1]);
    }
}
output:-java SecondLargest.java
Second largest number is: 15*/
/*program15
class Array4 {
   public static void main(String[] args) {
 int arr[] = {13, 6, 8, 2, 5, 4};
System.out.println("Even numbers:");
  printEven(arr);
 System.out.println("Odd numbers:");
 printOdd(arr);
    } 
static void printEven(int[] arr)

{
 for (int num: arr) {
 if (num % 2 == 0) {
 System.out.print(num + " ");
 }
 } System.out.println();
 }
static void printOdd(int[] arr) { 
 for (int num : arr) 
{
 if (num % 2 != 0)
 {
  System.out.print(num + " ");
 }
 }
 System.out.println();
}
}
output:-Even numbers:
6 8 2 4
Odd numbers:
13 5*/
/*program16
import java.util.Scanner;
class DiffLargestSmallest
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter size: ");
int n = sc.nextInt();
int arr[]= new int[n];
System.out.println("Enter elements:");
for(int i=0; i<n; i++) 
{
arr[i] = sc.nextInt();
}
int min = arr[0], max = arr[0];
for(int i=1; i<n; i++) {
if(arr[i]<min) {
min = arr[i];
}
if(arr[i]>max) 
{
max = arr[i];
}
}
System.out.println("Difference: " + (max - min));
}
}
output:-Enter size: 4
Enter elements:
1
2
3
4
Difference: 3
*/

/*program19
import java.util.Scanner;
class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the size:");
        int n = sc.nextInt(); 
        int[] arr = new int[n];

        System.out.println("Enter 99 numbers from 1 to 100 (one number is missing):");
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

          int total = 100 * 101 / 2;

        System.out.println("Missing number: " + (total - sum));
    }
}
*/
