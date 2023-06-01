
public class Charcter_Count {
	public static void main(String[] args) {
		String str="Amrut9658Subha0m288RameshTendulkar70Z";
		for(char ch='a';ch<='z';ch++) {
			int count=0;
			for(int i=0;i<=str.length()-1;i++) {
				char cha=str.toLowerCase().charAt(i);
				if(ch==cha) {
					count++;
				}
			}
			if(count!=0)
				System.out.println(ch+" : "+count);
		}
	}
}
