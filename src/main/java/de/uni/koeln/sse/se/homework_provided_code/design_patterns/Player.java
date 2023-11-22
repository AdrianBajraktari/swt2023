package de.uni.koeln.sse.se.homework_provided_code.design_patterns;

import java.util.ArrayList;
import java.util.List;

public class Player implements PlayerComponent {
    private List<PlayerComponent> parts = new ArrayList<>();
    private float rx, ry, rz;
    private float x, y, z;

    public Player() {
        this.parts.add(new PlayerBody());
        this.parts.add(new PlayerHead());
    }

    public void add(PlayerComponent comp) {
        this.parts.add(comp);
    }
    public void remove(PlayerComponent comp) {
        this.parts.remove(comp);
    }
    public void move(float x, float y, float z) {
        for(PlayerComponent part: this.parts) {
            part.move(x, y, z);
        }

        this.x += x;
        this.y += y;
        this.z += z;
    }
    public void rotate(float rx, float ry, float rz) {
        for(PlayerComponent part: this.parts) {
            part.rotate(rx, ry, rz);
        }

        this.rx += rx;
        this.ry += ry;
        this.rz += rz;

        this.rx %= 360;
        this.ry %= 360;
        this.rz %= 360;
    }
}
