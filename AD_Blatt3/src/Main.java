/**
 * 
 * @author Tom Krause,Tarek Jakobeit
 * Diese Klasse gibt die gewünschten Bäume(ArrayEinbettung/VerlinkungsBaum) mit den 
 * gewünschten Funktionen wider.
 *
 */
public class Main
{

	public static void main(String[] args)
	{
		
		
		Baum array = new ArrayEinbettung<Integer>(7);
		Baum knoten = new VerlinkungsBaum<Integer>(7);
		for(int i=1;i<=10;i++)
		{
			array.fuegeEin(i);
		}
		System.out.println("ArrayEinbettung:");
		array.ausgabeHauptreihenfolge();
		System.out.println("preorder");
		array.ausgabeNebenreihenfolge();
		System.out.println("postorder");
		array.ausgabeSymmetrisch();
		System.out.println("inorder");
		
		
		
		for(int i=1;i<=10;i++)
		{
			knoten.fuegeEin(i);
		}
		System.out.println("VerlinkungsBaum:");
		knoten.ausgabeHauptreihenfolge();
		System.out.println("preorder");
		knoten.ausgabeNebenreihenfolge();
		System.out.println("postorder");
		knoten.ausgabeSymmetrisch();
		System.out.println("inorder");
	}

}
