public class QnPersonMain {
    public static void main(String args[]){
        QnPerson p=new QnPerson();
        p.setName("Mari");
        System.out.println("Name:"+p.getName());
        p.setAge(23);
        System.out.println("Age:"+p.getAge());
        p.setCountry("India");
        System.out.println("Country:"+p.getCountry());
    }
}
