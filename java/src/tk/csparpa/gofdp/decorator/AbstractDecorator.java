package tk.csparpa.gofdp.decorator;

/**
 * Abstract base class for decorators for AbstractComponent-derived types.
 * Please notice that this class complies to the interface of AbstractComponent
 * and holds an internal reference to the decorated AbstracComponent instance
 */
public abstract class AbstractDecorator implements AbstractComponent {
	
	AbstractComponent decorated;

	public AbstractDecorator(AbstractComponent decorated) {
		this.decorated = decorated;
	}

	@Override
	public String getName() {
		return decorated.getName();
	}

	@Override
	public int getAge() {
		return decorated.getAge();
	}
	
	/**
	 * This is the behaviour to be added by subclasses
	 */
	public abstract String getJob();
}
