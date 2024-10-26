package com.fastsolucoes.workshop.service;

import com.fastsolucoes.workshop.model.Workshop;
import com.fastsolucoes.workshop.repository.WorkshopRepository;
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

    public Workshop atualizarWorkshop(int id, Workshop workshop) {
        workshop.setId(id);
        return workshopRepository.save(workshop);
    }

    public void deletarWorkshop(int id) {
        workshopRepository.deleteById(id);
    }
}
