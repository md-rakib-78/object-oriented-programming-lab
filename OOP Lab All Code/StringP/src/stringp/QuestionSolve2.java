
package stringp;



public class QuestionSolve2 {

    public static void main(String[] args) {
        
             
    

    
    String str = "mdrakib@gmail.cse.edu.bd";
    

    int first = str.indexOf(".")+1;
    
    ///int last = 
    int second = first+3;


         
        String str1=str.substring(first,second);
        System.out.println(str1);
        
        
        String change = str.replace(str1,"EEE");
        
        System.out.println(change);
        
    }
    
}
