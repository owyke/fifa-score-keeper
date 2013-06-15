package com.fifascore.data;

import com.fifascore.model.Team;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class TeamDaoImpl implements TeamDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public Team persist(Team entity) {
        em.persist(entity);
        return entity;
    }

    public List<Team> getAll() {
        TypedQuery<Team> query = em.createQuery("SELECT t FROM Team t ORDER BY t.name", Team.class);
        return query.getResultList();
    }

    @Transactional
    public void deleteById(Long idToDelete) {
        throw new NotImplementedException();
    }

    @Transactional
    public Team merge(Team entity) {
        throw new NotImplementedException();
    }
}
