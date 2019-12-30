/* @author  Payal Chawla
*/
class RunnerArray{
	
	/**
	* This is the main method which makes use of dynamic array.
	* @param args Unused.
	* @return Nothing.
	*/
	public static void main(String args[]){
		//System.out.println("Hello Payal");
		List list = new DynamicArray();
		//list.add("abc");
		System.out.println("Size of an Array : "+list.add("11"));
		System.out.println("Size of an Array : "+list.add("22"));
		System.out.println("Size of an Array : "+list.add("33"));
		System.out.println("Size of an Array : "+list.add("44"));
		//list.print();
		//System.out.println(list.remove(5));
		
		list.print();
		System.out.println("Remove the element of 1 index : "+list.remove(1));
		list.print();
		System.out.println("Remove the element of 1 index : "+list.remove(1));
		list.print();
		System.out.println("Remove the element of 1 index : "+list.remove(1));
		list.print();
		System.out.println("Remove the element of 1 index : "+list.remove(0));
		list.print();
		System.out.println("Remove the element of 1 index : "+list.remove(0));
		
		System.out.println("Size of an Array : "+list.add("11"));
		System.out.println("Size of an Array : "+list.add("22"));
		list.print();
	}
}