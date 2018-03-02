import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Pong implements ActionListener
{
	
	public int width = 700;
	public int heigth = 700;
	public Renderer renderer;
	public Bar bar ;
	

	
	public Pong()
	{
		Timer timer = new Timer(20, this);
		JFrame jframe = new JFrame("Pong");
	
		renderer = new Renderer();
		bar = new Bar();
		jframe.setSize(width, heigth);
		jframe.setVisible(true);
		jframe.add(renderer);
		
		timer.start(); 
	}

	public void update()
	{
		
	}
	
	public void render(Graphics g)
	{
		bar.draw(g);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		update();
		renderer.repaint();
	}
}
