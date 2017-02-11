import java.io.*;
class UseMatrix
{
	public static void main(String args[])
	{
		Console con=System.console();
		int i,j;
		
		System.out.println("enter 9 values");
		Matrix m1=new Matrix();
		m1.read();
		System.out.println("1st matrix");
		m1.show();
		
		System.out.print("enter no. of rows ");
		i=Integer.parseInt(con.readLine());
		System.out.print("enter no. of columns ");
		j=Integer.parseInt(con.readLine());
		System.out.println("enter "+(i*j)+" values");
		Matrix m2=new Matrix(i,j);
		m2.read();
		System.out.println("2nd matrix");
		m2.show();
		
		System.out.println("enter same no. of values as of 2nd matrix");
		Matrix m3=new Matrix(m2);
		m3.read();
		
		System.out.println("3rd matrix");
		m3.show();
		
	}
}