import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants, ActionListener{

//	toolkit.gettoolkit.
	
	private int x = 10 ;
	private int y = 10 ;
	private int speedx=5;
	int max = 20 ;
	int min = 2 ;
	private int speedy=5;
	
	
	public Board() {
		setSize(GWIDTH, GHEIGHT);
		setBackground(Color.BLACK);
		gameLoop();
	}

	private Timer timer ;	
	
	public void gameLoop() {
		timer = new Timer(DELAY,this) ;
		timer.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	repaint() ;	
	Toolkit.getDefaultToolkit().sync();
	}
	
	Random random = new Random(20);
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g) ;
		g.setColor(Color.YELLOW) ;
		g.fillOval(x,y,30+((speedx+speedy)/2),30+((speedx+speedy)/2));
		
		if(x<10) {
			speedx = min + random.nextInt(max) ;
			}
		if(y<10) {
			speedy = min + random.nextInt(max) ;
			}
		if( x >= GWIDTH-50) {
			speedx = -1 * (min + random.nextInt(max)) ;
			}
		if( y >= GHEIGHT-50) {
			speedy = -1 * (min + random.nextInt(max)) ;
			}
		
		x = x + speedx ;
		y = y + speedy ;

	}	
	
}
