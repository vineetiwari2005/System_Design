
public class ConnectionPool{
    private static volatile ConnectionPool instance;//volatile is used for thread safety
    //it forces us to use the latest data from our memory
    String url;
    String username;
    String poolSize;

    private ConnectionPool(String url,String username,String poolSize){
        this.url=url;
        this.username=username;
        this.poolSize=poolSize;
    }
    public static ConnectionPool getInstance(String url,String username,String poolSize){
        if(instance==null){
            synchronized(ConnectionPool.class){
                if(instance==null){
                    instance=new ConnectionPool(url, username, poolSize);
                }
            }
        }
        return instance;
    }
    public void displayInstance(ConnectionPool ConnectionPool){
        System.out.println("DB URL " + ConnectionPool.url);
        System.out.println("DB USERNAME " + ConnectionPool.username);
         System.out.println("DB POOLSIZE " + ConnectionPool.poolSize);
    }
}