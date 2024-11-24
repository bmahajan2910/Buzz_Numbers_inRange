
/*Write a Java program to display all the Buzz Numbers between two integers
p and q (where p < q). A Buzz Number is a number that either:
   - Ends with 7 (last digit is 7), or
   - Is divisible by 7.
   10-30=14,17,21,27,28*/
class  Buzz_Numbers_inRange
{
	public static void main(String[] args) 
	{
		int p=10,q=30;
		for(int i=p;i<=q;i++){
			if(i%10==7 || i%7==0)
			{
				System.out.println(i);
			}
		}
		
	}
}