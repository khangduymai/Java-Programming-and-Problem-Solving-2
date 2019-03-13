public class TestShortCutComparison {
    public static void main(String[] args) { 
        
        System.out.println("---------------------------------------------------------------------------");   
        System.out.println("How && and & work...");   
        System.out.println("");
        System.out.println("  && = evaluates only the first condition when the first condition is false");   
        System.out.println("  &  = evaluates both conditions even when first condition is false");   
        System.out.println("");
        System.out.println("How || and | work...");   
        System.out.println("");
        System.out.println("  || = evaluates only the first condition when the first condition is true");   
        System.out.println("  |  = evaluates both conditions even when first condition is true");   
        System.out.println("---------------------------------------------------------------------------\n");   
                
        int number = 11;
        
        System.out.println("----- FALSE && TRUE");   
        if (getFalseValue() && getTrueValue()) {
            System.out.println("Conclusion: if statement is True!");            
        } else {
            System.out.println("Conclusion: if statement is False!");   
        }

        System.out.println("\n----- FALSE & TRUE ");   
        if (getFalseValue() & getTrueValue()) {
            System.out.println("Conclusion: if statement is True!");            
        } else {
            System.out.println("Conclusion: if statement is False!");   
        }
        
        System.out.println("\n----- TRUE && FALSE - has to check both conditions");   
        if (getTrueValue() && getFalseValue()) {
            System.out.println("Conclusion: if statement is True!");            
        } else {
            System.out.println("Conclusion: if statement is False!");   
        }
        
        System.out.println("\n----- TRUE & FALSE - has to check both conditions");   
        if (getTrueValue() & getFalseValue()) {
            System.out.println("Conclusion: if statement is True!");            
        } else {
            System.out.println("Conclusion: if statement is False!");   
        }

        
        System.out.println("\n-------------------------------------------------------------\n");   
        
        System.out.println("----- TRUE || FALSE");   
        if (getTrueValue() || getFalseValue()) {
            System.out.println("Conclusion: if statement is True!");            
        } else {
            System.out.println("Conclusion: if statement is False!");   
        }

        System.out.println("\n----- TRUE | FALSE");   
        if (getTrueValue() | getFalseValue()) {
            System.out.println("Conclusion: if statement is True!");            
        } else {
            System.out.println("Conclusion: if statement is False!");   
        }
        
        System.out.println("\n----- FALSE || TRUE - has to check both conditions");   
        if (getFalseValue() || getTrueValue()) {
            System.out.println("Conclusion: if statement is True!");            
        } else {
            System.out.println("Conclusion: if statement is False!");   
        }
        
        System.out.println("\n----- FALSE | TRUE - has to check both conditions");   
        if (getFalseValue() | getTrueValue()) {
            System.out.println("Conclusion: if statement is True!");            
        } else {
            System.out.println("Conclusion: if statement is False!");   
        }
        
    }
    
    private static boolean getFalseValue(){
        System.out.println("in getFalseValue(): False!");
        return false;
    }
    
    private static boolean getTrueValue(){
        System.out.println("in getTrueValue():  True!");
        return true;
    }
}
