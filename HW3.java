
public class HW3 {

	public static double calculateHeight(double velocity, double time) {
		final double gravityConstant = 32.174;
		double height = velocity * time - 0.5 * gravityConstant * Math.pow(time, 2);
		return height;
	}

}
