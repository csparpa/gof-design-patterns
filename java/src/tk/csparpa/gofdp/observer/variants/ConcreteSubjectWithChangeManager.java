package tk.csparpa.gofdp.observer.variants;

import tk.csparpa.gofdp.observer.Observer;
import tk.csparpa.gofdp.observer.Subject;

/**
 * Concrete implementation for Subject abstract interface, but relying on
 * object composition in order to implement notification policies: a reference
 * to a ChangeManager instance is kept.
 */
public class ConcreteSubjectWithChangeManager implements Subject {
	
	private ChangeManager changeManager;
	
	private String job;
	private double salary;
	
	public ConcreteSubjectWithChangeManager(String job,
											double salary,
											ChangeManager changeManager) {
		this.job = job;
		this.salary = salary;
		this.changeManager = changeManager;
	}
	
	@Override
	public void attach(Observer observer) {
		changeManager.register(this, observer);
	}

	@Override
	public void detach(Observer observer) {
		changeManager.unregister(this, observer);
	}

	@Override
	public void notifyObservers() {
		changeManager.notifyObservers(this);
	}

	@Override
	public String getJob() {
		return this.job;
	}
	
	@Override
	public void setJob(String newJob){
		System.out.println("Yuppydoo! I've got a new job: " + newJob);
		this.job = newJob;
		notifyObservers();
	}

	@Override
	public double getSalary() {
		return this.salary;
	}
	
	@Override
	public void setSalary(double newSalary){
		System.out.println("Yuppydoo! I've got a new salary: " + newSalary);
		this.salary = newSalary;
		notifyObservers();
	}
}
