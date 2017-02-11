import java.io.*;
class Matrix
{
	private int arr[][];
	public Matrix()
	{
		arr=new int[3][3];
		
	}
	public Matrix(int i,int j)
	{
		arr=new int[i][j];
		
	}
	public Matrix(Matrix m)
	{
		int rows,col=0;
		rows=m.arr.length;
		col=m.arr[rows-1].length;
		//System.out.println("rows"+rows+"col"+col);
		arr=new int[rows][col];
		
	}
	public void read()
	{
		Console con=System.console();
		int i,j;
		for(i=0;i<arr.length;i++)
			for(j=0;j<arr[i].length;j++)
				arr[i][j]=Integer.parseInt(con.readLine());
	}
	public void show()
	{
		int i,j;
		for(i=0;i<arr.length;i++)
		{	for(j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+" ");
				System.out.println(" ");
		}	
	}
}