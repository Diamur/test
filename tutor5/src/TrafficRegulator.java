interface Lights{

  int RED    = 0;

  int YELLOW = 1;

  int GREEN  = 2;

  int ERROR  = -1; 

} 

class Timer implements Lights{

  private int delay;

  private static int light = RED;

  Timer(int sec) {delay = 1000 * sec;}

  public int shift(){

    int count = (light++) % 3; 

    try{

      switch(count){

        case RED: Thread.sleep(delay); break; 

        case YELLOW: Thread.sleep(delay/3); break; 

        case GREEN: Thread.sleep(delay/2); break; 

      }

    }catch(Exception e){return ERROR;} 

    return count;

  }

}

class TrafficRegulator{

  private static Timer t = new Timer(1);

  public static void main(String[] args){

    for (int k = -0; k < 10; k++)

      switch(t.shift()){

      case Lights.RED:    System.out.println("Stop!"); break; 

      case Lights.YELLOW: System.out.println("Wait!"); break; 

      case Lights.GREEN:  System.out.println("Go!");   break; 

      case Lights.ERROR:  System.err.println("Time Error"); break; 

      default: System.err.println("Unknown light."); return;

    }

  }

}
