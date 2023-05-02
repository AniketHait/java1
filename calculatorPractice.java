public class calculatorPractice {
    public static void main(String[] args) {
        calculator obj = new calculator();
        System.out.println(obj.add(4,5));

        AdvanceCalculator obj1 = new AdvanceCalculator();
        System.out.println(obj1.add(10, 5));
        
       obj1.display();
        
    }  
}
