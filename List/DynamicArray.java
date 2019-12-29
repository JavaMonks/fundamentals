public class DynamicArray implements List{
	
	private String[] array ;
	private int size;
	private static int count;
	
	/**
	* Constructor
	*/
	DynamicArray(){
		array= new String[4];
		size=array.length;
	}
	
	/**
	* Desc : This method is used to add the element in array.
	* @param value 
	* @return This return the size of an array.
	*/
	public int add(String value){
		String[] temp ;
		if(checkIfDoubleTheSize(size)){
			temp = new String[size*2];
			for(int i=0;i<array.length;i++){
				temp[i]=array[i];
			}
			array=temp;
			size=size*2;
			
		}else{
			array[count]=value;
			count++;
		}
		return size;
	}
	
	/**
	* Desc : This method is used to check the size of an array.
	* If array size equal & above to 80% capacity, it should return true else false.
	* @param value 
	* @return This return the boolean
	*/
	private boolean checkIfDoubleTheSize(int size){
		size=(size*80)/100;
		
			if(count!=0 && count==size)
				return true;
			
		return false;
	}

}