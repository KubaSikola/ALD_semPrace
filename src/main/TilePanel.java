package main;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import static utils.Constants.*;


public class TilePanel extends JPanel{
    TileImage tileImage;
    BufferedImage img;
    public TilePanel(TileImage tileImage){
        loadImage();
        this.tileImage = tileImage;
        setPanelSize();
    }

    private void setPanelSize() {
        Dimension size = new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        paintTiles(g);
        
        
    }
    
    private void paintTiles(Graphics g){
        BufferedImage temp;
        int tempX;
        int tempY;
        
        for(int i = 0; i < NUM_OF_TILES_Y; i++){
            for(int j = 0; j < NUM_OF_TILES_X; j++){
                tempX = this.tileImage.tiles[i][j].getX();
                tempY = this.tileImage.tiles[i][j].getY();

                temp = img.getSubimage(tempX * TILE_SIZE_IMAGE, tempY * TILE_SIZE_IMAGE, TILE_SIZE_IMAGE, TILE_SIZE_IMAGE);
                g.drawImage(temp, j* TILE_SIZE , i * TILE_SIZE, TILE_SIZE, TILE_SIZE, null);
            }
        }
    }
    
    public void loadImage(){
        InputStream is = getClass().getResourceAsStream("/tiles.png");
        try{
            this.img = ImageIO.read(is);
        }catch(IOException e){
            System.out.println("Image not found");
        }
  
    }
}
