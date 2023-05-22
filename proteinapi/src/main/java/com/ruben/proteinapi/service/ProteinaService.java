package com.ruben.proteinapi.service;

import com.ruben.proteinapi.model.Proteina;
import com.ruben.proteinapi.repository.ProteinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;

@Service
@Transactional
public class ProteinaService {
    @Autowired
    ProteinaRepository proteinaRepository;

    public ArrayList<Proteina> getProteina(){
        return (ArrayList<Proteina>) proteinaRepository.findAll();
    }

    public Proteina saveProteina(Proteina proteina){
        return proteinaRepository.save(proteina);
    }

    public Optional<Proteina> getById (Integer id){
        return proteinaRepository.findById(id);
    }

    public Proteina updateById(Proteina request, Integer id){
        Proteina proteina = proteinaRepository.findById(id).get();

        proteina.setNombre(request.getNombre());
        proteina.setPeso(request.getPeso());
        proteina.setPrecio(request.getPrecio());

        return proteina;
    }

    public Boolean deleteProtein(Integer id){
        try {
            proteinaRepository.deleteById(id);
            return true;
        }catch (Exception e){return false;}
    }

}
