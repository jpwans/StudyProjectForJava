import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by jiangqin on 17/4/14.
 */
public class Services {
    private Services(){}

    private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();
    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    public static void registerDefaultProvider(Provider p){
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }

    public static void registerProvider(String name, Provider p){
        providers.put(name, p);
    }

    public static Service newInstance(){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name){
        Provider p = providers.get(name);
        if (p == null)
            throw new IllegalArgumentException("No provider registered with name: " + name);
        return p.newService();
    }


    /*
    Map<String, List<String>> m = new Hashtable<String, List<String>>();

    public static <k, v> Hashtable<k, v> newInstance(){
        return new Hashtable<k, v>();
    }
    */
}
