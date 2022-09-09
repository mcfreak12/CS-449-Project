package sprint_1.app;

public class Board {
    private int[][] grid;
	private char turn = 'X';

	public Board(int x) {
		grid = new int[x][x];
	}

	public int getCell(int row, int column) {
		return grid[row][column];
	}

	public char getTurn() {
		return turn;
	}
}
