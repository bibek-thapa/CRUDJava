
package crud.console;

import java.util.List;


public interface GenericTest<T> {
    
    public T add();
    public void remove();
    public List<T> getAll();
     public void removeAll();
    
    
    
}
