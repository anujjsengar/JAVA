package Recurssion;

public class Sudoko {
	public static void main(String args[]) {
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		solver(grid, 0, 0);
		System.out.println("anuj");
	}

	private static void solver(int[][] grid, int row, int col) {
		if(col==9) {
			col=0;
			row=row+1;
		}
		if(row==9) {
			display(grid);
			return;
		}

		if (grid[row][col] != 0) {
			solver(grid, row, col + 1);
		} else {
			for (int i = 1; i < 10; i++) {
				if (isvalid(grid, row, col, i)) {
					grid[row][col] = i;
					solver(grid, row, col + 1);
					grid[row][col] = 0;
				}
			}

		}
	}
	private static void display(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static boolean isvalid(int arr[][],int row,int col,int val) {
		int r=row;
		int c=col;
		for(int i=r;i<arr.length;i++) {
			if(arr[i][c]==val) {
				return false;
			}
		}
		for(int i=c;i<arr[0].length;i++) {
			if(arr[r][i]==val) {
				return false;
			}
		}
		int r1=r-r%3;
		int c1=c-c%3;
		for(int i=r1;i<r1+3;i++) {
			for(int j=c1;j<c1+3;j++) {
						if(arr[i][j]==val) {
							return false;
						}
					}
		}
		return true;
		}

}
