package org.example.diplomademo.services;

import org.example.diplomademo.entities.SalePoint;
import org.example.diplomademo.repositories.SalePointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class SalePointServiceImpl implements SalePointService{
    private final SalePointRepository salePointRepository;
    @Autowired
    public SalePointServiceImpl(SalePointRepository salePointRepository) { this.salePointRepository = salePointRepository; }

    @Transactional(readOnly = true)
    @Override
    public List<SalePoint> getAllSalePoint() { return salePointRepository.findAll(); }

    @Transactional
    @Override
    public SalePoint createSalePoint(SalePoint salePoint) { return salePointRepository.save(salePoint); }

    @Transactional
    @Override
    public void updateSalePoint(SalePoint salePoint) { salePointRepository.save(salePoint); }

    @Transactional
    @Override
    public void deleteSalePoint(SalePoint salePoint) { salePointRepository.delete(salePoint); }

    @Transactional(readOnly = true)
    @Override
    public Optional<SalePoint> getSalePointById(long id) { return salePointRepository.findById(id); }

    @Transactional(readOnly = true)
    @Override
    public List<SalePoint> getIdByName(String name) { return salePointRepository.getIdByName(name); }
}
