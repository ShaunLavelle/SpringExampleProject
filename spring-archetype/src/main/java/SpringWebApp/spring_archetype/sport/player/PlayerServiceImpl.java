package SpringWebApp.spring_archetype.sport.player;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService
{

  @Resource
  PlayerDAO playerDAO;
  
  @Override
  public Player retrievePlayer(Long id)
  {
    return playerDAO.retrievePlayer(id);
  }
  
}
