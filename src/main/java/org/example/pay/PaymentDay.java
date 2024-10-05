package org.example.pay;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PaymentDay {
    String paragraph;
    String action;
    LocalDate date;
    final static int[] day2024 = {2359, 2118, 1882, 1646};
    final static int[] dayOff2024 = {3676, 3193, 2722, 2249};
    final static int[] day2025 = {2479, 2226, 1978, 1730};
    final static int[] dayOff2025 = {3863, 3356, 2861, 2364};

    final static LocalDate[] holidays = {LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 2), LocalDate.of(2024, 1, 3)
            , LocalDate.of(2024, 1, 4), LocalDate.of(2024, 1, 5), LocalDate.of(2024, 1, 6), LocalDate.of(2024, 1, 8)
            , LocalDate.of(2024, 2, 23), LocalDate.of(2024, 3, 8), LocalDate.of(2024, 4, 29), LocalDate.of(2024, 1, 30)
            , LocalDate.of(2024, 5, 1), LocalDate.of(2024, 5, 9), LocalDate.of(2024, 5, 10), LocalDate.of(2024, 6, 12)
            , LocalDate.of(2024, 11, 4), LocalDate.of(2024, 12, 29), LocalDate.of(2024, 12, 30),


            LocalDate.of(2025, 1, 1), LocalDate.of(2025, 1, 2), LocalDate.of(2025, 1, 3), LocalDate.of(2025, 1, 4)
            , LocalDate.of(2024, 1, 5), LocalDate.of(2025, 1, 6), LocalDate.of(2025, 1, 7), LocalDate.of(2025, 1, 8)
            , LocalDate.of(2025, 2, 23), LocalDate.of(2025, 3, 8), LocalDate.of(2025, 4, 29), LocalDate.of(2025, 1, 30)
            , LocalDate.of(2025, 5, 1), LocalDate.of(2025, 5, 9), LocalDate.of(2025, 5, 10), LocalDate.of(2025, 6, 12)
            , LocalDate.of(2025, 11, 4), LocalDate.of(2025, 12, 29), LocalDate.of(2025, 12, 30)


    };



}
