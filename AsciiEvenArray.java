import java.util.Scanner;
class AsciiEvenArray{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int count=0;
char arr[]=new char[5];
System.out.println("Enter the characters:");

for(int i=0;i<arr.length;i++)
{
arr[i]=sc.next().charAt(0);

}
for(int j=0;j<arr.length;j++)
{
if((arr[j]%2)==0)
{
System.out.println("even  elements of array are:"+arr[j]);
count++;

}

}
System.out.println(count);
}
}