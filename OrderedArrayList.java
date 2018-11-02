
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList (){
    super ();
  }
  public OrderedArrayList (int startingCapacity){
    super (startingCapacity);
  }
  public void sort (){
    for (int i = 0; i + 1< this.size(); i ++){
      int val = this.get(i).compareTo(this.get(i +1));
      if (val > 0){
      T first = this.get(i);
      T second = this.get(i + 1);
      this.set (i,second);
      this.set(i+1, first);
      }
    }
  }
  //public add (T element){
    //for (int i = 0; i < )
  //}
















}
