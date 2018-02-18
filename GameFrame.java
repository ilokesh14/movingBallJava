import javax.swing.JFrame;

public class GameFrame extends JFrame implements GameConstants {

	public GameFrame() {
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle(title);
		Board board = new Board() ;
		add(board) ;
		setSize(GWIDTH, GHEIGHT);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {

		GameFrame frame = new GameFrame() ;
		
	}

}
