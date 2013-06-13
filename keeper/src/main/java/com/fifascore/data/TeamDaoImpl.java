package com.fifascore.data;

import com.fifascore.model.Team;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wykeosk
 * Date: 2013-06-07
 * Time: 18:50
 * To change this template use File | Settings | File Templates.
 */
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
}
