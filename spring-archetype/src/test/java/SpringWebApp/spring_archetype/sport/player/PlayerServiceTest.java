package SpringWebApp.spring_archetype.sport.player;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.junit.Test;

import com.github.springtestdbunit.annotation.DatabaseSetup;

import SpringWebApp.spring_archetype.config.AbstractIntegrationTest;

public class PlayerServiceTest extends AbstractIntegrationTest
{
  @Resource
  private PlayerService playerService;
  
  private static final Long ID = 10l;
  
  @Test
  @Transactional
//  @Rollback(false)
  @DatabaseSetup({"classpath:player.xml", "classpath:racquet.xml", "classpath:player_racquet.xml"})
  public void retrievePlayer()
  {
   Player player = playerService.retrievePlayer(ID);
   assertNotNull(player);
   
   /*
   List<Racquet> racquets = new ArrayList<Racquet>();
   
   for (PlayerRacquet playerRacquet : player.getPlayerRacquet())
   {
     racquets.add(playerRacquet.getRacquet());
   }
   
   for (Racquet racquet : racquets)
  {
     System.out.println(racquet.getModel());
  }
   
   assertEquals(ID, player.getId());
  }*/
  
  }
}