class CalculatorConundrum  {
    public String calculate(int operand1, int operand2, String operation) {
        String resutlt ="";

        if (operation == null) {
           throw new IllegalArgumentException("Operation cannot be null");
        }else if(operation.isEmpty()){
           throw new IllegalArgumentException("Operation cannot be empty");
        } 

        switch (operation) {
         case "+":
            resutlt = String.format("%d + %d = %d", operand1,operand2 , operand1 + operand2);
            break;
        
         case  "*":
            resutlt = String.format("%d * %d = %d", operand1,operand2 , operand1 *  operand2);
            break;
         
         case "/":
            try {
               resutlt = String.format("%d / %d = %d", operand1,operand2 , operand1 / operand2);
            } catch (Exception e) {
               throw new IllegalOperationException("Division by zero is not allowed",e);
            }
            break;

         default:
            throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
            
        }

        return  resutlt;
}
}