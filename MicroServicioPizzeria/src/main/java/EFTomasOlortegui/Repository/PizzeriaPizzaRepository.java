package EFTomasOlortegui.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import EFTomasOlortegui.Model.PizzeriaDetalle;

@Repository
public interface PizzeriaPizzaRepository extends JpaRepository<PizzeriaDetalle, Integer> {

}
