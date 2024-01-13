import java.util.Scanner;
class OddEvenArray{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

int arr[]=new int[5];
System.out.println("Enter the num:");

for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();

}
for(int j=0;j<arr.length;j++)
{
if((arr[j]%2)==0)

{
System.out.println("even elements of array are:"+arr[j]);
}
}

}
}