package SpringWebApp.spring_archetype.sport.equipment.racquet;

public enum RacquetType
{
  TENNIS("Tennis"),
  BADMINTON("Badminton"),
  SQUASH("Squash");
  
  private String prettyName;
  
  private RacquetType(String string)
  {
    this.prettyName = string;
  }
}
