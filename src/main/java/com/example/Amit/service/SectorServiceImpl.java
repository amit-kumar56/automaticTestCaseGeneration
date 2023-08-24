package com.example.Amit.service;

import com.example.Amit.model.Company;
import com.example.Amit.model.Sector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SectorServiceImpl implements SectorService
{
   
	static List<Sector> l=new ArrayList<>();
	static {
		l.add(new Sector("1","sds","zszsdf"));
		l.add(new Sector("2","sds","zszsdf"));
		l.add(new Sector("3","sds","zszsdf"));
	}
	
    @Override
    public Sector save(Sector sectorDto)
    {
    	l.add(sectorDto);

        return sectorDto;

    }

    @Override
    public List<Sector> findAll()
    {
        return l;
    }

    @Override
    public Optional<Sector> findById(String id)
    {
        return Optional.ofNullable(l.get(0));

    }

    @Override
    public void deleteById(String id) {
        l.remove(id);
    }
/*
    @Override
    public List<Company> getCompanies(String id)
    {
        Optional<Sector> sector = sectorRepository.findById(id);
        if(!sector.isPresent())
            return null;
       return sector;
    }

    /* Feign Client Service */
    /*
    @Override
    public SectorDto addCompanyToSector(String sectorName, CompanyDto companyDto)
    {
        Sector sector = sectorRepository.findByName(sectorName);
        if(sector == null)
            return null;
        sector.getCompanies().add(companyMapper.toCompany(companyDto));
        sector = sectorRepository.save(sector);
        return sectorMapper.toSectorDto(sector);
    }
    */
}