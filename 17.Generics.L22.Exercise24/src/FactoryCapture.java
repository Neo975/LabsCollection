import Factory.FactoryI;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mike on 22.02.2016.
 */
public class FactoryCapture {
    private Map<String, FactoryI<?>> types = new HashMap<String, FactoryI<?>>();

    public void addFactory(String factoryName, FactoryI<?> factory) {
        types.put(factoryName, factory);
    }

    public Object create(String factoryName, int arg) {
        Object obj = null;

        try {
            obj = types.get(factoryName).create(arg);
        } catch (NullPointerException e) {
            System.out.println("Not a registered factoryname: " + factoryName);
        }

        return obj;
    }

}
