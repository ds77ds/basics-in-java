class Rational
{
	private int num;
	private int deno;
	public Rational multiply(Rational r)
	{
		Rational rat=new Rational();
		rat.num=num*r.num;
		rat.deno=deno*r.deno;
		return rat;
	}
	public Rational add(Rational r)
	{
		Rational rat=new Rational();
		rat.num=num+r.num;
		rat.deno=deno+r.deno;
		return rat;
	}
	public Rational sub(Rational r)
	{
		Rational rat=new Rational();
		rat.num=num-r.num;
		rat.deno=deno-r.deno;
		if(rat.deno<0)
		{
			rat.num=-rat.num;
			rat.deno=-rat.deno;
		}
		return rat;
	}
	public Rational divide(Rational r)
	{
		Rational rat=new Rational();
		rat.num=num*r.deno;
		rat.deno=deno*r.num;
		return rat;
	}
	
	public void set(int n,int d)
	{
		num=n;
		deno=d;
	}
	public void show()
	{
		System.out.println(num+"/"+deno);
	}
}

//now using this Rational in UseRational

class UseRational
{
	public static void main(String args[])
	{
		Rational m1;
		m1=new Rational();
		m1.set(100,20);
		System.out.print("first Rational is ");
		m1.show();
		Rational m2=new Rational();
		m2.set(200,30);
		System.out.print("second Rational is ");
		m2.show();
		System.out.print("multiply of Rational is ");
		Rational m3=new Rational();
		m3=m1.multiply(m2);
		m3.show();
		System.out.print("divide of Rational is ");
		Rational m4=new Rational();
		m4=m1.divide(m2);
		m4.show();
		System.out.print("add of Rational is ");
		m4=new Rational();
		m4=m1.add(m2);
		m4.show();
		System.out.print("subtract of Rational is ");
		m4=new Rational();
		m4=m1.sub(m2);
		m4.show();
		/*ds77ds*/
	}
}
/*as these classes are not public classes so we can save both of them in same file or say in same java file */
/*Dinesh*/
