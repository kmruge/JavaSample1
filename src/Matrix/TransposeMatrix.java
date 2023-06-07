package Matrix;
public class TransposeMatrix {
	static void transpose(int a[][])
	{
		int b[][]=new int[a.length][a.length];
		int row=a.length;
		int col=a[0].length;
		System.out.println(row+"X"+col+" Transpose Matrix ");
		if(col==row)
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					b[i][j]=a[j][i];
				}
			}
		}
		else
		{
			b=new int[col][row];
			for(int i=0;i<b.length;i++)
			{
				for(int j=0;j<b[0].length;j++)
				{
					b[i][j]=a[j][i];
				}
			}
		}
		System.out.println("Input matrix");
		for(int k[]:a)
		{
			for(int j:k)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		System.out.println("Output Matrix");
		for(int k[]:b)
		{
			for(int j:k)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int a[][]= {{1,1},{2,9},{3,0}};
		transpose(a);
		int b[][]= {{1,1,1},{2,2,2},{3,3,3}};
		transpose(b);
	}

}
