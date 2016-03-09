package SpringWebApp.spring_archetype.sport.equipment.racquet;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import SpringWebApp.spring_archetype.sport.player.racquet.PlayerRacquet;

@Entity
@Table(name="racquet")
public class Racquet
{
  @Id
  @GeneratedValue
  private Long id;
  
  @Column(name="make")
  private String make;
  
  @Column(name="model")
  private String model;
  
  @Column(name="cost")
  private BigDecimal cost;
  
  @Column(name="type")
  @Enumerated(EnumType.STRING)
  private RacquetType type;
  
  @OneToMany(mappedBy="racquet")
  public Set<PlayerRacquet> playerRacquet;
  
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
      String getMake()
  {
    return make;
  }

  public
      void setMake(String make)
  {
    this.make = make;
  }

  public
      String getModel()
  {
    return model;
  }

  public
      void setModel(String model)
  {
    this.model = model;
  }

  public
      BigDecimal getCost()
  {
    return cost;
  }

  public
      void setCost(BigDecimal cost)
  {
    this.cost = cost;
  }

  public
      RacquetType getType()
  {
    return type;
  }

  public
      void setType(RacquetType type)
  {
    this.type = type;
  }
}
