package SpringWebApp.spring_archetype.sport.equipment.racquet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
  
  @RequestMapping("/viewRacquets")
  public ModelAndView viewRacquets() {
      ModelAndView mv = new ModelAndView("racquet/racquet");
      mv.addObject("greeting", "Welcome!");
      List<Racquet> allRacquets = racquetService.retrieveAllRacquets();
      mv.addObject("allRacquets", allRacquets);
      return mv;
  }
}