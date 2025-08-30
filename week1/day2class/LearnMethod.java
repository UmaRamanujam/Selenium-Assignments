package week1.day2class;

public class LearnMethod {
	int noOfLearners; //global variable

		public void add() //accessmodifer returntype methodname()
		{
		int a=5; //local variables
		int b=6;
		int c=a+b;
		System.out.println(c);
		
		}

public static void main(String[] args)
{
	LearnMethod lm=new LearnMethod(); //classname objectname=new classname();
	lm.add();
	System.out.println(lm.noOfLearners);

}
}