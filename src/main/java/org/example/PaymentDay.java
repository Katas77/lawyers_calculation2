package org.example;

import java.time.LocalDate;

public class PaymentDay {
    String action;
    LocalDate date;
    final static int[] day2024 = {2359, 2118, 1882, 1646};
    final static int[] dayOff2024 = {3676, 3193, 2722, 2249};
    final static int[] day2025 = {2479, 2226, 1978, 1730};
    final static int[] dayOff2025 = {3863, 3356, 2861, 2364};

    public PaymentDay(String action, LocalDate date) {
        this.action = action;
        this.date = date;
    }


    public String getAction() {
        return action;
    }

    public LocalDate getDate() {
        return date;
    }
}
