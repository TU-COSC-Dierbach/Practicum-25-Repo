public class ElapsedTime {
  private int mins;
  private int secs;
  private int tenths;

  // constructor
  public ElapsedTime(int m, int s, int t) {
    mins = m;
    secs = s;
    tenths = t;
  }

  // copy constructor
  public ElapsedTime(ElapsedTime otherTime) {
    mins = otherTime.getMins();
    secs = otherTime.getSecs();
    tenths = otherTime.getTenths();
  }

  // getters
  public int getMins() {
    return mins;
  }

  public int getSecs() {
    return secs;
  }

  public int getTenths() {
    return tenths;
  }

  // toString method
  public String toString() {
    return pad(mins) + ":" + pad(secs) + "." + pad(tenths);
  }

  // relational operators
  public boolean equals(ElapsedTime otherTime) {
    return convertToTenths() == otherTime.convertToTenths();
  }

  public boolean lessThan(ElapsedTime otherTime) {
    return convertToTenths() < otherTime.convertToTenths();
  }

  public boolean greaterThan(ElapsedTime otherTime) {
    return convertToTenths() > otherTime.convertToTenths();
  }

  // convert to tenths of a second
  public int convertToTenths() {
    return mins * 3600 + secs * 60 + tenths;
  }

  // Private Methods
  private String pad(int n) {
    return String.format("%02d", n);
  }
}