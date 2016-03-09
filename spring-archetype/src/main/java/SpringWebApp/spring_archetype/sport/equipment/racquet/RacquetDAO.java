package SpringWebApp.spring_archetype.sport.equipment.racquet;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class RacquetDAO
{
  @PersistenceContext
  private EntityManager entityManager;
  
  public void save(Racquet racquet) 
  {
    entityManager.persist(racquet);
  }
  
  public Racquet retrieveRacquetById(Long id) 
  {
    Racquet racquet = null;
    try 
    {
      racquet = entityManager.find(Racquet.class, id);
    }
    catch(Throwable e)
    {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
    return racquet;
  }
}
