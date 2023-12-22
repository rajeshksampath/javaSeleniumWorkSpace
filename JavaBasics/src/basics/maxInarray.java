package basics;

public class maxInarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ab[][] = {{3,5,2},{4,8,10},{35,13,14}};
		int max = ab[0][0];
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(ab[i][j]>max)
				{
					max=ab[i][j];
				}
			}
		}
		System.out.println("Maximum number in array is "+max);

	}

}
