
public class Staff {
	private String name,jobs,id;
    private float heigh,weigh;
    private char gender;
    
    public  Staff(String name1,String id1){
  	  name = name1;
  	  id = id1;
    }
    public void setGender(char gender1){
  	  gender = gender1;
    }
    public String getName(){return name;}
    public String getId(){return id;}
    public char getGender(){return gender;}
    public void getAll(){
		System.out.println("name:"+this.getName());
		System.out.println("id:"+this.getId());
	}
}
