package module3.HW1;

public class Sword <T extends Metal>{
    private T material;
    public Sword(T material){
        this.material = material;
    }

    public boolean checkEndurance(){
        return material.getEndurance() > 49;
    }
}
