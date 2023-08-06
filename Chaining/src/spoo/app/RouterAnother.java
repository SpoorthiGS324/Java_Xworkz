package spoo.app;

public class RouterAnother extends  Router {
	public RouterAnother()
	{
		this("134.909.09","Network","DHCP","LAN");
		System.out.println("Invoking no-args in RouterAnother");
	}
	
	public RouterAnother(String ipAddress,String routing,String server,String portName)
	{
		super(ipAddress,routing,server,portName);
		System.out.println("Invoking String in RouterAnother");
	}
}
