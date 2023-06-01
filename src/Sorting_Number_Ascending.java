import java.util.Arrays;

public class Sorting_Number_Ascending {
	public static void main(String[] args) {
		int n[]= {12,54,65,49,78,33,90,82,756,982,1245,678};
		
		for(int i=0;i<n.length-1;i++) {
			for(int j=0;j<n.length-1;j++) {
				if(n[j]>n[j+1]) {
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(n));
	}
}
