public class WOMethod3
{
	public static int add(int a, int h)
	{
		int c = a+h;
		return c;
	}	
	
	public static void main(String []args)
	{
		int bil1 = 100;
		int bil2 = 300;
		int hasil1 = add(bil1, bil2);
		int hasil2 = add(20, 30);
		System.out.println("Hasil add(100, 300) : " +hasil1);
		System.out.println("Hasil add(20, 30) : " +hasil2);
	}
}