package A17Generics.E02GenericArrayCreator;

public class Main {
    public static void main(String[] args) {

        Integer[] arrayInt = ArrayCreator.create(13, 13);
        String[] arrayString = ArrayCreator.create(13, "Java");

        for (Integer integer : arrayInt) {
            System.out.println(integer);
        }
    }
}
