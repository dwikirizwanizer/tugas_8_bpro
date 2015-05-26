public class WOMethod4{
	/**
	*Nama method = main
	*return value = void
	*parameter = string args
	**/
	public static void cetakGaris()
	{
		for(int i=0; i<25; i++)
			System.out.print("*");
		System.out.println();
	}
	
	public static void cetakGaris(int panjangGaris)
	{
		for(int i=0; i<panjangGaris; i++)
		System.out.print("*");
		System.out.println();
	}
	
	public static void cetakGaris(int panjangGaris, String bentuk)
	{
		for(int i=0; i<panjangGaris; i++)
		System.out.print(bentuk);
		System.out.println();
	}
	
	public static void cetakBanner(String kata)
	{
		cetakGaris(kata.length()+4, "*");
		System.out.println("* " + kata + " *");
		cetakGaris(kata.length()+4, "*");
	}
	
	public static void main(String []args)
	{
		cetakBanner("KAMPRET");
	}
}