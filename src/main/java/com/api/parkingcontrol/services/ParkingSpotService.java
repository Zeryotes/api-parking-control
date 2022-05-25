package com.api.parkingcontrol.services;

import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;

// Interessante criar uma interface 'ParkingSpotServiceInterface' para caso seja necessário modificar a implementação da classe de serviço.
@Service
public class ParkingSpotService {

    // Está instanciação pode ser realizada por meio a anotation @Autowired.
    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
}
