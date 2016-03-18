package SpringWebApp.spring_archetype.sport.equipment.racquet;

import java.util.List;

public interface RacquetService
{
  Racquet addNewRacquet(Racquet racquet);

  Racquet retrieveRacquetById(Long id);

  List<Racquet> retrieveAllRacquets();
}
