/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet6;

/**
 *
 * @author yousof
 */
public class Mouse extends Animal {

    public Mouse(String name, String direction, Point position) {
        super(name, direction, position);
        liveMouse.add(true);
    }

    @Override
    public void forward() {
        if (liveMouse.elementAt((Integer.parseInt(name.substring(1))) - 1)) {
            check();
            check();
            check();
        }
    }

    private void check() {
        boolean check = true;
        for (Point p : allAnimals) {
            if (p.getX() - position.getX() == 1 && p.getY() - position.getY() == 0
                    && direction.equals("east")) {
                super.turnRight();
                super.turnRight();
                check = false;
                break;
            } else if (position.getX() - p.getX() == 1 && p.getY() - position.getY() == 0
                    && direction.equals("west")) {
                super.turnRight();
                super.turnRight();
                check = false;
                break;
            } else if (p.getY() - position.getY() == 1 && p.getX() - position.getX() == 0
                    && direction.equals("north")) {
                super.turnRight();
                super.turnRight();
                check = false;
                break;
            } else if (position.getY() - p.getY() == 1 && p.getX() - position.getX() == 0
                    && direction.equals("south")) {
                super.turnRight();
                super.turnRight();
                check = false;
                break;
            }
        }
        if (check) {
            super.forward();
        }
    }

    public String getLiveMouse() {
        if (liveMouse.elementAt((Integer.parseInt(name.substring(1))) - 1)) {
            return "alive";
        } else {
            return "dead";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nstate is : " + getLiveMouse();
    }
}
