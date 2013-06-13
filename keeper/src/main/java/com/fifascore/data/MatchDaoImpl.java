package com.fifascore.data;

import com.fifascore.model.Match;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wykeosk
 * Date: 2013-06-08
 * Time: 11:07
 * To change this template use File | Settings | File Templates.
 */

@Component
public class MatchDaoImpl implements MatchDao {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public Match persist(Match entity) {
        em.persist(entity);
        return entity;
    }

    public List<Match> getAll() {
        TypedQuery<Match> query = em.createQuery("SELECT m FROM Match m", Match.class);
        return query.getResultList();
    }
}
