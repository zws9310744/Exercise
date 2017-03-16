
public class Teacher {
	private String name,id;
	private char gender;
	private float height,weight;
	public Teacher(String name1,String id1){
		name=name1;
		id=id1;
	}
	public void setId(String id1){
		id=id1;
	}
	public void setName(String name1){
		name=name1;
	}
	public void setGender(char gender1){
		gender=gender1;
	}
	public String getId(){return id;}
	public String getName(){return name;}
	public char getGender(){return gender;}
	public void getAll(){
		System.out.println("name:"+this.getName());
		System.out.println("id:"+this.getId());
	}
}
