/*
 * Topic: 物件陣列練習(Staff-Teacher-Student)
 * Date: 2017/3/16
 * Author: 105021108 張惟舜
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Staff [] stf = new Staff[10];
		Teacher [] tech = new Teacher[10];
		Student [] stud = new Student[10];
		String category;
		boolean whether;
		int num;
		/*
		 * 陳先生 105021115
		 * 曾小姐 105021330
		 * 翁先生 105021689
		 * 
		 * 關老師 1111111111
		 * 莊老師 2222222222
		 * 施老師 3333333333
		 * 
		 * Sam 101598505
		 * Jack 106981522
		 * David 10451282
		 */
		System.out.print("您要輸入的資料為何?(staff,teacher,student)");
		category = scn.next();
		System.out.print("輸入幾筆資料?");
		num = scn.nextInt();
		switch (category){
		case "staff":
			for(int i=0;i<num;i++){
				System.out.print("請輸入名字,Id:");
				stf[i] = new Staff(scn.next(),scn.next());
			}
			break;
		case "teacher":
			for(int i=0;i<num;i++){
				System.out.print("請輸入名字,Id:");
				tech[i] = new Teacher(scn.next(),scn.next());
			}
			break;
		case "student":
			for(int i=0;i<num;i++){
				System.out.print("請輸入名字,Id:");
				stud[i] = new Student(scn.next(),scn.next());
			}
			break;
		default:
			System.out.println("error!");
		}
		
		
		System.out.println("--------------------------------");
		String data,which;
		String n = "name";
		String d = "Id";
		boolean status = true;
		int i = 0;
		
		System.out.print("是否查詢資料?(true,false)");
		whether = scn.nextBoolean();
		if(whether == true){
			System.out.print("您要查詢的資料為何?(staff,teacher,student)");
			category = scn.next();
			switch (category){
			case "staff":
				System.out.print("您要以什麼查詢資料?(name,Id)");
				which = scn.next();
				if(which.equals(n)){
					System.out.print("輸入您要尋找的名字:");
					data = scn.next();
					while(i<num && status){
						if(stf[i].getName().equals(data)){
							stf[i].getAll();
							status = false;
						}
					}
				}
				if(which.equals(d)){
					System.out.print("輸入您要尋找的Id:");
					data = scn.next();
					while(i<num && status){
						if(stf[i].getId().equals(data)){
							stf[i].getAll();
							status = false;
						}
					}
				}
				break;	
			case "teacher":
				System.out.print("您要以什麼查詢資料?(name,Id)");
				which = scn.next();
				if(which.equals(n)){
					System.out.print("輸入您要尋找的名字:");
					data = scn.next();
					while(i<num && status){
						if(tech[i].getName().equals(data)){
							tech[i].getAll();
							status = false;
						}
					}
				}
				if(which.equals(d)){
					System.out.print("輸入您要尋找的Id:");
					data = scn.next();
					while(i<num && status){
						if(tech[i].getId().equals(data)){
							tech[i].getAll();
							status = false;
						}
					}
				}
				break;	
			case "student":
				System.out.print("您要以什麼查詢資料?(name,Id)");
				which = scn.next();
				if(which.equals(n)){
					System.out.print("輸入您要尋找的名字:");
					data = scn.next();
					while(i<num && status){
						if(stud[i].getName().equals(data)){
							stud[i].getAll();
							status = false;
						}
					}
				}
				if(which.equals(d)){
					System.out.print("輸入您要尋找的Id:");
					data = scn.next();
					while(i<num && status){
						if(stud[i].getId().equals(data)){
							stud[i].getAll();
							status = false;
						}
					}
				}
				break;
			default:
				System.out.println("error!");
			}
		}
	}

}
