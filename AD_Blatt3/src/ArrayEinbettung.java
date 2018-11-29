/**
 * Modelliert einen Suchbaum als Array-Einbettung.
 * @author Tom Krause, Tarek Jakobeit
 *
 * @param <T>
 */
public class ArrayEinbettung<T> implements Baum<T>
{
	private Object[] baum;
	
	/**
	 * Initialisiert den Array mit den generischen Daten.
	 * @param t die generischen Daten
	 */
	public ArrayEinbettung(T t)
	{
		baum = new Object[10];
		baum[1]=t;
	}

	/**
	 * Fügt die generischen Daten am gewünschten Index des Arraybaumes ein.
	 * @param t die einzufügenden Daten
	 */
	
	@Override
	public void fuegeEin(T t)
	{
		fuegeEin2(1,t);
	}
	
	private void fuegeEin2(int index, T t)
	{
		if(((Comparable) baum[index]).compareTo(t)<0)
		{
			vergroeßereRechts(index);
			
			if(baum[index*2+1]==null)
			{
				baum[index*2+1]=t;
			}
			else
			{
				fuegeEin2(index*2+1, t);
			}
		}
		else
		{
			vergroeßereLinks(index);
			
			if(baum[index*2]==null)
			{
				baum[index*2]=t;
			}
			else
			{
				fuegeEin2(index*2, t);
			}
		}
	}

	/**
	 * Gibt den Arraybaum in Preorder-Reihenfolge(Hauptreihenfolge) aus.
	 */
	
	@Override
	public void ausgabeHauptreihenfolge()
	{
		preorder(1);
		
	}
	
	private void preorder(int index)
	{
		System.out.print(baum[index]+" ");
		
		if(ueberpruefeLinks(index))
		{
			preorder(index*2);
			
		}
		if(ueberpruefeRechts(index))
		{
			preorder(index*2+1);
		}
		
	}

	/**
	 * Gibt den Baum in Postorder-Reihenfolge(Nebenreihenfolge) aus.
	 */
	
	@Override
	public void ausgabeNebenreihenfolge()
	{
		postorder(1);
		
	}
	
	private void postorder(int index)
	{
		
		if(ueberpruefeLinks(index))
		{
			postorder(index*2);
			
		}
		if(ueberpruefeRechts(index))
		{
			postorder(index*2+1);
		}
		System.out.print(baum[index]+" ");
		
	}
	
	/**
	 * Gibt den Baum in Inorder-Reihenfolge(symmetrisch) aus.
	 */
	@Override
	public void ausgabeSymmetrisch()
	{
		inorder(1);
		
	}
	
	private void inorder(int index)
	{
		
		if(ueberpruefeLinks(index))
		{
			inorder(index*2);
		}
		System.out.print(baum[index]+" ");
		if(ueberpruefeRechts(index))
		{
			inorder(index*2+1);
		}
		
		
	}
	
	private void vergroeßereRechts(int index)
	{
		if(index*2+1>baum.length)
		{
			Object[] newArray = new Object[baum.length*2];
			for(int i=0; i<baum.length;i++)
			{
				newArray[i]=baum[i];
			}
			baum=newArray;
		}
	}
	
	private void vergroeßereLinks(int index)
	{
		if(index*2>baum.length)
		{
			Object[] newArray = new Object[baum.length*2];
			for(int i=0; i<baum.length;i++)
			{
				newArray[i]=baum[i];
			}
			baum=newArray;
		}
		
	}
	
	private boolean ueberpruefeLinks(int index)
	{
		if(index*2<baum.length && baum[index*2]!=null)
			return true;

		return false;
	}
	
	private boolean ueberpruefeRechts(int index)
	{
		if(index*2+1<baum.length && baum[index*2+1]!=null)
			return true;

		return false;
	}
	

}
