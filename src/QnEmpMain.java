public class QnEmpMain {
    public static void main(String args[]){
        QnEmp e=new QnEmp();
        e.setEmployee_id(101);
        System.out.println("Id:"+e.getEmployee_id());
        e.setEmployee_name("Vinaya");
        System.out.println("Name:"+e.getEmployee_name());
        e.setEmployee_salary(30000);
        System.out.println("Salary:"+e.getEmployee_salary());
    }
}
