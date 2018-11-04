
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList (){
    super ();
  }
  public OrderedArrayList (int startingCapacity){
    super (startingCapacity);
  }

public void helperadd (T element){
  int i = 0;
  int val = element.compareTo(this.get(i +1));
  boolean found = false;
  for (; i + 1< this.size() - 1; i ++){
    if (val <= 0)
    {super.add(i, element);}
}
  if(val > 0 && (i + 1 == this.size() - 1)){
    super.add(element);
  }}

  public boolean add (T element){
    if (element == null){
      throw new IllegalArgumentException ("You done goofed");
    }
  else{helperadd(element);
      return true;}}

    public void add (int index, T element){
      if (element == null){
        throw new IllegalArgumentException ();
      }
      else {helperadd(element);
      }}
      public T set (int index, T value){
        if (value == null){
          throw new IllegalArgumentException ();
        }
        else {T love = this.get(index);
        super.remove(index);
        helperadd(value);
        return love;
      }}
}
