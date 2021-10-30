package com.usa.reto3.service;

import com.usa.reto3.model.Disfraz;
import com.usa.reto3.repository.RoomRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nbsc1
 */
@Service
public class RoomService {

    @Autowired

    private RoomRepository crudMetodos;

    public List<Disfraz> getAll() {
        return crudMetodos.getAll();
    }

    public Optional<Disfraz> getRoom(int roomId) {
        return crudMetodos.getRoom(roomId);
    }

    public Disfraz save(Disfraz disfraz) {
        if (disfraz.getId() == null) {
            return crudMetodos.save(disfraz);

        } else {

            Optional<Disfraz> evt = crudMetodos.getRoom(disfraz.getId());
            if (evt.isEmpty()) {
                return crudMetodos.save(disfraz);

            } else {
                return disfraz;

            }

        }

    }

}
