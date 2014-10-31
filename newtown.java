// get the maxixum sqrt number of y, x * x <= y

public class newtown {

    public static void main(String[] args) {
    	int y = 99;
		
		System.out.println(intSqrt(y));
    }
	
	public static int intSqrt(int y) {
		if (y < 0)
			return Integer.MIN_VALUE;
		int x = y / 2;
		while (true) {
			int t = x - (x * x - y) / (2 * x);
			if (t == x)
				break;
			x = t;
		}
		if (x * x > y)
			return x - 1;
		// if ((x+1) * (x+1) == y)
// 			return x + 1;
		return x;
	}
}
