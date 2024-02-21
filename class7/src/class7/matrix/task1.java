package class7.matrix;

public class task1 {
	static void sumOfEachRow(int[][] tb) {
		for (int i = 0; i < tb.length; i++) {
			int sum = 0;
			for (int j = 0; j < tb[i].length; j++) {
				sum += tb[i][j];
			}
			System.out.printf("sum for row %d: %d\n",i,sum);
		}
	}
	static void sumOfEachColumn(int[][] tb) {
		for (int i = 0; i < tb[0].length; i++) {
			int sum = 0;
			for (int j = 0; j < tb.length; j++) {
				sum += tb[j][i];
			}
			System.out.printf("sum for column %d: %d\n",i,sum);
		}
	}
	static void minMaxOfEachRow(int[][] tb) {
		for (int i = 0; i < tb.length; i++) {
			int min;
			int max;
			min = max = tb[i][0];
			for (int j = 1; j < tb[i].length; j++) {
				min = Math.min(min, tb[i][j]);
				max = Math.max(max, tb[i][j]);
			}
			System.out.printf("min for row %d: %d",i,min);
			System.out.printf("	max for row %d: %d\n",i,max);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] gg = {
				{1,5,2,3},
				{5,1,2,25},
				{8,1,2,4},
				{17,1,2,4}
		};
		sumOfEachRow(gg);
		sumOfEachColumn(gg);
		minMaxOfEachRow(gg);
	}

}
