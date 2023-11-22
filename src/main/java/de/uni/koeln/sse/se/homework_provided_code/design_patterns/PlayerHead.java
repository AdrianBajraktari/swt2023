package de.uni.koeln.sse.se.homework_provided_code.design_patterns;

public class PlayerHead implements PlayerComponent {
    private float rx, ry, rz;
    private float x, y, z;

    public PlayerHead() {

    }

    public void add(PlayerComponent comp) {

    }
    public void remove(PlayerComponent comp) {

    }
    public void move(float x, float y, float z) {
        this.x += x;
        this.y += y;
        this.z += z;
    }
    public void rotate(float rx, float ry, float rz) {
        this.rx += rx;
        this.ry += ry;
        this.rz += rz;

        this.rx %= 360;
        this.ry %= 360;
        this.rz %= 360;
    }
}
