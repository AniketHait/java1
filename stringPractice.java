public class stringPractice {
    
    public static void main(String[] args) {
        

        String name = "Toy"; // string literal pool

        System.out.println(name.hashCode());
        name = name + "308";

        System.out.println(name.hashCode());



        String s1 = new String("Toy");
        String s2 = new String("Toy");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));




        System.out.println( s1.charAt(3));
        System.out.println( s1.substring(4));

        String s3 = "Toy";
        String s4 = "Toy";
        System.out.println(s3 == s4);

        System.out.println(s3.equals(s4));
       


    }
}

