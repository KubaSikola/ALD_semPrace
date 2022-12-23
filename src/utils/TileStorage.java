package utils;

import main.Tile;
import java.util.ArrayList;

public class TileStorage {
    public static ArrayList<Tile> allTiles = new ArrayList();
    
    public static ArrayList<Tile> upPipe = new ArrayList();
    public static ArrayList<Tile> leftPipe = new ArrayList();
    
    public static ArrayList<Tile> upNone = new ArrayList();
    public static ArrayList<Tile> leftNone = new ArrayList();

    static int xIndex = 0;
    static int yIndex = 0;

    public static void setupTiles(){
        for(int i = 0; i < Constants.ALL_TILE_EDGES.length; i ++){
            allTiles.add(new Tile(i, Constants.ALL_TILE_EDGES[i], xIndex,yIndex));      
            if (xIndex < Constants.IMAGE_COLUMNS - 1){
                xIndex++;
            }else{
                xIndex = 0;
                yIndex++;
            }
        }
        
        for (Tile t : allTiles) {
            if(t.getTileUp() == 1){
                upPipe.add(t);
            }else{
                upNone.add(t);
            }

            if(t.getTileLeft() == 1){
                leftPipe.add(t);
            }else{
                leftNone.add(t);
            }
        }
    }
}
