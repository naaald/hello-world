/**
 * @(#)arithmeticProgression.java
 *
 *
 * @author 
 * @version 1.00 2016/10/23
 */      

import java.util.*;

public class arithmeticProgression {
	static int common_denom(int a, int b, int[] xy) {
		if (b == 0) {
			xy[0] = 1;
			xy[1] = 0;
			return a;
		} else {
			int d = common_denom(b, a % b, xy);
			int t = xy[0] - a / b * xy[1];
			xy[0] = xy[1];
			xy[1] = t;
			return d;
		}
	}
	public static void main(String[] args){
		Scanner kbd =new Scanner(System.in);
		
		String in = kbd.nextLine();
		String[] inpt = in.split(" ");
		int a1 = Integer.parseInt(inpt[0]);
		int b1 = Integer.parseInt(inpt[1]);
		int a2 = Integer.parseInt(inpt[2]);
		int b2 = Integer.parseInt(inpt[3]);
		int L = Integer.parseInt(inpt[4]);
		int R = Integer.parseInt(inpt[5]);
		int[] xy = { 0, 0 };
		int d = common_denom(a1, -a2, xy);
		long b = (long) b2 - b1;
		if (b % d != 0)
			System.out.println(0);
		else {
			long k = xy[0] * (b / d);
			long l = xy[1] * (b / d);
			int a2_ = a2 / Math.abs(d);
			int a1_ = a1 / Math.abs(d);
			k = (k % a2_ + a2_) % a2_;
			l = (l % a1_ + a1_) % a1_;
			long x1 = a1 * k + b1;
			long x2 = a2 * l + b2;
			long x = Math.max(x1, x2);
			long m = (long) a1 * a2_;
			long n = 0;
			if (x >= L && x <= R)
				n = (R - x + 1 + m - 1) / m;
			else if (x < L)
				n = (R - x + 1 + m - 1) / m - (L - 1 - x + 1 + m - 1) / m;
			System.out.println(n);
		}
	}
}
