public class ArrayStack{
    
    
    int arraySize;
    private char[] store;
    int top;


    public ArrayStack(){
        arraySize = 5;
        store = new char[arraySize];
        top = -1;
    }

    private void resize(){
        char[] storeCopy = store;

        store = new char[arraySize * 2];

        for(int i = 0; i < arraySize; i++){
            store[i] = storeCopy[i];
        }

        arraySize *= 2;
    }
    
    /** Adds a new entry to the top of this stack.
     * @param newEntry  An int to be added to the stack. */
    public void push(char newEntry){
        
        if(top + 1 == arraySize){
            resize();
        }

        top++;
        store[top] = newEntry;
    }
    
    /** Removes and returns this stack's top entry.
     * @return  The int at the top of the stack.
     * @throws  EmptyStackException if the stack is empty before the operation. */
    public char pop(){
        
        if(isEmpty()){
            throw new EmptyStackException();
        }
        char topEntry = store[top];
        store[top] = 0;
        top--;
        return topEntry;

    }

    /** Retrieves this stack's top entry.
     * @return  The int at the top of the stack.
     * @throws  EmptyStackException if the stack is empty. */
    public int peek(){

        if(isEmpty()){
            throw new EmptyStackException();
        }
        return store[top];
        
    }

    /** Detects whether this stack is empty.
     * @return  True if the stack is empty. */
    public boolean isEmpty(){
        
        return (top == -1);

    }

    /** Removes all entries from this stack */
    public void clear(){

        for(int i = 0; i <= top; i++){
            store[i] = 0;
        }

        top = -1;
    }

}