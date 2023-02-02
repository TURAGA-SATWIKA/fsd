class Demo
{
	public static void main(String args[])
	{
	  System.out.println(args.length);
	  int i,sum=0;
	  for(i=0;i<args.length;i++)
	  {
             sum=sum+Integer.parseInt(args[i]);
	     System.out.println("sum:"+sum);
          }
	}
}