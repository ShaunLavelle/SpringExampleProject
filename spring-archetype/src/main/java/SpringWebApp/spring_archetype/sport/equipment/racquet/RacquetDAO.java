package SpringWebApp.spring_archetype.sport.equipment.racquet;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;

@Repository
public class RacquetDAO extends GenericDAOImpl<Racquet, Long>
{
  @PersistenceContext
  private EntityManager entityManager;
  
  public void saveRacquet(Racquet racquet) 
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

  public List<Racquet> retrieveAllRacquets()
  { 
    List<Racquet> racquets = super.findAll();
    return racquets;
  } 
}
