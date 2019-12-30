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
		array[count]=value;
		count++;
		if(checkIfDoubleTheSize(size)){
			temp = new String[size*2];
			for(int i=0;i<array.length;i++){
				temp[i]=array[i];
			}
			array=temp;
			size=size*2;
			
		}
		return size;
	}
	
	/**
	* Desc : This method is used to remove the index element in array.
	* @param value 
	* @return This return the size of an array.
	*/
	public String remove(int index){
		String[] temp ;
		if(index>=count || index<0){
			return "No element at this index ! ";
		}else{
				
			for(int j=index ;j<array.length-1;j++)
			{
				array[j]=array[j+1];
			}
			count--;
			if(checkIfHalfTheSize(size)){
				System.out.println("checkIfHalfTheSize");
				temp = new String[size/2];
				for(int i=0;i<count;i++){
					temp[i]=array[i];
				}
				array=temp;
				size=size/2;
				
			}
		}
		
		return "Removed the element";
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

	/**
	* Desc : This method is used to check the size of an array.
	* If array size equal & above to 80% capacity, it should return true else false.
	* @param value 
	* @return This return the boolean
	*/
	private boolean checkIfHalfTheSize(int size){
		size=(size*50)/100;
			System.out.print(count+" <-----> "+size);
			if(count!=0 && count<=(size-1))
				return true;
			
		return false;
	}
	
	/**
	* Desc : This method is used to print an array.
	*/
	public void print(){
		System.out.println();
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}