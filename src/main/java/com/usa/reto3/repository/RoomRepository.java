package com.usa.reto3.repository;

import com.usa.reto3.repository.interfaces.RoomInterface;
import com.usa.reto3.model.Disfraz;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nbsc1
 */
@Repository
public class RoomRepository {

    @Autowired
    private RoomInterface crud;

    public List<Disfraz> getAll() {
        return (List<Disfraz>) crud.findAll();
    }

    public Optional<Disfraz> getRoom(int id) {
        return crud.findById(id);
    }

    public Disfraz save(Disfraz disfraz) {
        return crud.save(disfraz);
    }

    public void delete(Disfraz disfraz) {
        crud.delete(disfraz);
    }

}
