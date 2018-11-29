/**
 * 
 * Modelliert einen binären Suchbaum
 *
 */
public interface Baum<T>
{
	/**
	 * Fügt Knoten im Baum ein.
	 * @param t Inhalt des Knoten
	 */
	public void fuegeEin(T t);

	/**
	 * Gibt den Baum in Nebenreihenfolge aus
	 */
	public void ausgabeNebenreihenfolge();
	
	/**
	 *Baum in inorder-Reihenfolge ausgeben. 
	 */
	public void ausgabeSymmetrisch();
	
	/**
	 * Baum in preorder-Reihenfolge ausgeben.
	 */
	public void ausgabeHauptreihenfolge();
	
}
