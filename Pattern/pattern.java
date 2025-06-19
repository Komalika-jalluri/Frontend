class Pattern
{
public static void main(String args[])
{
int i,j;
/*pattern1
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
System.out.print("*");
}
System.out.println(" ");
}
}
}*/
/*pattern2
for(i=1;i<6;i++)
{
for(j=1;j<5;j++)
{
System.out.print(i+" ");
}
System.out.println(" ");
}
}
}*/
/*pattern3
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(j+" ");
}
System.out.println(" ");
}
}
}*/
/*pattern4
int n=1;
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(n+" ");
n++;
}
System.out.println(" ");
}
}
}*/
/*pattern5
int n=1;
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(n+" ");
n++;
if (n>9)
{
n=1;
}
}
System.out.println(" ");
}
}
}*/
/*pattern6
int n=1;
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(n+" ");
n=n+2;
}
System.out.println(" ");
}
}
}*/
/*pattern7
int n=1;
for(i=1;i<6;i++)
{
for(j=1;j<6;j++)
{
System.out.print(n+" ");
n--;
if (n!=0)
{
n=1;
}
}
System.out.println(" ");
}
}
}*/
/*pattern8
for(i=0;i<6;i++)
{
for(j=0;j<i;j++)
{
System.out.print("*");
}
System.out.println(" ");
}
}
}*/
/*pattern15
int n=7;
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
if(i==n/2+1||j==n/2+4)
System.out.print("* ");
else
System.out.print(" ");
}
System.out.println(" ");
}
}
}*/
/*pattern10
String word="INDIA";
for(i=1;i<=word.length();i++)
{
System.out.println(word.substring(0,i));
}
}
}*/

/*pattern11
for(i=0;i<=5;i++)
{
for(j=0;j<=5;j++)
{
if(j<6-i)
{
System.out.print(" ");
}
else
{
System.out.print(" * ");
}
}
System.out.println(" ");
}
}
}



       *
     *  *
    *  *  *
   *  *  *  *
  *  *  *  *  **/

/*pattern9
for(i=1;i<=5;i++)
{
for(j=1;j<=5-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print((2*k)+" ");
}
System.out.println();
}
}
}
     2
   2 4
  2 4 6
 2 4 6 8
2 4 6 8 10*/

/*pattern12
int n=4;
for(i=1;i<=n;i++)
{
for(j=1;j<n;j++)
{
System.out.print(" ");
}
for(j=1;j<=(2*i-1);j++){
System.out.print("*");
}
System.out.println();
}
for(i=n-1;i>=1;i--){
for(j=n;j>i;j--)
{
System.out.print(" ");
}
for(j=1;j<=(2*i-1);j++){
System.out.print("*");
}
System.out.println();
}
}
}*/

/*pattern14
int n=5;
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
if(i==1||j==1||j==n)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}
*****
*      *
*      *
*      *
*      *
******/

/*pattern13
int n=4;
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
System.out.print(" ");
System.out.print("*");
if(i!=0)
{
for(j=0;j<2*i-1;j++)
System.out.print(" ");
System.out.print("*");
}
System.out.println();
}
for(i=n-2;i>=0;i--){
for(j=0;j<n-i-1;j++)
System.out.print(" ");
System.out.print("*");
}
System.out.println();
}
}
}*/

/* pattern16
int n=7;
for(i=1;i<=n;i++)
{
for(j=0;j<=n;j++)
{
if(j==i||j==n-i+1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}
*     *
  *   *
   * *
    *
   * *
  *   *
 *     **/

/*pattern20
int n=7;
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
if(i==1){
System.out.print("*");
}
else if(j==1||j==i){
System.out.print("*");
}
else{
System.out.print(" ");
}
}
System.out.println();
}
}
}
*******
**
* *
*  *
*   *
*    *
*     **/

/*pattern18
int n=7;
for(i=n;i>=1;i--)
{
for(j=1;j<=i;j++)
{
if(i==1){
System.out.print("*");
}
else if(j==1||j==i||i==n){
System.out.print("*");
}
else{
System.out.print(" ");
}
}
System.out.println();
}
}
}
*******
*    *
*   *
*  *
* *
**
**/

/*pattern17
int n=7;
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
if(i==1||i==n||i==(n+1)/2||j==1||j==n||j==(n+1)/2)
System.out.print("*");
else 
System.out.print(" ");
}
System.out.println();
}
}
}
*******
*  *  *
*  *  *
*******
*  *  *
*  *  *
********/

/*pattern19
for(i=0;i<6;i++)
{
for(j=0;j<i;j++)
{
System.out.print("*");
}
System.out.println(i);
}
}
}
0
*1
**2
***3
****4
*****5*/





















