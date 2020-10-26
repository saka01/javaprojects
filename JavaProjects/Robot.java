import java.awt.*;
import java.util.ArrayList;

    public class Robot {

        private Point location;
        private String direction;
        private ArrayList<String> moveHistory = new ArrayList<String>();

        public Robot()  {
            location = new Point(0, 0);
            direction = "N";
        }

        public Robot(Point p, int d)
        {
            this.location = p.getLocation();
            if(d==0)
                direction = "N";
            if(d==1)
                direction = "E";
            if(d==2)
                direction = "S";
            if(d==3)
                direction = "W";
        }
        public Point getLocation() {
            return location;
        }

        public String getDirection(){
            return direction;
        }

        public ArrayList<String> getMovementHistory(){
            return moveHistory;
        }

        public void move(){
            int x = location.x;
            int y = location.y;

            if(direction.equals("N")){
               location.setLocation(x,y-1);
            }else if(direction.equals("W")){
               location.setLocation(x - 1,y);

            }else if (direction.equals("S")){
               location.setLocation(x ,y+1);

            }else if (direction.equals("E")){
               location.setLocation(x + 1,y);

            }
            moveHistory.add(String.format("(%d,%d),%s", location.x, location.y, getDirection()));
        }

//        public void setLocation(int x, int y){
//            x = location.x;
//            y = location.y;
//        }

        public void turnLeft() {

            if (direction.equals("N")) {
                direction = "W";
            } else if (direction.equals("W")) {
                direction = "S";
            } else if (direction.equals("S")) {
                direction = "E";
            } else if (direction.equals("E")) {
                direction = "N";
            }
            moveHistory.add(String.format("(%d,%d),%s", location.x, location.y, getDirection()));

        }

        public void turnRight() {

            if (direction.equals("N")) {
                direction = "E";
            } else if (direction.equals("W")) {
                direction = "N";
            } else if (direction.equals("S")) {
                direction = "W";
            } else if (direction.equals("E")) {
                direction = "S";
            }
            moveHistory.add(String.format("(%d,%d),%s", location.x, location.y, getDirection()));

        }


}
