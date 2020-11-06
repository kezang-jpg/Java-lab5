public class binarySearch{
	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		int a[] = {7,8,5,2,4,9,45,34};
		obj.Sort(a);
		printSort(a);
	}
	public static void printSort(int a[]){
		for(int i : a){
			System.out.print(i +" ");
		}
	}
}
