package org.example;

public class Main {
    public static void main(String[] args) {
        Calculation payment=new Calculation();
            System.out.println(
                    payment.result());
        System.out.println("Количество дней " + payment.getCount());
        System.out.println("Итого к выплате подлежит сумма  - " + payment.getTotal() + " руб., которую прошу перечислить на банковские реквизиты:");


        }
    }
