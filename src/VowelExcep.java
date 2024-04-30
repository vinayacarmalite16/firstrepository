public class VowelExcep {
    void check(char s) throws Exception{
        if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
            throw new Exception("Valid");
        }else{
            System.out.println("Exception Handling");
        }
    }
    public static void main(String args[]){
        VowelExcep v=new VowelExcep();
        try{
            v.check('x');
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("rest of the code...");
        }
    }
}
