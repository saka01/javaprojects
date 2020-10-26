public class Microwave{
  private int time = 0;
  private int level = 1;
  private String status;


public String levelName(int putlevel){
    if(putlevel == 1){
      return "Low";

    }else if(putlevel == 2){
      return "Medium";

    }else{
      return "High";
    }
}

  public void start(){
    System.out.println("Cooking for " + time + " seconds at " + levelName(level) + " level. " );
  }

  public void addtime(){
    time = time + 30;
    System.out.println("adding 30 seconds...\n");
    System.out.println("Cooking for " + time + " seconds at " + levelName(level) + " level. " );
  }

  public void changepower(){
    level = level+1;
    System.out.println("Increasing level...\n");
    System.out.println("Cooking for " + time + " seconds at " + levelName(level) + " level. " );
  }

  public void reset(){
    level = 1;
    time = 0;
    System.out.println("Cooking for " + time + " seconds at " + levelName(level) + " level. " );
  }

  public void stop(){
    System.out.println("Cooking stopped..." );
  }

}
