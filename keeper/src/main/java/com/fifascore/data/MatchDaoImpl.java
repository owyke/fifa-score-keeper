package com.fifascore.data;

import com.fifascore.model.Match;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

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

    @Transactional
    public void deleteById(Long matchId) {
        Match matchToDelete = em.find(Match.class, matchId);
        em.remove(matchToDelete);
    }

    @Transactional
    public Match merge(Match entity) {
        throw new NotImplementedException();
    }
}
