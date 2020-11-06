public class linearSearch{
	public static void main(String[] args) {
		int a[] = {56,3,4,5,6,2,3,5,6,7};
		int target = 3;
		search(a,target);
	}
	public static void search(int a[], int target){
		for(int i = 0; i < a.length; i++){
			if(target == a[i]){
				System.out.println("Target " + target + " is found at index "+i );
			}
			else{
				System.out.println("The Target " + target +" at index " + i + " is not found");
			}
		}
	}
}
