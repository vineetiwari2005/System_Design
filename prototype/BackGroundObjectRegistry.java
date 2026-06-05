package prototype;

import java.util.HashMap;
import java.util.Map;

public class BackGroundObjectRegistry {
    private Map<BackgroundObjectType,BackGroundObject>objects=new HashMap<>();
    public void registerObject(BackGroundObject obj){
        objects.put(obj.getType(),obj);
    }
    public BackGroundObject getObject(BackgroundObjectType type){
        return objects.get(type);
    }


    
    
}
