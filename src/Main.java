public class Main {
    public static void main(String[] args) {

        int ticetPrice = 13_254; // цена билета
        int costOfMile = 20; // рублей за 1 милю
        int number; //расчет

        if (ticetPrice >= 0) {
            number = ticetPrice / costOfMile;
        } else {
            number = 0;
        }
        System.out.println("Вам начисленно миль - " + number);
    }
}