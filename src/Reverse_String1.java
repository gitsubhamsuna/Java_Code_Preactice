
public class Reverse_String1 {
	public static void main(String []args) {
		String str="Java Is Very Easy";
		String spl[]=str.split(" ");
		
		StringBuffer sb=new StringBuffer();
		for(int i=spl.length-1;i>=0;i--) {
			sb.append(spl[i]);
			sb.append(" ");
		}
		System.out.println(sb);
	}
}
