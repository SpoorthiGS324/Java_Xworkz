package spoo.app;

public class RouterKiller {

	public static void main(String[] args) {
		System.out.println("Invoking main in RouterKiller");
		Router router=new Router("764.34","Mobile Network","DHCP","LAN");
		System.out.println(router.ipAddress);
		System.out.println(router.routing);
		System.out.println(router.server);
		System.out.println(router.portName);
		
		System.out.println("--------------------------");
		RouterAnother routeranother=new RouterAnother();
		System.out.println(routeranother.ipAddress);
		System.out.println(routeranother.routing);
		System.out.println(routeranother.server);
		System.out.println(routeranother.portName);
		
		System.out.println("--------------------------");
		RouterAnother routeranother1=new RouterAnother("873.34","Network","DHCP","WAN");
		System.out.println(routeranother1.ipAddress);
		System.out.println(routeranother1.routing);
		System.out.println(routeranother1.server);
		System.out.println(routeranother1.portName);
	}

}
