
public class recursion_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int q10 (int n)
	{
		if ( n == 0)
		{
			return 0;
		}
		if (n % 2 == 1)
		{
			return n*2 + q10(n-1);
		}
		return n*n + q10(n-1);
	}
	
	public static int q12 (int n1, int n2, int i)
	{
		if (n1*i >= n2) 
		{
			return 0;
		}
		return n1 * i + q12(n1, n2, i+1 );
	}
	
	public static int q13_1 (int n)
	{
		if (n == 1)
		{
			return 0;
		}
		if (n == 2 )
		{
			return 1;
		}
		return (int)Math.pow((q13_1(n-1)), 2)+ (int)Math.pow((q13_1(n-2)),  2);
	}
	public static int q13_2 (int n)
	{
		if (n == 0)
		{
			return 0;
		}
		return q13_1(n) + q13_2(n-1);
	}
	
	public static int q21 (String str, int i)
	{
		if (i<0)
		{
			return 0;
		}
		char ch = str.charAt(i);
		if (ch >= 'a' && ch <= 'z')
		{
			return 1 + q21(str, i-1);
		}
		return q21 (str, i-1);
	}

	public static String q22 (String str, int i)
	{
		if (i<0)
		{
			return "";
		}
		if ((i+1)%3 == 0)
		{
			return str.charAt(str.length()-1-i) + "*" + q22(str,i-1);
		}
		return str.charAt(str.length()-1-i) + q22(str,i-1);
	}
	
	public static String q23 (String str, int i)
	{
		if (i < 0)
		{
			return "";
		}
		return str.charAt(i) + q23(str, i-1);
	}
	
	public static void q24 (char c1, char c2)
	{
		
		if (c1 <= c2)
		{
			System.out.println(c1++); 
			q24(c1++, c2);
		}
		
	}

	
	public static void q25 (int n, int i)
	{
		if (i <= n)
		{
			if (n%i == 0)
			{
				System.out.println(i);
				q25(n,i+1);
			}
		}
	}
	
	public static void q26 (int n)
	{
		if (n/10 == 0)
		{
			if (n%2 == 0)
			{
				System.out.println(n);
				return;
			}
		}
		if ((n%10) % 2 == 0)
		{
			System.out.println(n%10);
		}
		q26(n/10);
	}
	
	public static void q27 (int x, int y)
	{
		if (x > 10)
		{
			System.out.println("");
			q27(1,y+1);
		}
		if (x<= 10 && y<= 10)
		{
			System.out.print(x*y + "  ");
			q27(x+1, y);
		}
	}
	
 	public static void q28 (int a1, int d, int n)
	{
		if (n > 0)
		{
			System.out.println(a1);
			q28(a1+d, d, n-1);
		}
	}
	
 	public static void q29 (int n, int i, int j) 
 	{
 		if (n==1)
 		{
 			System.out.print(i + ", ");
 			return;
 		}
 		q29(n-1,i,j+1);
 		for (int k =1 ; k< n; k++)
 		{
 			i += k;
 		}
 		System.out.print(i + ", ");
 	}
 	
 	public static void q30 (int n, int i, int j)
 	{
 		if (n !=0 && n % 2 == 0)
 		{
 			System.out.print(j + ", ");
 			q30(n-1, i, j+1);
 		}
 		else if (n != 0 && n% 2!= 0)
 		{
 			System.out.print(i + ", ");
 			q30(n-1, i+1, j);
 		}
 	}

	public static void q31(int [] a, int i)
	{
		if (i > a.length-1)
		{
			return;
		}
		if (i%2==0)
		{
			System.out.println(a[i]);
			q31(a, i+1);
			return;
		}
		q31(a,i+1);
		return;
	}

	public static void q32(int []a, int i)
	{
		if (i <a.length-1)
		{
			if (a[i] <a[i+1])
			{
				System.out.println(a[i]);
			}
			q32(a,i+1);
		}
	}

	public static int q42(int n)
	{
		int res = q42_1(n);
		if (res < 10)
		{
			return res;
		}
		return q42(res);
		
	}
	public static int q42_1(int n)
	{
		if (n < 10)
		{
			return n;
		}
		if (n == 0)
		{
			return 0;
		}
		return n%10 + q42_1(n/10);
	}

}
