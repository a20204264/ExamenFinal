package EFTomasOlortegui.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFTomasOlortegui.Model.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer>{

}
