package SpringWebApp.spring_archetype.sport.equipment.racquet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.github.springtestdbunit.annotation.DatabaseSetup;

import SpringWebApp.spring_archetype.config.AbstractIntegrationTest;

/**
 * @author lavelles
 *
 */
public class RacquetServiceTest extends AbstractIntegrationTest
{
  @Resource
  private RacquetService racquetService;
  
  private static final Long ID = 115l;
  private static final BigDecimal COST = new BigDecimal("79.99");
  private static final String MAKE = "HEAD";
  private static final String MODEL = "GrapheneXT Instinct MP Blue White";
  private static final RacquetType TYPE = RacquetType.TENNIS;
  
  /**
   * Test retrieveRacquetById method in RacquetService 
   */
  @Test
  @Transactional
//  @Rollback(false)
  @DatabaseSetup({"classpath:player.xml", "classpath:racquet.xml", "classpath:player_racquet.xml"})
  public void retrieveRacquetById()
  {
   Racquet racquet = racquetService.retrieveRacquetById(ID);
   
   assertNotNull(racquet);
   
   assertEquals(ID, racquet.getId());
   assertEquals(COST, racquet.getCost());
   assertEquals(MAKE, racquet.getMake());
   assertEquals(MODEL, racquet.getModel());
   assertEquals(TYPE, racquet.getType());
  }
  
  /**
   * Test addNewRacquet method in RacquetService 
   */
  @Test
  @Transactional
  @Rollback(false)
  public void addNewRacquetTest()
  {
    Racquet racquet = new Racquet();
    racquet.setCost(COST);
    racquet.setMake(MAKE);
    racquet.setModel(MODEL);
    racquet.setType(TYPE);
    
    racquetService.addNewRacquet(racquet);
    
    Racquet racquetRetrieved = racquetService.retrieveRacquetById(racquet.getId());
    
    assertNotNull(racquetRetrieved);
    assertEquals(COST, racquetRetrieved.getCost());
    assertEquals(MAKE, racquetRetrieved.getMake());
    assertEquals(MODEL, racquetRetrieved.getModel());
    assertEquals(TYPE, racquetRetrieved.getType());
  }
}