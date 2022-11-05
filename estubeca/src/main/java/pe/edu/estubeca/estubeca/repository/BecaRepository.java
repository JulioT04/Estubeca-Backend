package pe.edu.estubeca.estubeca.repository;

import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.estubeca.estubeca.entities.Beca;
import pe.edu.estubeca.estubeca.entities.Etiqueta;

import java.util.List;

public interface BecaRepository extends JpaRepository<Beca,Long> {

    //@Query("Select b from Beca b where b.requisitos='Promedio mínimo 14'")

    //List<Beca>findBecasByRequisitosContaining(String requisitos);

    List<Beca> findBecaByTitleContaining(String title);

    //List<Beca> findBecaByEtiquetaContaining(Etiqueta etiqueta);
}
