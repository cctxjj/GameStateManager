import java.util.ArrayList;
import java.util.HashSet;

public class RectanglesUnion {

    static class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Rectangle {

        Point buttom, top;
        int area;
        ArrayList<Point> areapoints;

        public Rectangle(Point buttom, Point top) {
            this.buttom = buttom;
            this.top = top;
            areapoints = setupAreaPoints();
        }

        public boolean intercepts(Rectangle rectangle) {
            return (rectangle.buttom.x >= buttom.x && rectangle.buttom.x <= top.x);
        }

        public ArrayList<Point> setupAreaPoints() {
            ArrayList<Point> list = new ArrayList<>();
            for(int x = buttom.x; x < top.x; x++) {
                for(int y = buttom.y; y < top.y; y++) {
                    list.add(new Point(x, y));
                }
            }
            return list;
        }

        public ArrayList<Point> getAreaPoints() {
            ArrayList<Point> list = new ArrayList<>();
            for(int x = buttom.x; x < top.x; x++) {
                for(int y = buttom.y; y < top.y; y++) {
                    list.add(new Point(x, y));
                }
            }
            return list;
        }
    }

    static class RectangleManager {

        private HashSet<int[]> areaList;

        public RectangleManager() {
            areaList = new HashSet<>();
        }



        public void register(Rectangle rectangle) {
            for(Point p : rectangle.getAreaPoints()) {
                if(!has(new int[] {p.x, p.y})) {
                    areaList.add(new int[]{p.x, p.y});
                }
            }
        }

        public boolean has(int[] i) {
            for(int[] check : areaList) {
                if(check[0] == i [0] && check[1] == i[1]) {
                    return true;
                }
            }
            return false;
        }

        public int getSize() {
            return areaList.size();
        }
    }


    public static int calculateSpace(int[][] rectangles) {
        if(rectangles.length > 1) {
            RectangleManager manager = new RectangleManager();
            for(int[] i : rectangles) {
                manager.register(new Rectangle(new Point(i[0], i[1]), new Point(i[2], i[3])));
            }
            return manager.getSize();
        } else if(rectangles.length == 1) {
            return new Rectangle(new Point(rectangles[0][0], rectangles[0][1]), new Point(rectangles[0][2], rectangles[0][3])).area;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] i1 = new int[] {3, 3, 8, 5};
        int[] i2 = new int[] {6, 3, 8, 9};
        int[] i3 = new int[] {11, 6, 14, 12};
        System.out.println(calculateSpace(new int[][] {i1, i2 , i3}));
    }

}