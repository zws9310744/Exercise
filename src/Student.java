
public class Student {
	private String name,id,department;
	private float height,weight;
	public Student(String name1,String id1){
		name = name1;
		id = id1;
	}
	public void setName(String name1){
		name = name1;
	}
	public void setId(String id1){
		id = id1;
	}
	public void setDepartment(String department1){
		department = department1;
	}
	public void setHeight(float height1){
		height = height1;
	}
	public void setWeight(float weight1){
		weight = weight1;
	}
	public String getName(){return name;}
	public String getId(){return id;}
	public String getDepartment(){return department;}
	public float getHeight(){return height;}
	public float getWeight(){return weight;}
	public void getAll(){
		System.out.println("name:"+this.getName());
		System.out.println("id:"+this.getId());
	}
}
