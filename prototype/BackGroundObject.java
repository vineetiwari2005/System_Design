package prototype;
import java.util.ArrayList;
import java.util.List;

public class BackGroundObject implements GraphicalObject {
    private Integer x;
    private Integer y;
    private Integer width;
    private Integer height;
    private BackgroundObjectType backgroundObjectType;
    private List<Integer>pixels;

    public BackGroundObject(Integer x,Integer y,Integer width,Integer height,BackgroundObjectType backgroundObjectType){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.backgroundObjectType=backgroundObjectType;
    }

    public BackGroundObject(Integer x,Integer y,Integer width,Integer height,BackgroundObjectType backgroundObjectType,List<Integer> pixels){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.backgroundObjectType=backgroundObjectType;
        this.pixels=pixels;
    }

    public void setPosition(Integer x,Integer y){
        this.x=x;
        this.y=y;
    }
    public void print(){
        System.out.println(backgroundObjectType +
                " | x=" + x + ", y=" + y +
                " | pixels=" + pixels);
    }
    @Override
    public BackGroundObject clone(){
        List<Integer>copiedPixels =(pixels!=null) ? new ArrayList<>(pixels) : null;
        return new BackGroundObject(x,y,width,height,backgroundObjectType,copiedPixels);
    }
    public BackgroundObjectType getType() {
        return backgroundObjectType;
    }
}