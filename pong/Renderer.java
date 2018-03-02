import java.awt.Graphics;
import javax.swing.JPanel;

public class Renderer extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	public void render(Graphics g)
	{
		
	}


	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Pong.pong.render(g);
	}
}
