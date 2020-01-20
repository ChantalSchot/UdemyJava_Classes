package nl.home;

public class ComplexNumber {
	private double real;
	private double imaginary;

	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void add(double real, double imaginary) {
		ComplexNumber numberAdd = new ComplexNumber(real,imaginary);
		add(numberAdd);
	}

	public void add(ComplexNumber complexNumber) {
		real = this.real + complexNumber.real;
		imaginary = this.imaginary + complexNumber.imaginary;
	}

	public void subtract(double real, double imaginary) {
		ComplexNumber numberSubtract = new ComplexNumber(real,imaginary);
		subtract(numberSubtract);
	}

	public void subtract(ComplexNumber complexNumber) {
		real = this.real - complexNumber.real;
		imaginary = this.imaginary - complexNumber.imaginary;
	}
}
