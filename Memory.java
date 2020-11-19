package project;
import java.util.Arrays;


public class Memory {
	public static final int DATA_SIZE = 512;
	private int [] data = new int [DATA_SIZE];
	private int changeDataIndex = -1;
	
	
	
	public int getChangeDataIndex() {
		return changeDataIndex;
	}


	public int getData(int index) {
		if (index < 0 || index >= DATA_SIZE) {
			throw new DataAccessException("illegal index " + index);
		}
		return data[index];
	}
	
	
	public void setData(int index, int value) {
		if (index < 0 || index >= DATA_SIZE) {
			throw new DataAccessException("illegal index " + index);
		}
		data[index] = value;
		changeDataIndex = index;
	}
	
	
	public int[] getDataRange(int min, int max) {
		if (min < 0 && max >= DATA_SIZE &&  min > max) {
			throw new DataAccessException("illegal indices " + min + " " + max);
		}
		
		return Arrays.copyOfRange(data, min, max);	
	}
	
	
	public int[] getDataArray() {
		return data;
	}
	
	
	public void clearData() {
		for (int x: data) {
			x = 0;
		}
		changeDataIndex = -1;
	}
	
	
	
		
	

}
