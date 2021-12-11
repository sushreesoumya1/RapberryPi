/*Given an array of N integers. Your task is to print the sum of all of the integers.
Example 1:
Input:
41
2 3 4
Output:
10
Example 2:
Input:
65
8 3 10 22 45
Output:
93*/
 
//A1:
public class Print
{
public static void main(String[] args){
int[] arr= {1,3,5,6};
print(arr);
}
 
public static void print(int[] arr){
for(int i: arr)
System.out.println(i);
}
}
