package RahulBasicJava;

public class IndiaTraffic implements CentralTraffic{

	public static void main(String[] args) 
	{
IndiaTraffic i=new IndiaTraffic();
	i.Red();
	i.Green();
	i.Yellow();
	i.WaitforPedesterian();
	}
	

	@Override
	public void Green() {
		System.out.println("Good to Go");
		
	}

	@Override
	public void Red() {
		System.out.println("Just Stop");
		
	}

	@Override
	public void Yellow() {
		System.out.println("wait");
		
	}
	public void WaitforPedesterian()
	{
		System.out.println("look at right and left side of the road");
	}

}
