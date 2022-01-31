public class Recursion{
    
    int count22NoOverlap(String str){
        
        if(str.length() <= 1){
            
            return 0;
        
        } else {
            
            if(str.charAt(0) == '2' && str.charAt(1) == '2'){
               
                return 1 + count22NoOverlap(str.substring(2));
            
            } else {
                
                return count22NoOverlap(str.substring(1));
           
            }
        
        }

    }

    int count22Overlap(String str){

        if(str.length() <= 1){

            return 0;

        } else {

            int count = count22Overlap(str.substring(1));

            if(str.charAt(0) == '2' && str.charAt(1) == '2'){

                count++;

            }

            return count;

        }

    }

    int factorsOf10(int[] array, int value){

        if(array[0] == 0){

            return value;

        } else {

            if((double)array[1] / array[0] == 10 || (double)array[0] / array[1] == 10){

                value += 1;

            }

            array[0] = 0;
            int temp = array[0];

            for(int i = 0; i < array.length - 1; i++){

                array[i] = array[i + 1];

            }

            array[array.length - 1] = temp;

            return factorsOf10(array, value);

        }

    }

    boolean balancedParens(String string, ArrayStack stack){

        if(string.length() == 0 && stack.isEmpty()){

            return true;

        }

        if(string.length() == 0 && !stack.isEmpty()){

            return false;

        }

        if(string.charAt(0) == '('){

            stack.push('(');

        } else if(string.charAt(0) == ')'){

            if(stack.isEmpty() || stack.pop() != '('){

                return false;
                
            }

        }

        return balancedParens(string.substring(1), stack);

    }

    void reverseArray(Object[] array, int index1, int index2){

        if(index1 < index2){

            Object temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
            reverseArray(array, index1++, index2--);

        }

    }

    void TESTreverseArray(Object[] array, int index1, int index2){

        if(index1 < index2){

            Object temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
            TESTreverseArray(array, ++index1, --index2);

        } else {
            
            for(int i = 0; i < array.length; i++){

                System.out.print(array[i] + " ");
            }

        }

    }

}