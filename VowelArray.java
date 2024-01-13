import java.util.Scanner;
class VowelArray{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

char arr[]=new char[5];
System.out.println("Enter the char:");

for(int i=0;i<arr.length;i++)
{
arr[i]=sc.next().charAt(0);

}
for(int j=0;j<arr.length;j++)
{
if(arr[j]=='a'||arr[j]=='e'||arr[j]=='i'||arr[j]=='o'||arr[j]=='u')

{
System.out.println("vowel elements of array are:"+arr[j]);
}
}

}
}