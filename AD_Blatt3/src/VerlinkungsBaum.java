/**
 * Modelliert einen Knotenbaum
 * @author Tom Krause, Tarek Jakobeit
 *
 * @param <T>
 */
public class VerlinkungsBaum<T> implements Baum<T>
{
	private Knoten wurzel;
	
	public VerlinkungsBaum(T t)
	{
		assert t instanceof Comparable : "Vorbedingung verletzt: t muss Comparable sein";
		wurzel = new Knoten((Comparable) t);
		
	}
	
	/**
	 * Fügt die gewünschten Daten(generisch) in den Knotenbaum ein.
	 * @param t die eingefügten Daten 
	 */
	@Override
	public void fuegeEin(T t)
	{
		Knoten hilfsknoten = wurzel;
		while (hilfsknoten!=null)
		{
			if( hilfsknoten.gibInhalt().compareTo(t)<0)
			{
				if(hilfsknoten.gibRechtenKnoten()==null)
				{
					hilfsknoten.setzeRechtenKnoten(new Knoten((Comparable) t));
					hilfsknoten.gibRechtenKnoten().setzeVater(hilfsknoten);
					return;
				}
				hilfsknoten = hilfsknoten.gibRechtenKnoten();
			}
			else
			{
				if(hilfsknoten.gibLinkenKnoten()==null)
				{
					hilfsknoten.setzeLinkenKnoten(new Knoten((Comparable) t));
					hilfsknoten.gibLinkenKnoten().setzeVater(hilfsknoten);
					return;
				}
				hilfsknoten = hilfsknoten.gibLinkenKnoten();
			}
		}
		
		
	}
	
	/**
	 * Gibt den Baum in der Preorder-Reihenfolge(Hauptreihenfolge) aus.
	 */
	
	@Override
	public void ausgabeHauptreihenfolge()
	{
		preorder(wurzel);
		
	}
	
	private void preorder(Knoten k)
	{
		System.out.print(k.gibInhalt()+" ");
		
		if(k.gibLinkenKnoten()!=null)
		{
			preorder(k.gibLinkenKnoten());
		}
		if( k.gibRechtenKnoten()!=null)
		{
			preorder(k.gibRechtenKnoten());
		}
		
	}
	
	/**
	 * Gibt den Baum in der Postorder-Reihenfolge(Nebenreihenfolge) aus.
	 */
	
	@Override
	public void ausgabeNebenreihenfolge()
	{
		postorder(wurzel);
		
	}
	
	private void postorder(Knoten k)
	{
		
		if(k.gibLinkenKnoten()!=null)
		{
			postorder(k.gibLinkenKnoten());
		}
		if( k.gibRechtenKnoten()!=null)
		{
			postorder(k.gibRechtenKnoten());
		}
		System.out.print(k.gibInhalt()+" ");
	}

	/**
	 * Gibt den Baum in der Inorder-Reihenfolge(symmetrisch) aus.
	 */
	
	@Override
	public void ausgabeSymmetrisch()
	{
		inorder(wurzel);
		
	}
	
	private void inorder(Knoten k)
	{
		
		if(k.gibLinkenKnoten()!=null)
		{
			inorder(k.gibLinkenKnoten());
		}
		System.out.print(k.gibInhalt()+" ");
		if( k.gibRechtenKnoten()!=null)
		{
			inorder(k.gibRechtenKnoten());
		}
		
	}

}
