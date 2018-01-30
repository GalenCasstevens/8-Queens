import java.util.Random;

public class EightQueens {
	int[][] board = new int[8][8];
	
	Random gen = new Random();
	
	public EightQueens() {
		for(int col = 0; col < 8; col++) {
			board[gen.nextInt(8)][col] = 1;
		}
	}
	
	public boolean checkGoalState() {
		for(int row = 0; row < 8; row++) {
			for(int col = 0; col < 8; col++) {
				if(board[row][col] == 1) {
					if(checkRow(row, col) || checkDiag(row, col)) return false;
				}
			}
		}
		return true;
	}
	
	public boolean checkRow(int row, int currCol) {
		for(int col = 0; col < 8; col++) {
			if(board[row][col] == 1 && currCol != col) return true;
		}
		return false;
	}
	
	public boolean checkDiag(int currRow, int currCol) {
		int tempRow = currRow,
			tempCol = currCol;
		
		while(tempRow != 0 && tempCol != 0) {
			tempCol--;
			tempRow--;
		}
		
		while(tempRow != 8 && tempCol != 8) {
			if(board[tempRow][tempCol] == 1 && currCol != tempCol) {
				return true;
			}
			
			tempRow++;
			tempCol++;
		}
		
		tempRow = currRow;
		tempCol = currCol;
		
		while(tempRow != 7 && tempCol != 0) {
			tempRow++;
			tempCol--;
		}
		
		while(tempRow != -1 && tempCol != 8) {
			if(board[tempRow][tempCol] == 1 && currCol != tempCol) {
				return true;
			}
			
			tempRow--;
			tempCol++;
		}
		
		return false;
	}
	
	public void resetBoard() {
		for(int row = 0; row < 8; row++) {
			for(int col = 0; col < 8; col++) {
				board[row][col] = 0;
			}
		}
		
		for(int col = 0; col < 8; col++) {
			board[gen.nextInt(8)][col] = 1;
		}
	}
	
	public int[][] getBoardState() {
		return board;
	}
	
	public void printBoardState() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print(board[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}