package redes.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import redes.App.domain.Blockip;

public interface BlockIpRepository extends JpaRepository<Blockip, Integer> {
     @Query(value = "SELECT ip FROM Blockip ip WHERE ip.ipAddress = :ipAddress") Blockip findByIpAddress(@Param("ipAddress") String ipAddress);

}
