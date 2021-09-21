package a.kosmaty.PcRent.pc;



import a.kosmaty.PcRent.model.CpuRepository;
import a.kosmaty.PcRent.model.MemoryRepository;
import a.kosmaty.PcRent.model.ProcesorRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;


@Entity
public class PcRenter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int idcpu;
    private int idmem;
    private int idprc;
    private int cpuprice;
    private  int memprice;
    private  int prcprice;

    public void setCpuprice(int cpuprice) {
        this.cpuprice = cpuprice;
    }

    public void setMemprice(int memprice) {
        this.memprice = memprice;
    }

    public void setPrcprice(int prcprice) {
        this.prcprice = prcprice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdcpu() {
        return idcpu;
    }

    public void setIdcpu(int idcpu) {
        this.idcpu = idcpu;
    }

    public int getIdmem() {
        return idmem;
    }

    public void setIdmem(int idmem) {
        this.idmem = idmem;
    }

    public int getIdprc() {
        return idprc;
    }

    public void setIdprc(int idprc) {
        this.idprc = idprc;
    }

    public int getCpuprice() {
        return cpuprice;
    }

    public int getMemprice() {
        return memprice;
    }

    public int getPrcprice() {
        return prcprice;
    }
}