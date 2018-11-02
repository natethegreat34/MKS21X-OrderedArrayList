
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList (){
    super ();
  }
  public OrderedArrayList (int startingCapacity){
    super (startingCapacity);
  }


  public void add (T element){
      for (int i = 0; i + 1< this.size(); i ++){
        int val = element.compareTo(this.get(i +1));
        if (val > 0){
        super.add(i, element);
      }
        if (val <= 0)
        {super.add(i + 1, element);;}

      }}


















}
