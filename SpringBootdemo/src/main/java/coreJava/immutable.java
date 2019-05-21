package coreJava;

public final class immutable {
	private final String name;
	private final int id;
	
	public immutable(String name,int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
	

}
