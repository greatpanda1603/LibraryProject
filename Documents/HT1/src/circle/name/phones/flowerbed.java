package circle.name.phones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class flowerbed {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double radius;
		radius = Integer.parseInt(br.readLine());
		double perimeter = 2*Math.PI*radius;
		double area = Math.PI*radius*radius;
		System.out.println(perimeter);
		System.out.println(area);

	}

}
