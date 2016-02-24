
public class program_week4 
{
	public static void main(String[] args)
	{
		int a=5;
		int[]b = new int[]{3636, 231, 76895, 19, 7};
		int c = 0;
		int d = a-1;
		System.out.println("Numbers before sorting");
		for (int i= 0; i<a; ++i)
		{
			System.out.println(b[i]);
		}
		sort(b, c, d);
		
		System.out.println("Numbers in the ar after Sorting");
		for (int i= 0; i<a; ++i)
		{
			System.out.println(b[i]);
		}
		
	
	}
	public static void sort(int[]ar, int c, int d )
	{
		if(c < d)
		{
			int middle = (c + d)/2;
			sort(ar, c, middle);
			sort(ar, middle+1, d);
			mergefn(ar, c, middle, d);
			
		}
	}
	public static void mergefn(int[]ar, int c, int middle, int d)
	{
		int s = ar.length;
		int[]temp = new int[s];
		for(int i = c; i <= d; ++i)
		{
			temp[i] = ar[i];
		}
		int x = c;
		int y = middle+1;
		int z = c;
		while(x <= middle && y <= d)
		{
			if(temp[x] <= temp[y])
			{
				ar[z]= temp[x];
				++x;
			}
			else
			{
				ar[z]= temp[y];
				++y;
			}
			++z;
		}
		while (x<= middle)
		{
			ar[z]=temp[x];
			++z;
			++x;
			
		}
	}
}
