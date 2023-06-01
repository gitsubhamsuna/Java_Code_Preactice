
public class Remove_Duplicate_Chracter {
	public static void main(String[] args) {
		String str="Amrut9658Subha0m288RameshTendulkar70Z";
		String temp="";
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.toLowerCase().charAt(i);
			if(temp.indexOf(ch)==-1) {
				temp=temp+ch;
			}
		}
		System.out.println(temp);
		
	}

}
