class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int x = 0, y = 0;
        for (String i : commands) {
            if (i.equals("UP")) {
                x--;
            } else if (i.equals("DOWN")) {
                x++;
            } else if (i.equals("LEFT")) {
                y--;
            } else if (i.equals("RIGHT")) {
                y++;
            }
        }
        return x * n + y;
    }
}
