package class7.matrix;

import java.util.Arrays;

public class ma1 {
	static void printByColumn(int[][] table) {
		for (int i = 0; i < table[0].length; i++) {
			int[] col = new int[table.length];
			for (int j = 0; j < table.length; j++) {
				col[j] = table[j][i];
			}
			System.out.println(Arrays.toString(col));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] table = new int[10][10];
		int ctr = 0;
		for (int[] row : table) {
			for (int i = 0; i < row.length; i++) {
				row[i] = ctr++;
			}
			//System.out.println(Arrays.toString(row));
		}
		printByColumn(table);
		
		//ragged arrays
		int[][] raggedTable = {
				{1,2},
				{2,3,4,5},
				{5,6,7}
		};
		for (int i = 0; i < raggedTable.length; i++) {
			for (int j = 0; j < raggedTable[i].length; j++) {
				System.out.println(raggedTable[i][j]);
			}
		}
	}

}
