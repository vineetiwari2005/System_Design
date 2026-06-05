import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Set<Integer>set=Collections.synchronizedSet(new HashSet<>());
        Thread[]threads=new Thread[40];
        for(int i=0;i<40;i++){
            threads[i]=new Thread(()->{
                ConnectionPool pool=ConnectionPool.getInstance("vineet@url", "vineetuser","20");
                set.add(System.identityHashCode(pool));

            });
            threads[i].start();

        }
        for(Thread t : threads){
           try {
        t.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        }
        System.out.println("unique instance : " + set.size());


    }
    
}
