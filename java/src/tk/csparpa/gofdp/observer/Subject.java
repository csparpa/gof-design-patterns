package tk.csparpa.gofdp.observer;

/**
 * This is the abstract interface for handling and notifying Observers
 */
public interface Subject {
	
	public void attach(Observer observer);
	
	public void detach(Observer observer);
	
	public void notifyObservers();
	
	public String getJob();
	
	public void setJob(String newJob);
	
	public double getSalary();
	
	public void setSalary(double newSalary);
}
