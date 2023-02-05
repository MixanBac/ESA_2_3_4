package ESA24.repo;

import ESA24.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface HeroRepository extends JpaRepository<Hero,Integer> {

    List<Hero> findAllByPlayerId(UUID player);
}
