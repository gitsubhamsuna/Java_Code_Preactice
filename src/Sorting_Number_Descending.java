import java.util.Arrays;

public class Sorting_Number_Descending {
	public static void main(String[] args) {
		int n[]= {154,548,683,1248,987,489,323,791,3019,7534,6713};
		for(int i=0;i<n.length-1;i++) {
			for(int j=0;j<n.length-1;j++) {
				if(n[j]<n[j+1]) {
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(n));
	}
}
