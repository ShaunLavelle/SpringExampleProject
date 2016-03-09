package SpringWebApp.spring_archetype.sport.player;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class PlayerDAO
{

  @PersistenceContext
  private EntityManager entityManager;
  
  public Player retrievePlayer(Long id)
  {
    return entityManager.find(Player.class, id);
  }
}