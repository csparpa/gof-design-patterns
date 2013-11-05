package tk.csparpa.gofdp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation for Subject tracking down the related Observer objects
 * into a list.
 */
public class ConcreteSubject implements Subject {
	
	List<Observer> observers;
	
	private String job;
	private double salary;

	public ConcreteSubject(String job, double salary) {
		this.job = job;
		this.salary = salary;
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
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
