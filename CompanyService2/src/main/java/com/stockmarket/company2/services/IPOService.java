package com.stockmarket.company2.services;

import java.util.List;

import com.stockmarket.company2.models.IPO;
import com.stockmarket.company2.shared.IpoDTO;

public interface IPOService {

    public IpoDTO addIPO(IpoDTO ipo);
    public List<IpoDTO> getAllIPO();

}
