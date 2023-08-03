package union;

public class BrowserUtil extends Browser {
	public static void run(Browser browser)
	{
		if(browser instanceof ChromeBrowser)
		{
			System.out.println("Invoking ChromeBrowser");
			ChromeBrowser chromeBrowser=(ChromeBrowser)browser;
			System.out.println(chromeBrowser.type);
			System.out.println(chromeBrowser.version);
			chromeBrowser.download();
			chromeBrowser.watch();
			System.out.println("**********");
		}
		if(browser instanceof OperaBrowser)
		{
			System.out.println("Invoking OperaBrowser");
			OperaBrowser operaBrowser=(OperaBrowser)browser;
			System.out.println(operaBrowser.type);
			System.out.println(operaBrowser.since);
			operaBrowser.search();
			operaBrowser.watch();
			System.out.println("**********");
		}
		if(browser instanceof Edge)
		{
			System.out.println("Invoking Edge");
			Edge edge=(Edge)browser;
			System.out.println(edge.type);
			System.out.println(edge.year);
			edge.watchVedios();
			edge.watch();
			System.out.println("**********");
		}
		if(browser instanceof FireFoxBrowser)
		{
			System.out.println("Invoking FireFoxBrowser");
			FireFoxBrowser fireFoxBrowser=(FireFoxBrowser)browser;
			System.out.println(fireFoxBrowser.type);
			System.out.println(fireFoxBrowser.name);
			fireFoxBrowser.downloadImages();
			fireFoxBrowser.watch();
			System.out.println("**********");
		}

	}
}
