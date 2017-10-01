package observerPatter_Ex;

public interface Subject {
	
	public void registerObserver(Observer o, String Name);
	
	public void removeObserver(Observer o);
	
	public void notifyChanged();
}
