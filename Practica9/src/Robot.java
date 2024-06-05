/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laort
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Robot {
    private int[][] grid;
    private int rows;
    private int cols;
    private Set<Pair<Integer, Integer>> visited;

    public Robot(int[][] grid) {
        this.grid = grid;
        this.rows = grid.length;
        this.cols = grid[0].length;
        this.visited = new HashSet<>();
    }

    private boolean is_valid_move(int r, int c) {
        return r >= 0 && r < rows && c >= 0 && c < cols && grid[r][c] != 1;
    }

    private boolean dfs(int r, int c, List<Pair<Integer, Integer>> path) {
        if (!is_valid_move(r, c) || visited.contains(new Pair<>(r, c))) {
            return false;
        }

        visited.add(new Pair<>(r, c));
        if (r == rows - 1 && c == cols - 1) {
            return true;
        }

        if (dfs(r + 1, c, path) || dfs(r, c + 1, path)) {
            path.add(new Pair<>(r, c));
            return true;
        }

        return false;
    }

    public List<Pair<Integer, Integer>> find_path() {
        List<Pair<Integer, Integer>> path = new ArrayList<>();
        if (dfs(0, 0, path)) {
            path.add(new Pair<>(rows - 1, cols - 1));
            return path;
        }
        return null;
    }

    // Clase auxiliar para representar una posición en la cuadrícula
    public static class Pair<T, U> {
        public final T first;
        public final U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            int[][] grid = {
                {0, 0, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0},
                {0, 1, 0, 0}
            };

            Robot robot = new Robot(grid);
            List<Robot.Pair<Integer, Integer>> path = robot.find_path();

            if (path != null) {
                System.out.println("Ruta encontrada:");
                for (Robot.Pair<Integer, Integer> p : path) {
                    System.out.printf("(%d, %d)\n", p.first, p.second);
                }
                } else {
                System.out.println("No se encontró una ruta válida.");
                }
        }
    }

}

