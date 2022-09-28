public class Main {
    public static void main(String[] args) {
        // Задание 1/1
        int age = 23;
        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно еще подождать");
        }
        // задания 1/2
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек ходит в универ");
        }
        if (age >= 24) {
            System.out.println("Человек ходит на работу");
        }
        // Задание 1/3
        int capacity = 102;
        int seatCount = 60;
        int otherCount = capacity - seatCount;
        int seatUsed = 55;
        int otherUsed = 35;
        if (seatUsed < seatCount) {
            System.out.println("Есть еще " + (seatCount - seatUsed) + "сидячих мест");
            if (otherUsed < otherCount) {
                System.out.println("Есть еще" + (otherCount - otherUsed) + "стоячих мест");
                System.out.println("задание 2/1");
                int yearsOLd = 15;
                if (yearsOLd >= 18) {
                    System.out.println("Поздравляем Вас с совершеннолетием");
                } else {
                    System.out.println("Возраст совершеннолетия еще не наступил, нужно еще подождать");
                    System.out.println("Задание 2/2");
                    if (yearsOLd >= 7 && yearsOLd < 18) {
                        System.out.println("Ребенок ходит в школу");
                    } else if (yearsOLd >= 18 && yearsOLd < 24) {
                        System.out.println("Человек ходит в универ");
                    } else if (yearsOLd >= 24) {
                        System.out.println("Человек ходит на работу");


                        int total = 102;
                        int countSeats = 60;
                        int countOther = total - countSeats;

                        int usedSeats = 60;
                        int usedOther = 42;
                        if (usedSeats < usedOther) {
                            System.out.println("Есть еще" + (countSeats - usedSeats) + "сидячих мест");
                        } else {
                            System.out.println("Сидячих мест нет");
                        }
                        if (usedOther < countOther) {
                            System.out.println("Есть еще" + (countOther - usedOther) + "стоячих мест");
                        } else {
                            System.out.println("Стоячих мест нет");

                        }
                    }
                }
            }
        }
    }
}




