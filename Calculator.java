public class Calculator {

	private float result;

	public void add(float ... params) {

		for (Float param : params) {

			this.result += param;

		}

	}


	public float getResult() {

		return this.result;

	}

	public void clearResult() {

		this.result = 0;

	}

}