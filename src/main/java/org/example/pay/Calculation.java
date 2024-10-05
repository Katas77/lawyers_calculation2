package org.example.pay;

import lombok.Getter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Calculation {
    List<PaymentDay> paymentList = new ArrayList<>();
    @Getter
    public int count = 0;
    public String action;
    @Getter
    public int total;


    public String result() {
        System.out.println("Введите пункт 'а' или  'б' или 'в'или  'г'");
        String paragraph = new Scanner(System.in).nextLine();
        while (true) {
            System.out.println("Введите дату в формате ДДММГГ");
            String date = new Scanner(System.in).nextLine();
            if (date.startsWith("00")) {
                break;
            }
            count++;
            String[] arrayDate = date.split("");
            String yearSt = "20" + arrayDate[4] + arrayDate[5];
            int year = Integer.parseInt(yearSt);
            String monthSt = arrayDate[2] + arrayDate[3];
            int month = Integer.parseInt(monthSt);
            String daySt = arrayDate[0] + arrayDate[1];
            int day = Integer.parseInt(daySt);
            System.out.println("Введите вид следственного действия");
            int validA = new Scanner(System.in).nextInt();
            this.valid(validA);
            PaymentDay payment= PaymentDay.builder()
                    .action(action)
                    .date(LocalDate.of(year, month, day))
                    .build();
            paymentList.add(payment);
        }
        return alla(paragraph);
    }


    String alla(String paragraph) {
        if (paragraph.startsWith("а"))
            return wer(PaymentDay.day2024[0], PaymentDay.dayOff2024[0], PaymentDay.day2025[0], PaymentDay.dayOff2025[0]);
        if (paragraph.startsWith("б"))
            return wer(PaymentDay.day2024[1], PaymentDay.dayOff2024[1], PaymentDay.day2025[1], PaymentDay.dayOff2025[1]);
        if (paragraph.startsWith("в"))
            return wer(PaymentDay.day2024[2], PaymentDay.dayOff2024[2], PaymentDay.day2025[2], PaymentDay.dayOff2025[2]);
        if (paragraph.startsWith("г"))
            return wer(PaymentDay.day2024[3], PaymentDay.dayOff2024[3], PaymentDay.day2025[3], PaymentDay.dayOff2025[3]);
        else return null;
    }

    public String wer(int day24, int dayOff24, int day25, int dayOff25) {
        LocalDate date1Oct = LocalDate.of(2024, 10, 1);
        int pay = 0;
        String all = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE").localizedBy(new Locale("ru"));
        paymentList.sort(Comparator.comparing(PaymentDay::getDate));
        for (PaymentDay payment : paymentList) {
            String dayER = formatter.format(payment.getDate());
            String sd = formatter2.format(payment.getDate().getDayOfWeek());
            if (payment.getDate().isBefore(date1Oct)) {
                if (valid(sd,payment)) {
                    pay = dayOff24;
                } else pay = day24;
            } else if (valid(sd,payment)) {
                pay = dayOff25;
            } else pay = day25;
            total = total + pay;
            all = all + dayER + " - " + sd + " - " + payment.getAction() + "  " + pay + "  руб." + System.lineSeparator();
        }
        return all;
    }

    public void valid(int validA) {
        switch (validA) {
            case 1 -> action = Actions.action1;
            case 2 -> action = Actions.action2;
            case 3 -> action = Actions.action3;
            case 4 -> action = Actions.action4;
            case 5 -> action = Actions.action5;
            case 6 -> action = Actions.action6;
            case 7 -> action = Actions.action7;
            case 8 -> action = Actions.action8;
            case 9 -> action = Actions.action9;
            case 10 -> action = Actions.action10;
            case 11 -> action = Actions.action11;
            case 12 -> action = Actions.action12;
        }
    }


    private boolean valid(String sd,PaymentDay payment){
        return sd.contains("суббота") || sd.contains("воскресенье")|| Arrays.stream(PaymentDay.holidays).anyMatch(day->payment.getDate().isEqual(day));
    }


}
