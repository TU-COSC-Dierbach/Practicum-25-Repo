public class Swimmer {
  
  // First and last name
  private String name;

  // Best times for each event
  private ElapsedTime butterfly_time;
  private ElapsedTime backstroke_time;
  private ElapsedTime freestyle_time;

  // Constructor
  public Swimmer(String name) {
    this.name = name;
    
    butterfly_time = null;
    backstroke_time = null;
    freestyle_time = null;
  }

  // Getters and Setters
  // -- returns name
  public String getName() {
    return name;
  }

  // -- returns best butterfly time
  public ElapsedTime getButterflyTime() {
    return butterfly_time;
  }

  // -- sets best butterfly time
  public void setButterflyTime(ElapsedTime t) {
    butterfly_time = t;
  }

  // -- returns best backstroke time
  public ElapsedTime getBackstrokeTime() {
    return backstroke_time;
  }

  // -- sets best backstroke time
  public void setBackstrokeTime(ElapsedTime t) {
    backstroke_time = t;
  }
  
  // returns best freestyle time
  public ElapsedTime getFreestyleTime() {
    return freestyle_time;
  }

  // -- sets best freestyle time
  public void setFreestyleTime(ElapsedTime t) {
    freestyle_time = t;
  }
  
  // Returns e.g., 
  // "Ann Wu  Butterfly: 01:20.29  Backstroke: 01:42.02  Freestyle: 01:05.10"
  public String toString() {
    return name + " Butterfly " + butterfly_time + " Backstroke " + 
           backstroke_time + " Freestyle " + freestyle_time;
  }

  // Returns best event ("butterfly", "backstroke" or "freestyle")
  public String bestEvent() {
    String best_event;
    
    // Initially assume best time is the butterfly event
    ElapsedTime best_time = butterfly_time;
    best_event = "butterfly";

    // Check if backstroke event time better than the current best event time
    if( <COMPLETE> ){
      best_event = "backstroke";
    }

    // Check if freestyle event time better than the current best event time
    if( <COMPLETE> )
       best_event = "freestyle";

    return best_event;
  }

  // Returns name of better swimmer for specified event
  public String betterAt(Swimmer otherSwimmer, String event) {

    String better_swimmer = "";
    
    if(event.equals("butterfly"))
    {
        if( <COMPLETE> ) 
          better_swimmer = name;
        else 
          better_swimmer = otherSwimmer.getName();
    }
    else
    if(event.equals("backstroke")) 
    {
        if( <COMPLETE> )
          better_swimmer = name;
        else 
          better_swimmer = otherSwimmer.getName();
    }
    else
    if(event.equals("freestyle"))
    {
        if( <COMPLETE> )
          better_swimmer = name;
        else 
          better_swimmer = otherSwimmer.getName();
    }
  
    return better_swimmer;
  }
}