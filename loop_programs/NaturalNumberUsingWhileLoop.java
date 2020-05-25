//defining the class NaturalNumberUsingWhileLoop
class NaturalNumberUsingWhileLoop {
    //deafening the main function
    public static void main(String[] args) {
        //creating variable and storing an value
        int total = 0;
        //cratering variable and storing an value
        int naturalnumber = 0;
        //creating an while loop with and giving an condition
        while (naturalnumber <= 10) {
            //storing an value of the sum of total and naturalnumber
            total = total + naturalnumber;
            //increment the value of naturalnumber
            naturalnumber++;
        //closing the while loop
        }
        //printing the value of total with an instruction
        System.out.println("The Sum Of First 10 Natural Number Is :" + total);
    //closing the main block
    }
//closing the class block
}
