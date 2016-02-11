package makers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 11.02.2016.
 */
public class ListMaker<T> {
    public List<T> create() {
        return new ArrayList<T>();
    }
}
