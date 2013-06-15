package com.fifascore.data;

import com.fifascore.model.Player;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;


@Component
public class PlayerDaoImpl implements PlayerDao {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public Player persist(Player entity) {
        em.persist(entity);
        return entity;
    }

    public List<Player> getAll() {
        TypedQuery<Player> query = em.createQuery(
                "SELECT p FROM Player p ORDER BY p.firstName", Player.class);
        return query.getResultList();
    }

    @Transactional
    public void deleteById(Long idToDelete) {
        throw new NotImplementedException();
    }

    @Transactional
    public Player merge(Player entity) {
        throw new NotImplementedException();
    }
}
