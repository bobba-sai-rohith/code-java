# code-java
programs of java 
//matrix multiplication


//Importing Scanner class from util package
import java.util.Scanner;

public class MatrixMultiplication
{
public static void main(String args[])
{


Scanner sc=new Scanner(System.in);
System.out.println("enter the order of first matrix");
int m=sc.nextInt();
int n=sc.nextInt();
System.out.println("enter the order of second matrix");
int p=sc.nextInt();
int q=sc.nextInt();
if(n!=p)
{
System.out.println("multiplication not possible");
}
else
{
int a[][]=new int[m][n];
System.out.println("enter the elments of first matrix");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}
}
int b[][]=new int[p][q];
System.out.println("enter the elements of second matrix");
for(int i=0;i<p;i++)
{
for(int j=0;j<q;j++)
{
b[i][j]=sc.nextInt();
}
}
int result[][]=new int[m][q];
for(int i=0;i<m;i++)
{
for(int j=0;j<q;j++)
{
int sum=0;
for(int k=0;k<n;k++)
{
sum=sum+a[i][k]*b[k][j];
}
result[i][j]=sum;
}

}
for(int i=0;i<m;i++)
{
for(int j=0;j<q;j++)
{
System.out.print(result[i][j]+"\t");
}
System.out.println();
}
}
}
}
