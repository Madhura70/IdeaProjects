package multilevel;


public class Department extends College{
    String DepartmentName= "Comp";

    public void isDepartment(){
        System.out.println("Department is comp" );
    }

    public static void main(String[] args){
        Department dept = new Department();
        System.out.println("");
        System.out.println("");
        System.out.println("");

        dept.isDepartment();
        dept.isUnivercity();
        dept.isCollege();
    }

}

