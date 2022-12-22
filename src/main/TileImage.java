package main;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import static utils.Constants.*;
import utils.TileStorage;
import static utils.TileStorage.*;

public class TileImage {
    JFrame jframe;
    TilePanel tPanel;
    Tile[][] tiles;
    int currentIndex;
    
    public TileImage(){
        this.tPanel = new TilePanel(this);
        
        TileStorage.setupTiles();
        generateTiles();
        setupJFrame(); 
    }
    
    private void setupJFrame(){
        this.jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(tPanel);
        jframe.setResizable(false);
        jframe.pack();
        jframe.setVisible(true);
    }
    
    private void generateTiles(){
        long start = System.currentTimeMillis();
        this.tiles = new Tile[NUM_OF_TILES_Y][NUM_OF_TILES_X];
        Tile currentTile;
   
        currentTile = getRandomTileFrom(allTiles);
        tiles[0][0] = currentTile;
        
        // generating first row
        for(int i = 1; i < tiles[0].length; i++){
            if(tiles[0][i-1].getTileRight() == 1){
                currentTile = getRandomTileFrom(leftPipe);
            }else{
                currentTile = getRandomTileFrom(leftNone);
            }           
            tiles[0][i] = currentTile;
        }
        
        // generating other rows
        for(int i = 1; i < tiles.length; i++){
            for(int j = 0; j < tiles[0].length; j++){
                if(j == 0){
                    if(tiles[i-1][j].getTileDown() == 1){
                        currentTile = getRandomTileFrom(upPipe);
                    }else{
                        currentTile = getRandomTileFrom(upNone);
                    }   
                }else{
                    if(tiles[i-1][j].getTileDown() == 1){
                        currentTile = getRandomTileFrom(upPipe);
                        if(currentTile.getTileLeft() != tiles[i][j-1].getTileRight()){
                            currentTile = findCorrectTile(upPipe,tiles[i][j-1].getTileRight());
                        }
                    }else{
                        currentTile = getRandomTileFrom(upNone);
                        if(currentTile.getTileLeft() != tiles[i][j-1].getTileRight()){
                            currentTile = findCorrectTile(upNone,tiles[i][j-1].getTileRight());
                        }
                    }   
                }
                tiles[i][j] = currentTile;
            }
           
        }
        
        long end = System.currentTimeMillis();
        long time = (end - start);
        System.out.println("Generated in: " + time + " seconds");

    }
    
    private Tile findCorrectTile(ArrayList<Tile> list, int correctLeft){
        int size = list.size();
        while(list.get(this.currentIndex).getTileLeft() != correctLeft){
            currentIndex++;
            if(currentIndex == size){
                currentIndex = 0;
            }
        }
        return list.get(currentIndex);
    }
    
    private Tile getRandomTileFrom(ArrayList<Tile> list){
        Random rnd = new Random();  
        int r = rnd.nextInt(list.size());
        this.currentIndex = r;
        return list.get(r);
    }
}
