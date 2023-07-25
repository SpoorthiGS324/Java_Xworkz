class BrickRunner{
	public static void main(String[] args){
		System.out.println("Running main in BrickRunner");
		
		Brick brick=new Brick(200,"black");
		Brick.staticBrick();
		brick.instanceBrick();
		
		System.out.println("##################################");
		Brick brick1=new Brick(300,"white");
		Brick.staticBrick();
		brick1.instanceBrick();
		
	}
}