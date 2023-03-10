
public class Cat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		n =7;
		
		for(int i=0; i<n;i++)
		{
			//A
			for(int j=0;j<n;j++)
			{
				if(i==0&&j>0&&j<(n-1)||j==0&&i>0||i==(n-1)/2||j==(n-1)&&i>0)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
		}
			//B
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				 if(i==0&&j<(n-1)||j==0||i==(n-1)/2&&j<(n-1)||j==(n-1)&&i>0&&i<(n-1)/2||i==(n-1)&&j<(n-1)||j==(n-1)&&i>(n-1)/2&&i<(n-1))
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}
				}
			//C
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				 if(i==0&&j>0 || j==0&&i>0&&i<(n-1)||i==(n-1)&&j>0)
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}
				}
			
			//D
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				 if(i==0&&j<(n-1)||j==0||i==(n-1)&&j<(n-1)||j==(n-1)&&i>0&&i<(n-1))
					{
						System.out.print("@");
					}
					else 
					{
						System.out.print(" ");
					}
				}
			
			//E
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				 if(i==0||j==0||i==(n-1)/2||i==(n-1))
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}
				}
			
			//F
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				 if(i==0||j==0||i==(n-1)/2)
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}
				}
			
			//G
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				 if(i==0&&j>0||j==0&&i>0&&i<(n-1)||i==(n-1)/2&&j>=(n-1)/2||j==(n-1)&&i>=(n-1)/2||i==(n-1)&&j>0&&j<(n-1))
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}
				}
			
			//H
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				 if(j==0||i==(n-1)/2||j==(n-1))
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}
				}
			
			System.out.println("");
		
		}

	}
}


