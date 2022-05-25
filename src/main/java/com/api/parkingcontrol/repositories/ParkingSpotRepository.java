package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

// JpaRespository é extendido pois ele possui alguns métodos prontos para utilizar com transações com bancos de dados.
@Repository // JpaRepository já contém essa Anotation, não é necessário adiciona-lá na interface (mas deixa organizado colocar).
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {


}
