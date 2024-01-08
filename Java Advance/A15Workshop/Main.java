package A15Workshop;

public class Main {
    public static void main(String[] args) {


        SmartArray smartArray = new SmartArray();

        smartArray.add(1);
//        smartArray.add(13);
//        smartArray.add(42);

//        int removedValue = smartArray.remove(0);
//        System.out.println(removedValue); //-> 13

//        int removedValue = smartArray.remove(1);
//        System.out.println(removedValue);



        for (int i = 1; i < 100; i++) {
            smartArray.add(0, i + 1);
        }

        smartArray.forEach(System.out::println);

//        boolean isTrue = true;
//
//        while (isTrue) {
//            smartArray.add(13);
//            smartArray.remove(smartArray.size() - 1);
//
//        }


//        for (int i = 0; i < smartArray.size(); i++) {
//            System.out.println(smartArray.get(i));
        System.out.println();
    }
}
