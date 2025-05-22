package com.devlayers.spring_granja_net.repositories;



import com.devlayers.spring_granja_net.entities.Lote;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class LoteRepository  {

    private  Lote lote;


    public LoteRepository(Lote lote) {
        this.lote = lote;
    }


    public Long createLote(Lote lote){
        Lote savedLote = lote.save(lote);
        return savedLote.getId();
    }

    public List<Lote> listLotes(){
        return lote.findAll();
    }