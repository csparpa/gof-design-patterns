package tk.csparpa.gofdp.observer;

/**
 * Concrete implementation for Observer. This class uses the reference to the
 * Subject passed into the "update" interface method in order to extract the
 * data about the Subject's state changes.
 */
public class ConcreteObserver implements Observer {
	
	private String subjectJob = "unknown";
	private double subjectSalary = 0.0;
	
	public ConcreteObserver(){}

	@Override
	public void update(Subject subject) {
		this.subjectJob = subject.getJob();
		this.subjectSalary = subject.getSalary();
		System.out.println("I've been notified about Subject's state change");
	}

	public void gossipAboutSubject() {
		System.out.println("Recent gossip about Subject: he's working as a "+
			subjectJob + " and he earns " + Double.toString(subjectSalary));
	}
}
