package be.thomasmore.party.repositories;

import be.thomasmore.party.model.Party;
import be.thomasmore.party.model.Snack;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface SnackRepository extends CrudRepository<Snack, Integer> {
    Optional<Snack> findFirstByIdLessThanOrderByIdDesc(Integer id);

    Optional<Snack> findFirstByOrderByIdDesc();

    Optional<Snack> findFirstByIdGreaterThanOrderByIdAsc(Integer id);

    Optional<Snack> findFirstByOrderByIdAsc();

    //List<Snack> findByFilter
}
