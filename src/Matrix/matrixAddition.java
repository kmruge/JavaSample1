package Matrix;
/* | 1 2 3 |     | 3 5 6 |
 * | 3 4 5 |  => | 7 9 6 |  adding a[i][j] with a[i][j+1] when j reach max add value from next row and oth colunm
 * | 1 2 3 |     | 3 5 4 |
 */
public class matrixAddition {

	public static void main(String[] args) {
		int [][] a= {{1,2,3},{3,4,5},{1,2,3}};
		int row=a.length;
		int col=a[0].length;
		int b[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(j<col-1)
				{
					b[i][j]=a[i][j]+a[i][j+1];
				}
				else if(j==col-1&&i==row-1)
				{
					b[i][j]=a[i][j]+a[i+1-row][j+1-col];
				}
				else if(j==col-1)
				{
					b[i][j]=a[i][j]+a[i+1][0];
				}
			}
		}
		for(int i[]:b)
		{
			for(int v:i)
			{
				System.out.print(v);
			}
			System.out.println(" ");
		}
	}

}
