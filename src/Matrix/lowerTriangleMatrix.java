package Matrix;
/* | 1 2 3 |     | 1 0 0 |
 * | 3 4 5 |  => | 3 4 0 | 
 * | 1 2 3 |     | 1 2 3 |
 * | 1 2 3 |     | 0 1 1 |
 * | 3 4 5 |  => | 0 0 1 | 
 * | 1 2 3 |     | 0 0 0 |
 */
public class lowerTriangleMatrix {

	public static void main(String[] args) {
		int [][] a= {{1,2,3},{3,4,5},{1,2,3}};
		int row=a.length;
		int col=a[0].length;
		if(row!=col)
		{
			System.out.println("Given matrix is not square matrix ");
		}
		else
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					if(j>i)
					{
						a[i][j]=0;
					}
				}
			}
		}
		for(int i[]:a)
		{
			for(int v:i)
			{
				System.out.print(v+ " ");
			}
			System.out.println(" ");
		}
		System.out.println("\n---------------------------");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i>j||i==j)
				{
					a[i][j]=0;
				}
				else
				{
					a[i][j]=1;
				}
			}
		}
		for(int i[]:a)
		{
			for(int v:i)
			{
				System.out.print(v+ " ");
			}
			System.out.println(" ");
		}
	}

}
