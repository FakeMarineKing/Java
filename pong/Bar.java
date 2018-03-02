import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
public class Bar extends JPanel
{
	private int x;
	private int length;

	public void bar()
	{
		this.x=5;
		this.length=30;
	}

	public int getX()
	{
		return this.x;
	}

	public int getLength()
	{
		return this.length;
	}
	
	public void draw(Graphics g)
	{
		while(true)
		System.out.println("OOOOOOOOOOOOOOOOOOOOOOO");
		
		g.setColor(Color.black);
		g.drawLine(this.x,20,this.x+this.length,20);
	}
}
