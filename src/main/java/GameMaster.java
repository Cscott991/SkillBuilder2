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
        GameMaster.gainExperience(500);
        GameMaster.applyPowerUp(100);
        GameMaster.applyPowerUp(2.5);
        System.out.print(GameMaster.getTeamXP());
    }
}



