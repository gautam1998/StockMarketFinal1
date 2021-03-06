package com.stockmarket.company2.services;

import java.io.IOException;
import java.util.List;

import com.stockmarket.company2.models.StockExchange;
import com.stockmarket.company2.shared.CompanyRequest;
import com.stockmarket.company2.shared.CompanyResponse;

public interface CompanyService {
    public List<CompanyResponse> getAllCompanies();
    public CompanyResponse createCompany(CompanyRequest companyRequestModel) throws IOException;
    public CompanyResponse updateCompany(CompanyRequest companyRequestModel, Integer id);
    public CompanyResponse findByTickListContaining(String ticker);
    public CompanyResponse findByCompanyName(String name);
    public CompanyResponse findByCompanyId(Integer id);
    public List<CompanyResponse> findAllCompanyBySector(String sector);
//    public List<CompanyDTO> findCompanyByTurnoverIsWithin(Long lo, Long hi);
    public List<CompanyResponse> findAllByExchangeListContaining(String stockExchange);
}
