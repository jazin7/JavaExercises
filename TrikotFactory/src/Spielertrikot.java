public class Spielertrikot implements Trikot{
    private String front;
    private String back;
    private String color1;
    private String color2;


    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }


    @Override
    public void drucke() {
        System.out.println(front);
        System.out.println(back);
    }
}
