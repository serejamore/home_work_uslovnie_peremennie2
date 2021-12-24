package com.company;

public class Main {

    public static void main(String[] args) {
//        int year = 405;
//        if (year % 4 == 0) {
//            if ((year % 100 != 0) || (year % 400 == 0)) {
//                System.out.println("Год является високосным");
//            }
//        } else {
//            System.out.println("Год является не високосным");
//        }
//       int  deliveryDistance = 41;
//       int daysCounts = 1;
//       if (deliveryDistance > 20) {
//           daysCounts = daysCounts + 1;
//       }
//       if (deliveryDistance >= 60 && deliveryDistance <= 100) {
//           daysCounts = daysCounts + 1;
//       }
//        if (deliveryDistance > 100) {
//            System.out.println("Доставка невозможна");
//
//        } else {
//            System.out.printf("Трбуется" + daysCounts + "дней");
//
//
//        }
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
                case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");


        }

    }

}