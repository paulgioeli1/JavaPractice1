package javapractice;

/**
 *
 * @author paulgioeli
 */
public class JavaPractice {

    public static int Addem(int num1, int num2){
            return num1 + num2;
        }
    
    public static void main(String[] args) {
        
        int var1 = 60;
        int var2 = 12;
        
        int var3 = var1 / var2;
        
        int var4 = Addem(var1, var2);
        
        System.out.println(var4);
    }
    
   
    
}
