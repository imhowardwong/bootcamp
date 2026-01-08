package com.bootcamp.demo;

//College Student
//Library Book

//! Developer B
public class Gun {
  private int bullet;

  public Gun(){
    this.bullet = 6;
  }
  public boolean shoot(){
    if(this.bullet >0){
    this.bullet--;
    return true;
    }
    return false;
  }

  public void addBullet(){
    this.bullet++;
  }

}
