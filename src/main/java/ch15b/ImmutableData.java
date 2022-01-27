package ch15b;

public class ImmutableData {
  private final String name;
  private final int value;

  public ImmutableData(String name, int value) {
    this.name = name;
    this.value = value;
  }

  public String getName() { return name; }

  public int getValue() { return value; }
}
