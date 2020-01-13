package org.launchcode.java.demos.lsn3classes1;


import java.util.ArrayList;

public class Course {

  private String instructor;
  private int roomNumber;
  private String time;
  private ArrayList<String> days;

  public ArrayList<String> getDays(){
    return days;
  }
  public void setDays(ArrayList<String> aDays){
    days = aDays;
  }

  public String getInstructor(){
    return instructor;
  }
  public void setInstructor(String aInstructor){
    instructor = aInstructor;
  }

  public int getRoomNumber(){
    return roomNumber;
  }
  public void setRoomNumber(int aSetRoomNumber){
    roomNumber = aSetRoomNumber;
  }

  public String getTime(){
    return time;
  }
  public void setTime(String aTime){
    time = aTime;
  }
}
