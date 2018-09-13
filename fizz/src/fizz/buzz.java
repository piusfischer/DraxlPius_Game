package fizz;

public class buzz {
	
		
		public static void algorithmus(){
			String f="";
			String b="";
		
		for(int i=0; i<101; i++)
		{
			
			System.out.print(i+"= ");
			if((i%3==0))
			{
				f="fizz ";
			}
			if((i%4)==0)
			{
				b="buzz";
			}
			System.out.print(f);
			System.out.println(b);
			
			f="";
			b="";
		}
		}

		
	

	
	public static void main(String[] args)
	{
		algorithmus();
	}
	}


