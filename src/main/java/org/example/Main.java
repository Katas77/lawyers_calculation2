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
/**
 * 1 = "допрос подозреваемого";
 * 2 = "допрос обвиняемого";
 * 3 = "предъявление постановления о назначении экспертизы";
 * 4 = "предъявление заключения эксперта";
 * 5 = "уведомление об окончании следственных действий";
 * 6 = "ознакомление с материалами уголовного дела";
 * 7 = "очная ставка";
 * 8 = "проверка показаний на месте";
 * 9 = "составление протокола задержания";
 * 10 = "рассмотрение ходатайство следователя об избрании меры пресечения";
 * 11 = "рассмотрение ходатайство следователя о продлении срока содержания под стражей";
 * 12 = "изъятия предметов, имеющих значение для уголовного дела, выемка";
 */