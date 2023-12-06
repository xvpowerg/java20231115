/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20231206.Ch10_5_tostring;

/**
 *
 * @author xvpow
 */
public class Point  {
  private float x,y;
  public Point(){
      
  }
  public Point(float x,float y){
      this.x = x;
      this.y = y;
  }
  
  @Override
  public String toString(){
      return "("+this.x+","+this.y+")";
  }
  
}
