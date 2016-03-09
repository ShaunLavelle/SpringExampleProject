package SpringWebApp.spring_archetype.sport.equipment.racquet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RacquetController
{
  @Autowired
  private RacquetService racquetService;
  
  public Racquet addNewRacquet(Racquet racquet) 
  {
    racquetService.addNewRacquet(racquet);
    return null;
  }
}
