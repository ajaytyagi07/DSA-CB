package Recursion;
public class last_occurence_index {
	public static void main(String[] args) {
int[] arr = {2,3,7,2,3,4,6,8};
int item = 7;
System.out.println(Index(arr,item,arr.length-1));
}
public static int Index(int[] arr, int item, int i) {
	if(i<0) {
		return -1;
	}
	if(arr[i]==item) {
		return i;
	}
	return Index(arr , item , i-1);
}

}