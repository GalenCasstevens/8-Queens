public class Driver {
	public static void main(String[] args) {
		EightQueens board = new EightQueens();
		
		board.printBoardState();
		
		System.out.println(board.checkGoalState());
	}
}
