package com.debihiga.leetcode.interview.google.phone.question2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class SolutionImpl1Test {

    /**
     * Input: [[1,1],[1,3],[3,1],[3,3],[2,2]]
     * Output: 4
     * */
    @Test
    public void test1() {
        assertEquals(4, minAreaRect(new int[][] {
                {1,1},
                {1,3},
                {3,1},
                {3,3},
                {2,2}
        }));
    }
    /**
     * Input: [[1,1],[1,3],[3,1],[3,3],[4,1],[4,3]]
     * Output: 2
     * */
    //@Test
    public void test2() {
        assertEquals(2, minAreaRect(new int[][] {
                {1,1},
                {1,3},
                {3,1},
                {3,3},
                {4,1},
                {4,3}
        }));
    }

    /**
     * Input
     * [[3,2],[0,0],[3,3],[3,4],[4,4],[2,1],[4,3],[1,0],[4,1],[0,2]]
     * Output
     * 8
     * Expected
     * 1
     * */
    //@Test
    public void test3() {
        assertEquals(1, minAreaRect(new int[][]{
                {3, 2},
                {0, 0},
                {3, 3},
                {3, 4},
                {4, 4},
                {2, 1},
                {4, 3},
                {1, 0},
                {4, 1},
                {0, 2}
        }));
    }

    public int minAreaRect(int[][] points) {
        ArrayList<int[]> arrayPoints = new ArrayList<>();
        for (int[] point : points) {
            arrayPoints.add(point);
        }
        ArrayList<int[]> parallelXAxis = findParallelPoints(arrayPoints, true);
        if (parallelXAxis==null) {
            return 0;
        }
        ArrayList<int[]> validPoints = findParallelPoints(parallelXAxis, false);
        if (validPoints==null) {
            return 0;
        }
        return getArea(validPoints);
    }

    public int getArea(ArrayList<int[]> points) {
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for (int[] point : points) {
            if(!x.contains(point[0])) {
                x.add(point[0]);
            }
            if(!y.contains(point[1])) {
                y.add(point[1]);
            }
        }
        return Math.abs(x.get(0)-x.get(1)) * Math.abs(y.get(0)-y.get(1));
    }

    public void getMinRect() {

    }

    public ArrayList<int[]> findParallelPoints(ArrayList<int[]> points, boolean axisX) {
        int axis = 0;
        if (!axisX) {
            axis = 1;
        }
        ArrayList<int[]> closerPoints = new ArrayList<>();
        for (int i=0; i<points.size()-1; i++) {
            for (int j=i+1; j<points.size(); j++) {
                if (points.get(i)[axis]==points.get(j)[axis]) {
                    if (!closerPoints.contains(points.get(i))) {
                        closerPoints.add(points.get(i));
                    }
                    if (!closerPoints.contains(points.get(j))) {
                        closerPoints.add(points.get(j));
                    }
                }
            }
        }
        if (closerPoints.size()<4) {
            return null;
        }

        return closerPoints;
        /*
        int minDiff = 40000;
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> closestP = new ArrayList<>();
        for (int i=0; i<closerPoints.size(); i++) {
            p.add(points.get(i)[axis]);
        }
        for (int i=0; i<p.size()-1; i++) {
            for (int j=i; j<p.size(); j++) {
                int p1 = p.get(i);
                int p2 = p.get(j);
                int diff = p1-p2;
                if (diff!=0 && diff<minDiff) {
                    closestP.clear();
                    closestP.add(p1);
                    closestP.add(p2);
                }
            }
        }

        ArrayList<int[]> closestPoints = new ArrayList<>();
        int p1 = closestP.get(0);
        int p2 = closestP.get(1);
        for (int[] closerPoint : closerPoints) {
            if (closerPoint[axis]==p1 || closerPoint[axis]==p2) {
                closestPoints.add(closerPoint);
            }
        }

        return closestPoints;
        */
    }

    public boolean isRect() {
        return false;
    }
}