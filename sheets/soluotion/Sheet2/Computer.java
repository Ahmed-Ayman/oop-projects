/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author g
 */
public class Computer {
private int storage, used;
private int freeSpace= storage - used;

public Computer (int s ,int u){
storage =s ;
used = u ;
}

public boolean checkStorage (int fileSize){
if ( freeSpace >= fileSize)
return true;
else
return false;
}
public void storeFile(int fileSize) {
if(freeSpace >= fileSize )
used += fileSize;
else
System.out.println("Out of memory");
}
}

