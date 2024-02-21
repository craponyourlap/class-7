package class7;

import java.util.Arrays;

class Point{
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class gg2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] points = {new Point(1, 2), new Point(2, 3), new Point(3, 4)};
		Arrays.sort(points, (o1, o2) -> Integer.compare(o2.x, o1.x));
		for (Point point : points) {
			System.out.println(point.x+","+point.y);
		}
		
	}

}
