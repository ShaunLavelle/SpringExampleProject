package SpringWebApp.spring_archetype.sport.equipment.racquet;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class RacquetServiceImpl implements RacquetService
{

  @Resource
  private RacquetDAO racquetDAO;
  
  @Override
  public Racquet addNewRacquet(Racquet racquet)
  {
    racquetDAO.save(racquet);
    return racquet;
  }

  @Override
  public Racquet retrieveRacquetById(Long id)
  {
    return racquetDAO.retrieveRacquetById(id);
  }
}
