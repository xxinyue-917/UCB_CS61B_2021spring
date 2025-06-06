public class breakcondition {
    public static void main(String[] args){
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};

        for (int i = 0; i < a.length; i += 1) {

            /** the break condition will exit the loop completely. */
            if (a[i].contains("horse")) {
                break;
            }

            for (int j = 0; j < 3; j += 1) {
                System.out.println(a[i]);

            }
        }
    }
}