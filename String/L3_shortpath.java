package String;

public class L3_shortpath {
    public static float shortestPath(String direction){
        int x = 0;
        int y = 0;
        for(int i=0; i<direction.length(); i++){
            char dir = direction.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N') {
                y++;
            }
            else if(dir =='W'){
                x--;
            }
            else{
                x++;
            }
        }
        return(float) Math.sqrt((x*x) +(y*y));

    }

    public static void main(String args[]){
        String direction = "WNEENESENNN";
        System.out.println(shortestPath(direction));


    }
}
