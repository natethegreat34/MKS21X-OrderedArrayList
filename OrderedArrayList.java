public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList (){
    super ();
  }
  public OrderedArrayList (int startingCapacity){
    super (startingCapacity);
  }

public int helperadd (T element){
  int i = 0;
  boolean found = false;
  while (found == false && i < this.size() ){
    if (element.compareTo(this.get(i)) <= 0)
    {found = true;
    }
    else{i ++;}}
    return i;
}

  public boolean add (T element){
    if (element == null){
      throw new IllegalArgumentException ("No you");
    }
    else {
      super.add(helperadd(element), element);
      return true;}}

    public void add (int index, T element){
      this.add(element);
      }

      public T set (int index, T value){
        if (value == null){
          throw new IllegalArgumentException ("No You");
        }
        else {
        T love = this.get(index);
        this.remove(index);
        add(value);
        return love;
      }}}
