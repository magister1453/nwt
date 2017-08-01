package za.co.nwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.nwt.model.Flat;

/**
 * Created by marc.marais on 2017-08-01.
 */
public interface FlatRepository extends JpaRepository<Flat, Long> {
}
