
public class Reverse_String3 {
	public static void main(String[] args) {
		String str="Java Is Very Easy";
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		System.out.println(temp);
	}
}
