package silver;

import java.util.ArrayList;
import java.util.Scanner;

public class n_1198 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 다각형의 점의 수 입력
        int n = scanner.nextInt();

        // 다각형의 각 점 좌표 입력
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points.add(new Point(x, y));
        }

        // 최대 넓이를 가진 삼각형 찾기
        double maxArea = findMaxTriangleArea(points);

        // 결과 출력
        System.out.println(maxArea);

        scanner.close();
    }

    // 넓이 계산을 위한 메서드
    private static double calculateArea(Point p1, Point p2, Point p3) {
        return Math.abs((p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y)) / 2.0);
    }

    // 최대 넓이를 가진 삼각형 찾기
    private static double findMaxTriangleArea(ArrayList<Point> points) {
        int n = points.size();
        double maxArea = 0;

        // 모든 가능한 3점의 조합을 찾아 최대 넓이 계산
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    Point p1 = points.get(i);
                    Point p2 = points.get(j);
                    Point p3 = points.get(k);

                    double area = calculateArea(p1, p2, p3);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    // 좌표를 나타내기 위한 간단한 클래스
    private static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
