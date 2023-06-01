import java.util.Arrays;

public class Alphabetical_Sorting_String_Ascending {
	public static void main(String[] args) {
		String str[]= {"Rajesh","Akash","Subham","Calculator","Engineer","Horse","Lion"};
		
		for(int j=0;j<str.length-1;j++) {
			for(int i=0;i<str.length-1;i++) {
				if(str[i].compareTo(str[i+1])>0) {
					String temp=str[i];
					str[i]=str[i+1];
					str[i+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}
}
