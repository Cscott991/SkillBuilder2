public class GameMaster {
    private static int totalExperiencePoints;
    public static void gainExperience(int xp){
        totalExperiencePoints += xp;
    }
    //getter method
    public static int getTeamXP(){
        return totalExperiencePoints;
    }
    //method
    public static void applyPowerUp(int xp){
        totalExperiencePoints += xp;
    }
    //method
    public static void applyPowerUp(double multiplier){
        totalExperiencePoints = (int)(totalExperiencePoints * multiplier);
    }
    //method
    public static void resetGame(){
        totalExperiencePoints = 0;
    }

    public static void main(String[] args){
        GameMaster quest = new GameMaster();
        quest.gainExperience(500);
        quest.applyPowerUp(100);
        quest.applyPowerUp(2.5);
    }
}



