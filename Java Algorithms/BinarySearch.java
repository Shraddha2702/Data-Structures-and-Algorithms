//Binary Search
import java.util.Arrays;

class BinarySearch
{
	int[] array;
	
	BinarySearch(int[] array){
		this.array =array;
	}
	public static void main(String args[])
	{
		int[] arr={1,3,4,5,6,7,5};
		BinarySearch b = new BinarySearch(arr);
		System.out.println(Arrays.toString(arr));
		int check = b.search(4);
		System.out.println(check);
	}
	
	public int search(int a)
	{

		int low = 0;
		int high = array.length-1;
		int m = (low+high)/2;
		int flag=0;
		
		while(low<= high){
		if(array[m] == a){flag = 1;break;}
		
		else if(array[m] > a)
		{
			high = m-1;
		}
		
		else if(array[m] <a)
		{
			low = m+1;
		}
		else{flag = 0;}
		m=(low+high)/2;

	}

		return flag;
	}
}