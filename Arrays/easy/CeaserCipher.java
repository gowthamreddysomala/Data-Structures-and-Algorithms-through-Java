package Arrays.easy;

public class CeaserCipher {
    public static String encrypt(String name,int rounds){
        StringBuilder stringBuilder = new StringBuilder();
        int len = name.length();
        boolean flag = false;
        for(int i=0;i<len;i++){
            char k = name.charAt(i);
            k = incre(k,rounds,flag);
            stringBuilder.insert(i,k);
        }
        return new String(stringBuilder);
    }
    public static char incre(char k , int ro,boolean flag){
        for(int i=0;i<ro;i++){
          k++;
        }
        return k;
    }
    public static void main(String[] args){
        String name = "hello";
        int round = -1;
        System.out.println(encrypt(name,round));
    }
}
