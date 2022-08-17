package EFTomasOlortegui.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFTomasOlortegui.Model.PizzaDetalle;
@Repository
public interface PizzaClienteRepository extends JpaRepository<PizzaDetalle, Integer> {

}
