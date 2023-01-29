public class Generic<T> {
	T container;

	public Generic() {
		super();
	}

	public Generic(T container) {
		this.container = container;
	}

	public Object getValue() {
		return this.container;
	}

}
