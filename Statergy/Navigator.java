package Statergy;

import java.util.List;

public class Navigator {
    private NavigationStatergy navigationStatergy;
    public void navigate(String from,String to){
        navigationStatergy.navigate(from, to);
    }
    public Navigator(NavigationStatergy navigationStatergy){
        this.navigationStatergy=navigationStatergy;
    }
    public void navigate(List<String>from,List<String>to){
        for(int i=0;i<from.size();i++){
            navigationStatergy.navigate(from.get(i),to.get(i));
        }
    }
    

    
}
