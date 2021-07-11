public class Loops {
    public static void main(String[] args) {
        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//
        for (String name : names){
            System.out.println(name);
        }

        int[] numbers = new int[] {1, 2, 3, 4, 5};
            int result = 0;
        for (int i = 0; i < numbers.length; i++){
            result = result + numbers[i];
        }
        System.out.println(result);







    }
}
