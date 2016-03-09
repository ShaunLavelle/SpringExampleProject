package SpringWebApp.spring_archetype.sport.player;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import SpringWebApp.spring_archetype.sport.player.racquet.PlayerRacquet;

@Entity
@Table(name="player")
public class Player
{
  @Id
  @GeneratedValue
  private Long id;
  
  @Column(name="first_name")
  private String firstName;

  @Column(name="surname")
  private String surname;
  
  @Column(name="age")
  private Long age;
  
  @Column(name="height")
  private String height;
  
  @OneToMany(mappedBy="player")
  public Set<PlayerRacquet> playerRacquet;
  
  public Set<PlayerRacquet> getPlayerRacquet()
  {
    return playerRacquet;
  }

  public void setPlayerRacquet(Set<PlayerRacquet> playerRacquet)
  {
    this.playerRacquet = playerRacquet;
  }

  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getSurname()
  {
    return surname;
  }

  public void setSurname(String surname)
  {
    this.surname = surname;
  }

  public Long getAge()
  {
    return age;
  }

  public void setAge(Long age)
  {
    this.age = age;
  }

  public String getHeight()
  {
    return height;
  }

  public void setHeight(String height)
  {
    this.height = height;
  }
}