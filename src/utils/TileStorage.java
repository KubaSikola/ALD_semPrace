package utils;

import main.Tile;
import java.util.ArrayList;

public class TileStorage {
    public static ArrayList<Tile> allTiles = new ArrayList();
    
    public static ArrayList<Tile> upPipe = new ArrayList();
    public static ArrayList<Tile> rightPipe = new ArrayList();
    public static ArrayList<Tile> downPipe = new ArrayList();
    public static ArrayList<Tile> leftPipe = new ArrayList();
    
    public static ArrayList<Tile> upNone = new ArrayList();
    public static ArrayList<Tile> rightNone = new ArrayList();
    public static ArrayList<Tile> downNone = new ArrayList();
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
            
            if(t.getTileRight() == 1){
                rightPipe.add(t);
            }else{
                rightNone.add(t);
            }
             
            if(t.getTileDown() == 1){
                downPipe.add(t);
            }else{
                downNone.add(t);
            }
              
            if(t.getTileLeft() == 1){
                leftPipe.add(t);
            }else{
                leftNone.add(t);
            }
        }
    }
}
