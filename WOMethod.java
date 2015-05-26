public class WOMethod{
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

	public static void main(String []args)
	{
		cetakGaris(10, "+");
		System.out.println("view data customer");
		cetakGaris(35, "#");
		System.out.println("id\t nama\t alamat");
		cetakGaris(46);
	}
}