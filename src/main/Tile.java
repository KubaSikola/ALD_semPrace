package main;
public class Tile {
    private int[] tileEdges;
    private int tileIdx;
    private int xIndex;
    private int yIndex;
    
    public Tile(int tileIdx, int[] tileEdges, int xIndex, int yIndex){
        this.tileIdx = tileIdx;
        this.tileEdges = tileEdges;
        this.xIndex = xIndex;
        this.yIndex = yIndex;
    }
    
    public int getTileIdx(){
        return this.tileIdx;
    }
    
    public int getTileUp(){
        return this.tileEdges[0];
    }
    
    public int getTileLeft(){
        return this.tileEdges[3];
    }
    
    public int getTileDown(){
        return this.tileEdges[2];
    }
    
    public int getTileRight(){
        return this.tileEdges[1];
    }
    
    public int[] getTileAll(){
        return this.tileEdges;
    }
    
    public int getX(){
        return this.xIndex;
    }
    public int getY(){
        return this.yIndex;
    }
    
}
