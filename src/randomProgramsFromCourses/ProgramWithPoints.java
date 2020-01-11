package randomProgramsFromCourses;

public class ProgramWithPoints {
    public static void main(String[] args){
        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("distance(0,0) =  " + first.distance());
        System.out.println("distance(second) =  " + first.distance(second));
        System.out.println("distance(2,2) =  " + first.distance(2,2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
        System.out.println("distance(-1,-1)= " + second.distance(-1,-1));

    }

    public static class Point {
        private int x;
        private int y;

        public Point(){

        }
        public Point(int x,int y){
            this.x = x;
            this.y = y;
        }
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
        public void setX(int x){
            this.x = x;
        }
        public void setY(int y){
            this.y = y;
        }
        public double distance(){
            double dist = Math.sqrt((0 - this.x)*(0 - this.x) + (0 - this.y)*(0-this.y));
            return dist;
        }
        public double distance(int x, int y){
            double dist = Math.sqrt((x - this.x)*(x - this.x) + (y - this.y)*(y-this.y));
            return dist;
        }
        public double distance(Point another){
            double dist = Math.sqrt((another.getX() - this.x)*(another.getX() - this.x) + (another.getY() - this.y)*(another.getY()-this.y));
            return dist;
        }
    }
}


//trzeba tutaj zmienić wzor na ten: d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)