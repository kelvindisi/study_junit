package testStudy;

import java.text.DecimalFormat;

public class MathUtils {
	public int add(int a, int b) {
		return a + b;
	}
	
	public double computeCircleArea(float radius) {
		var area = Math.PI * Math.pow(radius, 2);
		DecimalFormat formatter = new DecimalFormat("#0.00");
		var computed = Double.parseDouble(formatter.format(area));
		return computed;
		
	}
	public double divide(double a, double b) {
		return a/b;
	}
}
