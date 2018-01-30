
public class Queen {
	private int row;
	private int col;
	
	public Queen(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	public boolean inConflict(Queen q) {
		if(row == q.getRow()) return true; 
		
		int tempRow = row,
			tempCol = col;
		
		while(tempRow != 0 && tempCol != 0) {
			tempCol--;
			tempRow--;
		}
		
		while(tempRow != 8 && tempCol != 8) {
			if(row == q.getRow() && tempCol == q.getColumn() && col != tempCol) return true;
			
			tempRow++;
			tempCol++;
		}
		
		tempRow = row;
		tempCol = col;
		
		while(tempRow != 7 && tempCol != 0) {
			tempRow++;
			tempCol--;
		}
		
		while(tempRow != -1 && tempCol != 8) {
			if(row == q.getRow() && tempCol == q.getColumn() && col != tempCol) return true;
			
			tempRow--;
			tempCol++;
		}
		
		return false;
	}
	
	public void moveUp(int spaces) {
		for(int i = 0; i < spaces; i++) {
			if(row == 0) row = 7;
			else row--;
		}
	}
	
	public void setRow(int row) {
		this.row = row;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return col;
	}
}
