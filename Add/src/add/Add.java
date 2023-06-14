/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package add;

/**
 *
 * @author lanaa
 */
public class Add {

    public int x;
    public int y;
    
    public void setx(int x)
    {
        this.x=x;
    }
    public void sety(int y)
    {
        this.y=y;
    }
    public int getx()
    {
        return x;
    }
    public int gety()
    {
        return y;
    }
    public int sum()
    {
        return x+y;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Add obj=new Add();
        obj.setx(15);
        obj.sety(35);
        obj.getx();
        obj.gety();

        System.out.println(obj.sum());
    }
    
}
