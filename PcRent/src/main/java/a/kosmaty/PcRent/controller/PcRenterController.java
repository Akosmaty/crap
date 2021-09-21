package a.kosmaty.PcRent.controller;

import a.kosmaty.PcRent.model.CpuRepository;
import a.kosmaty.PcRent.model.MemoryRepository;
import a.kosmaty.PcRent.model.PcRenterRepository;
import a.kosmaty.PcRent.model.ProcesorRepository;
import a.kosmaty.PcRent.pc.Pc;
import a.kosmaty.PcRent.pc.PcRenter;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PcRenterController {
    private PcRenterRepository repository;
    private MemoryRepository memoryRepository;

    public PcRenterController(PcRenterRepository repository) {
        this.repository = repository;
    }

    @Transactional
    @PatchMapping("/PcRenters/{id}")
    public ResponseEntity<?> toggleTask(@PathVariable int id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        int memid = repository.findById(id).get().getIdmem();
        repository.findById(id)
                .ifPresent(pcRenter -> pcRenter.setMemprice(memoryRepository.findById(memid).get().getPrice()));
        return ResponseEntity.noContent().build();
    }

    

}
