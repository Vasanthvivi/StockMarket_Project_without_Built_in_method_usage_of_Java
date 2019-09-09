import java.lang.String;
import java.util.*;
class Stock
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the total no of days");
int days=in.nextInt();
int arr[]=new int[days];
System.out.println("Ok now enter the values");
for(int ds=0;ds<arr.length;ds++)
{
arr[ds]=in.nextInt();
}
int t,o=0;
int ar[]=new int[arr.length];
for(int c=0;c<arr.length;c++)
{
ar[o]=arr[c];
o++;
}
System.out.println("The Array Elements are:");
for(int d=0;d<ar.length;d++)
{
System.out.print(ar[d]+" ");
}
//sorting in ascending order//
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
t=arr[i];
arr[i]=arr[j];
arr[j]=t;
}
}
}
int f=arr[0];
//Finding minimum element position in the Array//
for(int h=0;h<arr.length;h++)
{
if(f==ar[h])
{
System.out.println("\nMinimum element position is "+(h+1)+" that means an investor has to buy in the day"+(h+1));
}
}
//Descending order sorting//
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]<arr[j])
{
t=arr[i];
arr[i]=arr[j];
arr[j]=t;
}
}
}
int max=arr[0];
for(int w=0;w<arr.length;w++)
{
if(max==ar[w])
{
System.out.print("and the Maximum element position is "+(w+1)+" so he has to sell in the day"+(w+1));
}
}
System.out.println("then he could maximize his profit");
}
}
 