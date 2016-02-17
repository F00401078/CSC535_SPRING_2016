
public class week3_P3 
{
	public static void main(String[] args)
	 {
		String s = "Bala Nikesh Alavindla F00401078";
		for(int i=0; i<= s.length()-1; i++)
		{
			char ch = s.charAt(i);
			if((ch == '0')||(ch == '1')||(ch == '2')||(ch == '3')||(ch == '4')||
					(ch == '5')||(ch == '6')||(ch == '7')||(ch == '8')||(ch == '9'))
				System.out.println(s.charAt(i));
		}
		
		}
}
