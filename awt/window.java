//     -->        --->
// user  interface   software
//     <--        <---
//         ||
//     cui     gui
//             swing, awt, javarx

import java.awt.*;

// class myFrame extends Frame
// {

//     myFrame(String s, int i, int j)
//     {
//        super(s);
//        setSize(i,j);
//        setVisible(true);
//     }
//     public static  void  main(String args[]) {
//         new myFrame("ayush",400,400);
//         new myFrame("ayush2",200,200);
//     }
// }   

class myFrame{
    Frame f;
    myFrame(String s){
        f = new Frame(s);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main (String s[]){
        new myFrame("i love you");
        Frame f = new Frame("I hate you");
        f.setSize(200,200);
        f.setVisible(true);
    }
}