import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
class Configure //整体全局的界面。
{
	public static final int WIDTH = 400;
    public static final int HEIGTH = 300;
    // Height and width of window.
    public static final int TILE_WIDTH = 16;
    public static final int TILE_HEIGHT = 16;
    // The height and width of each snakePos.
    public static final int ROW = 15;
    public static final int COL = 20;
    // The number of rows and columns of the game.
    public static final int INTERVAL = 300;
    // Snake moving time interval.
}
enum Direction//方向枚举类型，提高复用率。
{
	UP,DOWN,RIGHT,LEFT;
}	
class SnakePos
{
	//蛇身之上一点的类，实则就是整个configure中的一个点，这也解释了下文中将Food继承该类。
	public int col;
	public int row;
	SnakePos(int row,int col)
	{
		this.row=row;
		this.col=col;
	}
	SnakePos()
	{
		this.col=0;
		this.row=0;
	}
}
class Food extends SnakePos//继承SnakePos提高代码的复用率。
{
	public static final int Row = Configure.ROW;
    public static final int Column = Configure.COL;
    // 从Configure类中读取的游戏行列。
	
}

class Snake
{
	private Direction snakeDir;
	private Direction moveDir;
	private Food food;
	private void randomPos()
	{
		this.row=(int)(Math.random()*ROW)
		this.col=(int)(Math.random()*COL)
	}
	Food()
	{
		this.randomPos();
	}
}















































































































































































































































