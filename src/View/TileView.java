package View;

import java.awt.image.BufferedImage;
import java.net.URL;

import Model.Tile;

public class TileView {
	private Tile tile;
	private BufferedImage image;
	
	TileView(){
		try
		{
			URL imageURL = this.getClass().getResource("images/plaatje01.jpg");
		}
		catch (Exception e)‏
		{
			System.out.println("Something went wrong when loading the image");
		}
	}
	
}
