package SpringWebApp.spring_archetype.sport.player.racquet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import SpringWebApp.spring_archetype.sport.equipment.racquet.Racquet;
import SpringWebApp.spring_archetype.sport.player.Player;

@Entity
@Table(name="player_racquet")
public class PlayerRacquet
{
  @Id
  @GeneratedValue
  private Long id;
  
  @ManyToOne
  @JoinColumn(name = "racquet_id")
  private Racquet racquet;
  
  @ManyToOne
  @JoinColumn(name = "player_id")
  private Player player;

  public
      Long getId()
  {
    return id;
  }

  public
      void setId(Long id)
  {
    this.id = id;
  }

  public
      Racquet getRacquet()
  {
    return racquet;
  }

  public
      void setRacquet(Racquet racquet)
  {
    this.racquet = racquet;
  }

  public
      Player getPlayer()
  {
    return player;
  }

  public
      void setPlayer(Player player)
  {
    this.player = player;
  }
}
