import java.util.Scanner;
class toHex
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int length=input.nextInt();
		toHex(length);
	}
	public static void toHex(int num)
	{
		if(num==0)
		{
			System.out.print(0);
			return;
		}
		char []chs={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char []arr=new char[8];
		System.out.print("0*");
		int pos=arr.length;
		while(num!=0)
		{
			int temp=num&15;
			arr[--pos]=chs[temp];
			num=num>>>4;
		}
		for(int x=pos;x<arr.length;x++)
		{
			System.out.print(arr[x]);
		}
	}
}



