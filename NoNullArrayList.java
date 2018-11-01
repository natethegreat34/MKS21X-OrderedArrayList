import java.util.ArrayList;
import java.util.List;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList (){
    super ();
  }

  public NoNullArrayList (int startingCapacity){
    super (startingCapacity);
  }

public set (int index, T element){
  if (element == null){
    throw new IllegalArgumentException ();
  }
  super.set(index, element)
}























}
