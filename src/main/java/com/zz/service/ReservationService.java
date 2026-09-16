package com.zz.service;

import com.zz.mapper.ReservationMapper;
import com.zz.pojo.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private ReservationMapper reservationMapper;

    public void insert(Reservation reservation){
        reservationMapper.insert(reservation);
    }

    public Reservation findByPhone(String phone){
        return reservationMapper.findByPhone(phone);
    }
}
