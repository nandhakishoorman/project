public class Main{
    public static void main(String[] args){
        String[] vegetable = {"Carrot", "Onion"};
        String[] fruits = {"Apple", "Banana"};

        String[][]d2_arrow= {vegetable, fruits};

        for (String[] d2_array_copy : d2_arrow){
            for (String d2_array_copy_copy : d2_array_copy){
                System.out.println(d2_array_copy_copy);
            }
        }
    }
}