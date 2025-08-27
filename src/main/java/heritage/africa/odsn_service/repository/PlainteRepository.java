package heritage.africa.odsn_service.repository;

import heritage.africa.odsn_service.entity.Plainte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PlainteRepository extends JpaRepository<Plainte, Long> {


//    @Query("SELECT p FROM Plainte p WHERE " +
//            "LOWER(p.urgence) = LOWER(:urgence) AND " +
//            "LOWER(p.region) = LOWER(:region) AND " +
//            "LOWER(p.plaignant) = LOWER(:plaignant)")


//        @Query("SELECT p FROM Plainte p WHERE   p.region = :region AND p.urgence = :urgence AND p.plaignant = :plaignant")
//    List<Plainte> filtrerIgnoreCase(
//                                    @Param("region") String region,
//                                    @Param("urgence") String urgence,
//                                    @Param("plaignant") String plaignant);


//    @Query("SELECT p FROM Plainte p WHERE " +
//            "(:urgence = 'toutes' OR LOWER(p.urgence) = LOWER(:urgence)) AND " +
//            "(:region = 'toutes' OR LOWER(p.region) = LOWER(:region)) AND " +
//            "(:plaignant = 'toutes' OR LOWER(p.plaignant) = LOWER(:plaignant))")
//    List<Plainte> filtrerIgnoreCase(
//            @Param("region") String region,
//            @Param("urgence") String urgence,
//            @Param("plaignant") String plaignant);

}
