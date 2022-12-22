package utils;
public class Constants {
    public final static int NUM_OF_TILES_X = 20;
    public final static int NUM_OF_TILES_Y = 30;
    public final static int TILE_SIZE = 20;
    

    
    public final static int WINDOW_WIDTH = TILE_SIZE * NUM_OF_TILES_X;
    public final static int WINDOW_HEIGHT = TILE_SIZE * NUM_OF_TILES_Y;
    
    public final static int TILE_SIZE_IMAGE = 50;
    public final static int IMAGE_ROWS = 4;
    public final static int IMAGE_COLUMNS = 4;
    
    
    public static final int[][] ALL_TILE_EDGES ={

        {1,1,1,1},
        {1,0,1,0},
        {0,1,0,1},
        {0,0,0,0},
        
        {1,0,1,1},
        {1,1,0,1},
        {1,1,1,0},
        {0,1,1,1},
        
        {0,0,1,1},
        {1,0,0,1},
        {1,1,0,0},
        {0,1,1,0},
        
        {0,0,0,0}
    
    };
    
}
