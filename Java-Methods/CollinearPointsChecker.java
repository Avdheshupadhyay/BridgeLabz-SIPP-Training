// CollinearPointsChecker.java
// Program to check if 3 points are collinear (slope and area method)
public class CollinearPointsChecker {
    // Check collinearity by slope
    public static boolean areCollinearSlope(int x1,int y1,int x2,int y2,int x3,int y3){
        return (y2-y1)*(x3-x2)==(y3-y2)*(x2-x1);
    }
    // Check collinearity by area
    public static boolean areCollinearArea(int x1,int y1,int x2,int y2,int x3,int y3){
        return (x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))==0;
    }
    public static void main(String[] args) {
        int x1=2,y1=4,x2=4,y2=6,x3=6,y3=8; // Sample points
        System.out.println("By Slope: " + areCollinearSlope(x1,y1,x2,y2,x3,y3));
        System.out.println("By Area: " + areCollinearArea(x1,y1,x2,y2,x3,y3));
    }
}
