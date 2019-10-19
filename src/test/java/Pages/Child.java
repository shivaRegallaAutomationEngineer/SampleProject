package Pages;

 class EncapsulatedClass{
	 private int EmpId;
	 private String EmpName;
	 
	 public void setEmpId(int EmpId) {
		 this.EmpId=EmpId;
	 }
	 
	 public void setEmpName(String EmpName) {
		 this.EmpName=EmpName;
	 }
	 
	 public int getEmpId() {
		return EmpId; 
	 }
	 
	 public String getEmpName() {
		 return EmpName;
	 }
	 
 }

public class Child extends EncapsulatedClass {

	public static void main(String[] args) {
		
	//	Parent pp= new Parent(); //abstract class object creation is not possible
		EncapsulatedClass cc= new EncapsulatedClass();
		cc.setEmpId(100);
		cc.setEmpName("AAA");
		System.out.println(cc.getEmpId());
		System.out.println(cc.getEmpName());
		

	}

}
