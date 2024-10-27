package com.laercio.desafio_fast.workshop.service;

import com.laercio.desafio_fast.workshop.model.Workshop;
import com.laercio.desafio_fast.workshop.repository.WorkshopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkshopService {

    @Autowired
    private WorkshopRepository workshopRepository;

    public List<Workshop> listarWorkshops() {
        return workshopRepository.findAll();
    }

    public Workshop salvarWorkshop(Workshop workshop) {
        return workshopRepository.save(workshop);
    }

    public Workshop atualizarWorkshop(int idWorkshops, Workshop workshop) {
        workshop.setIdWorkshops(idWorkshops);
        return workshopRepository.save(workshop);
    }

    public void deletarWorkshop(int idWorkshops) {
        workshopRepository.deleteById(idWorkshops);
    }
}
