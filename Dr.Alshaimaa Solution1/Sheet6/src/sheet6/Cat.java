/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet6;

/**
 *
 * @author yousof
 */
public class Cat extends Animal {

    public Cat(String name, String direction, Point position) {
        super(name, direction, position);
        liveCat.add(true);
    }

    @Override
    public void forward() {
        if (liveCat.elementAt((Integer.parseInt(name.substring(1))) - 1)) {
            check();
            check();
        }
    }

    private void check() {
        boolean check = true;
        for (int i = 0; i < allAnimals.size(); i++) {
            if (allAnimals.get(i).getX() - position.getX() == 1
                    && allAnimals.get(i).getY() - position.getY() == 0
                    && direction.equals("east")) {
                check1(i);
                check = false;
                break;
            } else if (position.getX() - allAnimals.get(i).getX() == 1
                    && allAnimals.get(i).getY() - position.getY() == 0
                    && direction.equals("west")) {
                check1(i);
                check = false;
                break;
            } else if (allAnimals.get(i).getY() - position.getY() == 1
                    && allAnimals.get(i).getX() - position.getX() == 0
                    && direction.equals("north")) {
                check1(i);
                check = false;
                break;
            } else if (position.getY() - allAnimals.get(i).getY() == 1
                    && allAnimals.get(i).getX() - position.getX() == 0
                    && direction.equals("south")) {
                check1(i);
                check = false;
                break;
            }
        }
        if (check) {
            super.forward();
        }
    }

    private void check1(int i) {
       
            if (allAnimalsLocName.get((allAnimals.get(i)).getX() + " "
                    + (allAnimals.get(i)).getY()) != null) {
                if (((allAnimalsLocName.get((allAnimals.get(i)).getX() + " "
                        + (allAnimals.get(i)).getY()).substring(0, 1))).equals("m")
                        && liveMouse.get(Integer.parseInt(
                        allAnimalsLocName.get((allAnimals.get(i)).getX() + " "
                        + (allAnimals.get(i)).getY()).substring(1))-1)) {
                    killMouse(Integer.parseInt(
                        allAnimalsLocName.get((allAnimals.get(i)).getX() + " "
                        + (allAnimals.get(i)).getY()).substring(1))-1);
                    super.forward();
                }
            } else {
                super.turnRight();
                super.turnRight();
            }
        
    }

    public String getLiveCat() {
        if (liveCat.elementAt((Integer.parseInt(name.substring(1))) - 1)) {
            return "alive";
        } else {
            return "dead";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nstate is : " + getLiveCat();
    }
}
