class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class Ex {
    public static void main(String[] args) {
        // final int x = 10;
        // System.out.println("Final variable x: " + x);

        int i = 0;
        int j = 0;
        // int nums[]=new int [5];

        // try{
        // System.out.println(nums[1]);
        // System.out.println(nums[5]);
        // j=19/i;

        // }catch(Exception e){
        // System.out.println("Cannot divide by zero. Please provide a non-zero value
        // for i."+e+" "+e.getMessage()+" "+e.getClass()+" "+e.toString()+"
        // "+e.getStackTrace()+" "+e.getCause()+" "+e.getLocalizedMessage()+"
        // "+e.getSuppressed());

        // }
        System.out.println("Bye");
        int m = 0;
        try {
            if (i == 0) {
                throw new MyException("i cannot be zero");
            }
            m = 19 / i;
        } catch (MyException e) {
            m = 19 / 1;
            System.out.println("Custom exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            m = 19 / 1;
            System.out.println("Cannot divide by zero. Please provide a non-zero value for i." + e + " "
                    + e.getMessage() + " " + e.getClass() + " " + e.toString() + " " + e.getStackTrace() + " "
                    + e.getCause() + " " + e.getLocalizedMessage() + " " + e.getSuppressed());
        }
        System.out.println(m);
    }
}


//throws keyword is used to declare that a method may throw an exception. It is used in the method signature to indicate that the method can throw one or more exceptions. When a method declares that it throws an exception, it is the responsibility of the caller to handle that exception, either by catching it or by declaring that it also throws the exception.
//throws keyword

