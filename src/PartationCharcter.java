
public class PartationCharcter {
	public static void main(String[] args) {
		String str="Amrut9658Subha0m288RameshTendulkar70Z";
		
		String tempcharcter = "";
		String tempnumber="";
		
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.toLowerCase().charAt(i);
			if(ch>='a'&& ch<='z')
				tempcharcter=tempcharcter+ch;
			
			else if(ch>='0'&& ch<='9')
				tempnumber=tempnumber+ch;
			
			else
				System.out.println("Not a valid details");
		}
		System.out.println(tempcharcter);
		System.out.println(tempnumber);
	}
}
