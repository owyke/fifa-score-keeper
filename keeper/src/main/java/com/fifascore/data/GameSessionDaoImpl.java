package com.fifascore.data;

import com.fifascore.model.GameSession;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class GameSessionDaoImpl implements GameSessionDao {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public GameSession persist(final GameSession entity) {
        em.persist(entity);
        return entity;
    }

    @Transactional
    public GameSession merge(final GameSession entity) {
        em.merge(entity);
        return entity;
    }

    public List<GameSession> getActiveGameSessions() {
        TypedQuery<GameSession> query = em.createQuery("SELECT gs FROM GameSession gs WHERE gs.sessionEnded IS NULL order by gs.id DESC", GameSession.class);
        return query.getResultList();
    }

    public List<GameSession> getAll() {
        TypedQuery<GameSession> query = em.createQuery("SELECT gs FROM GameSession gs ORDER BY gs.sessionEnded", GameSession.class);
        return query.getResultList();
    }

    @Transactional
    public void deleteById(Long idToDelete) {
        throw new NotImplementedException();
    }
}
