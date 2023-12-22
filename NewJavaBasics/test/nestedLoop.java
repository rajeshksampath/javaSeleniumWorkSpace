public class nestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=1;i<4;i++)
		{
			
			for(int j=i;j<i+i;j++)
			{
				int s=k*3;
				System.out.print(s);
				System.out.print("\t");
				k++;
				
			}
			System.out.println("");
		}

	}

}
