package com.spark.sfgpetclinic.service.map;

import com.spark.sfgpetclinic.model.Vet;
import com.spark.sfgpetclinic.service.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Long id, Vet object) {
        return super.save(id,object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
