package union;

public class BrowserKiller {

	public static void main(String[] args) {
		Browser browser=new Browser();
		ChromeBrowser chromeBrowser=new ChromeBrowser();
		FireFoxBrowser fireFoxBrowser=new FireFoxBrowser();
		OperaBrowser  operaBrowser=new OperaBrowser();
		Edge edge=new Edge();
		
		BrowserUtil.run(operaBrowser);
		BrowserUtil.run(fireFoxBrowser);
		BrowserUtil.run(chromeBrowser);
		BrowserUtil.run(edge);	
	

	}

}
