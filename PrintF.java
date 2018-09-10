
public class PrintF
{
	public static void main(String[] args)
	{

		System.out.printf("%24s", "Number of items purchased: ");
		System.out.printf("%12d", 15);
		System.out.println("");

		System.out.printf("%27s", "Subtotal: ");
		System.out.printf("%12.2f", 142.18);
		System.out.println("");

		System.out.printf("%27s", "Tax: ");
		System.out.printf("%12.2f", 5.66);
		System.out.println("");

		System.out.printf("%39s", "------");
		System.out.println("");

		System.out.printf("%25s", "Total: ");
		System.out.printf("%14.2f", 147.14);
		System.out.println("");
		System.out.println("");

		System.out.printf("%24s", "Gas points earned: ");
		System.out.printf("%15d", 100);
		System.out.println("");


	}
}