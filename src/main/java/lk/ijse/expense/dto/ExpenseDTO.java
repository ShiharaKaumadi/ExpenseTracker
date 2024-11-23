package lk.ijse.expense.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
public class ExpenseDTO {
    private Long id;
    private String title;
    private String description;
    private String category;
    private LocalDate time;
    private Integer amount;
}
