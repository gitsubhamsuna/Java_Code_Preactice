import java.util.Arrays;

public class Sorting_Length_String_Descending {
	public static void main(String[] args) {
		String str[]= {"Amit","Munu","Subham","Rajesh","Govinda","Quality","Sandeep"};
		
		for(int i=0;i<str.length-1;i++) {
			for(int j=0;j<str.length-1;j++) {
				if(str[j].length()<str[j+1].length()) {
					String temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}
}
