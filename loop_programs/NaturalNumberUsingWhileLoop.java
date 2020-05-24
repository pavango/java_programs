class NaturalNumberUsingWhileLoop {
    public static void main(String[] args) {
        int total = 0;
        int naturalnumber = 0;
        while (naturalnumber <= 10) {
            total = total + naturalnumber;
            naturalnumber++;
        }
        System.out.println("The Sum Of First 10 Natural Number Is :" + total);
    }
}
