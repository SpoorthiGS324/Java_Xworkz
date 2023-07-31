package program;

public class Floor {
	public String name;
	public int no;

	public Floor(String name, int no) {
		this.name = name;
		this.no = no;
	}

	public void printInfo() {
		System.out.println("========================");
		System.out.println("Name :" + name);
		System.out.println("No :" + no);

	}

}
