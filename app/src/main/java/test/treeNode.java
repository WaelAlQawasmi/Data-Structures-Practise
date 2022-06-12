package test;

public class treeNode {
int value;
treeNode RIGHT;
    treeNode LEFT;

    public treeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public treeNode getRIGHT() {
        return RIGHT;
    }

    public void setRIGHT(treeNode RIGHT) {
        this.RIGHT = RIGHT;
    }

    public treeNode getLEFT() {
        return LEFT;
    }

    public void setLEFT(treeNode LEFT) {
        this.LEFT = LEFT;
    }
}
