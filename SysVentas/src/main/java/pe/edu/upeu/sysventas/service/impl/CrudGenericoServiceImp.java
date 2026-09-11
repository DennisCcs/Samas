package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.exception.ModelNotfoundException;
import pe.edu.upeu.sysventas.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysventas.service.ICrudGenericoService;

import java.util.List;

public abstract class CrudGenericoServiceImp<T, ID> implements ICrudGenericoService<T, ID>{
    protected abstract ICrudGenericoRepository<T, ID> gerRepo();

    @Override
    public T save(T t) {
        return gerRepo().save(t);
    }

    @Override
    public T update(ID id, T t) {
        if (!gerRepo().existsById(id)){
            throw new ModelNotfoundException("ID no existe: "+id);
        }
        return gerRepo().update(t);
    }

    @Override
    public List<T> findAll() {
        return gerRepo().findAll();
    }

    @Override
    public T findByid(ID id) {
        return gerRepo().findById(id).orElseThrow(()->new ModelNotfoundException("El id no exixte: "+id));
    }

    @Override
    public void delete(ID id) {
        if (!gerRepo().existsById(id)) {
            throw new ModelNotfoundException("ID no existe: " + id);
        }
        gerRepo().deleteById(id);
    }
}
