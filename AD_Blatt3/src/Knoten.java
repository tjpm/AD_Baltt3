/**
 * Modelliert einen generischen Knoten.
 * @author Tom Krause, Tarek Jakobeit
 *
 * @param <T>
 */
public class Knoten<T extends Comparable<T>>
{
	private T daten;
	private Knoten<T> links;
	private Knoten<T> rechts;
	private Knoten<T> vater;
	
	/**
	 * Initialisiert einen Knoten mit den Daten.
	 * @param t die Daten
	 */
	public Knoten(T t)
	{
		daten = t;
	}
	
	/**
	 * Gibt den linken Knoten aus.
	 * @return linker Knoten
	 */
	public Knoten<T> gibLinkenKnoten()
	{
		return links;
	}
	
	/**
	 * Gibt den rechten Knoten aus.
	 * @return rechter Knoten
	 */
	public Knoten<T> gibRechtenKnoten()
	{
		return rechts;
	}
	
	/**
	 * Gibt den Vaterknoten aus.
	 * @return der Vaterknoten
	 */
	public Knoten<T> gibVater()
	{
		return vater;
	}
	
	/**
	 * setzt den linken Knoten
	 * @param t der zu setzende Knoten
	 */
	public void setzeLinkenKnoten(Knoten<T> t)
	{
		links = t;
	}
	
	/**
	 * setzt den rechten Knoten
	 * @param t der zu setzende rechte Knoten
	 */
	public void setzeRechtenKnoten(Knoten<T> t)
	{
		rechts = t;
	}
	
	/**
	 * setzt den Vater-Knoten
	 * @param t der zu setzende Vaterknoten
	 */
	public void setzeVater(Knoten<T>t)
	{
		vater = t;
	}
	
	/**
	 * gibt den Inhalt des Knotens wider.
	 * @return der Inhalt des Knotens.
	 */
	public T gibInhalt()
	{
		return daten;
	}
}
