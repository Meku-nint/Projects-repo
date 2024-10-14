package Geeks;
import java.util.*;
class a {
	public static void main(String ar[])
	{
		System.out.println("REFERENCE DATA TYPES\n");
		int[] c = { 10, 20, 30, 40 };
		int[] d = c;

		System.out.println("Initially");
		System.out.println("Array c: "
						+ Arrays.toString(c));
		System.out.println("Array d: "
						+ Arrays.toString(d));
		System.out.println("\nModifying the value at "
						+ "index 1 to 50 in array d\n");
		d[1] = 50;

		System.out.println("After modification");
		System.out.println("Array c: "
						+ Arrays.toString(c));
		System.out.println("Array d: "
						+ Arrays.toString(d));
		System.out.println(
			"**Here value of c[1] is also affected "
			+ "because of Reference Data Type\n");
	}
}
