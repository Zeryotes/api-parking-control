package com.api.parkingcontrol.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
    // Serializable é responsável por fazer conversões internas em bytes para que os dados sejam armazenados no DB.
    private static final long serialVersionUID = 1L;



}
