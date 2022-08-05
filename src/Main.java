public class Main {
    public static void main(String[] args) {
        String myFavoriteFood = "Pizza and Potato";
        System.out.println(myFavoriteFood);

        final int NUM = 22;


        String word = "Hello";
        myFavoriteFood = (NUM + word);
        System.out.println(myFavoriteFood + NUM + word);

        int num = 22;

        if (num < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if(num > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
    }
}