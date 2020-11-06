public class keyIndex{
	public static void main(String[] args) {
		int R = 256;
		int a[] = {'a','c','f','b','z','a','f','b'};
		int N = a.length;
		//Compute frequency count
		int[] count = new int[R + 1];
		for(int i = 0; i < N; i++){
			count[a[i] + 1]++;
		}
		//Transform count into indices
		for(int r = 0; r < R; r++){
			count[r + 1] += count[r];
		}
		//Distribute the data
		int aux[] = new int[R + 1];
		for(int i = 0; i < N; i++){
			aux[count[a[i]]++] = a[i]; 
		}
		//Copy back
		for(int i = 0; i < N; i++){
			a[i] = aux[i];
		}
		show(a);
	}
	public static void show(int a[]){
		for(int i : a){
			System.out.print(i + " ");
		}

	}
}

