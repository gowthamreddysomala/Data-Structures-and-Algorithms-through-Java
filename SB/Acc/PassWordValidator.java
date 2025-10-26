package SB.Acc;

public class PassWordValidator {
    public static boolean validator(String password){
        if(password.length()<4){
            return false;
        }
        if(Character.isDigit(password.charAt(0))){
            return false;
        }
        boolean one = false;
        boolean two = false;
        for(int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch)){
                one = true;
            }
            if(ch=='/' || ch==' ' ){
               return false;
            }
            if(Character.isDigit(ch)){
                two = true;
            }
        }
        return one && two;
    }
    public static void main(String[] args){
        String name = "Gowth2ams";
        System.out.println(validator(name));
    }
}
