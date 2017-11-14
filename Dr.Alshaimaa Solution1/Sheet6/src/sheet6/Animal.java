/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet6;

import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * @author yousof
 */
public class Animal {

    String name;
    static Vector<Boolean> liveMouse = new Vector<>();
    static Vector<Boolean> liveCat = new Vector<>();
    static Vector<Boolean> liveDog = new Vector<>();
    Point position;
    static Vector<Point> allAnimals = new Vector<>();
    static Vector<String> allNames = new Vector<>();
    String direction;
    static Hashtable<String, String> allAnimalsLocName = new Hashtable<>();

    public Animal(String name, String direction, Point position) {
        this.direction = direction;
        this.name = name;
        this.position = new Point(position);
        allAnimals.add(this.position);
        allNames.add(name);
        allAnimalsLocName.put(position.getX() + " " + position.getY(), name);
    }

    public void forward() {
        if (position.getX() == 0 && direction.equals("west")) {
            turnLeft();
        } else if (position.getY() == 0 && direction.equals("south")) {
            turnLeft();
        } else if (position.getX() == 50 && direction.equals("east")) {
            turnLeft();
        } else if (position.getY() == 50 && direction.equals("north")) {
            turnLeft();
        } else {
            switch (direction) {
                case "north":
                    position.move(0, 1);
                    break;
                case "south":
                    position.move(0, -1);
                    break;
                case "east":
                    position.move(1, 0);
                    break;
                case "west":
                    position.move(-1, 0);
                    break;
                default:
                    System.out.println("Not valid(not recognize)");
            }
        }

    }

    public void turnLeft() {
        if (direction.equals("north")) {
            direction = "west";
        } else if (direction.equals("west")) {
            direction = "south";
        } else if (direction.equals("south")) {
            direction = "east";
        } else if (direction.equals("east")) {
            direction = "north";
        }
    }

    public void turnRight() {
        if (direction.equals("north")) {
            direction = "east";
        } else if (direction.equals("east")) {
            direction = "south";
        } else if (direction.equals("south")) {
            direction = "west";
        } else if (direction.equals("west")) {
            direction = "north";
        }
    }

    public void killMouse(int a) {
        Animal.liveMouse.set(a, false);
        allAnimals.remove(a);
    }

    public void killCat(int a) {
        Animal.liveCat.set(a, false);
        allAnimals.remove(a);
    }

    @Override
    public String toString() {
        return "name is : " + name + "\ndirection is : " + direction
                + "\nposition is : "
                + position.getX() + " " + position.getY();
    }
}
