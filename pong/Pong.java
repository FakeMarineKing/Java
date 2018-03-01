import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Pong implements ActionListener
{
	public static Pong pong;
	
	public int width = 700, heigth = 700;
	public Renderer renderer;

	public Pong()
	{
		Timer timer = new Timer(20, this);
		JFrame jframe = new JFrame("Pong");
	
		renderer = new Renderer();

		jframe.setsize(width, height);
		jframe.setVisible(true);
		jframe.add(renderer);

		timer.start();
	}

	public void update()
	{
		
	}
	
	public void render(Graphics g)
	{
	
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		update();
		renderer.repaint();
	}
	public static void main(String[] args)
	{
		pong = new Pong();	
	}
}
