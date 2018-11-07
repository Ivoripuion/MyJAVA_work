class Resource
{
	private String name;
	private String sex;
	private boolean flag=false;
	public synchronized void set(String name,String sex)
	{
		if(flag)
			try{this.wait();}catch(InterruptedException t){}
		this.name=name;
		this.sex=sex;
		flag=true;
		this.notify();
	}
	public synchronized void out()
	{
		if(!flag)
			try{this.wait();}catch(InterruptedException t){}
		System.out.println(this.name+"...."+this.sex);
		flag=false;
		this.notify();
	}	
}
class Intput implements Runnable
{
	Resource r;
	Intput(Resource r)
	{
		this.r=r;
	}
	public void run()
	{
		int x=0;
		while(true)
		{
			if(x==0)
			{
				r.set("John","Male");
			}
			else
			{
				r.set("小妹","女女女女女女");
			}
			x=(x+1)%2;
		}
	}
}
class Output implements Runnable
{
	Resource r;
	Output(Resource r)
	{
		this.r=r;
	}
	public void run()
	{
		while(true)
			r.out();
	}
}
class ResourceDemo2
{
	public static void main(String[] args)
	{
		Resource r=new Resource();
		Intput in=new Intput(r);
		Output ou=new Output(r);
		Thread d1=new Thread(in);
		Thread d2=new Thread(ou);
		d1.start();
		d2.start();
	}
}
















