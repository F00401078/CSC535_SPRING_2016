
public class Week3_p4 
{
	public static void main(String[] args)
	{
		
	Integer value;
	ignoreWhitespace();
	StringBuilder sb = new StringBuilder();
	while (currentChar >= '0' && currentChar <= '9') {
		sb.append((char) currentChar);
		moveToNextChar();
	}
	if (sb.length() == 0)
		throw new RuntimeException("Unexpected: "
				+ (char) currentChar);
	value = Integer.parseInt(sb.toString());
	ignoreWhitespace();
	return value;
}
}
return new Parser().parse();
}
}

