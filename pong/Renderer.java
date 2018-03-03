import java.awt.Graphics;
import javax.swing.JPanel;

public class Renderer extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	public void Renderer()
	{
		
		
	}


	@Override
	protected void paintComponent(Graphics g)
	{

		super.paintComponent(g);
		pong.renderer(g);
		pong.bar.draw();
	}
}
