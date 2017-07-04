# project-11
import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])
{
int n,count=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n>0)
{
n=n/10;
count=count+1;
}
System.out.println(count);
}
}
