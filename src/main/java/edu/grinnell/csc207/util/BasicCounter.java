package edu.grinnell.csc207.util;

public class BasicCounter implements Counter {
  // FIELDS
  int count;
  int start;

  //CONSTRUCTORS
  public BasicCounter(int startingValue){
    this.count = startingValue;
    this.start = startingValue;
  }

  public void increment(){
    this.count += 1;
  }
  public void reset(){
    this.count = this.start;
  }
  public String toString(){
    return new String("[" + this.count + "]");
  }
  public int get(){
    return this.count;
  }
}
