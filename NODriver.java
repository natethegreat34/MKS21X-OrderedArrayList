public class NODriver{
  public static void main(String[] args){
		int c = 0;

		NoNullArrayList<String> array = new NoNullArrayList<>();

		try {
			array.add("x");
			if (!(""+array).equals("[x]")) System.out.println(++c+". You aren't adding properly when NoNullArrayList.add(T) is called.");
			array.add(0,"y");
			if (!(""+array).equals("[y, x]")) System.out.println(++c+". You aren't adding properly when NoNullArrayList.add(index, T) is called.");
			array.set(1,"z");
			if (!(""+array).equals("[y, z]")) System.out.println(++c+". You aren't setting properly when NoNullArrayList.set(index, T) is called.");
		} catch (Exception e) {
			System.out.println(++c+". You are producing a "+e.getClass().getCanonicalName()+" when adding/setting to a NoNullArrayList.");
		}

		try {
			try {
				array.add(null);
				System.out.println(++c+". You aren't catching nulls properly when NoNullArrayList.add(T) is called.");
			} catch (IllegalArgumentException e) {}
			if (!(""+array).equals("[y, z]")) System.out.println(++c+". You are modifying the array when NoNullArrayList.add(null) is called.");
			try {
				array.add(0,null);
				System.out.println(++c+". You aren't catching nulls when NoNullArrayList.add(index, T) is called.");
			} catch (IllegalArgumentException e) {}
			if (!(""+array).equals("[y, z]")) System.out.println(++c+". You are modifying the array when NoNullArrayList.add(index, null) is called.");
			try {
				array.set(1,null);
				System.out.println(++c+". You aren't catching nulls when NoNullArrayList.set(index, T) is called.");
			} catch (IllegalArgumentException e) {}
			if (!(""+array).equals("[y, z]")) System.out.println(++c+". You are modifying the array when NoNullArrayList.set(index, null) is called.");
		} catch (Exception e) {
			System.out.println(++c+". You are producing a "+e.getClass().getCanonicalName()+" when adding/setting a null value to a NoNullArrayList. You should be throwing IllegalArgumentException instead.");
		}

	
	}
}
