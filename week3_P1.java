
public class week3_P1 
{
	public static void main(String[] args)
	 {
		String s = "Bala Nikesh Alavindla";
		for(int i=0; i<= s.length()-1; i++)
		{
			char ch = s.charAt(i);
			if((ch == 'a')||(ch == 'e')||(ch == 'i')||(ch == 'o')||(ch == 'u')||
			(ch == 'A')||(ch == 'E')||(ch == 'I')||(ch == 'O')||(ch == 'U'))
				System.out.println(s.charAt(i));
		}
		
		}
}
