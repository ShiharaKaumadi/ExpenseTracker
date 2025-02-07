package lk.ijse.expense.repo;

import lk.ijse.expense.entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepo extends JpaRepository<ExpenseEntity, Long> {
}
