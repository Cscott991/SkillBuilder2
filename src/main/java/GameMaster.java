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
        gainExperience(500);
        applyPowerUp(100);
        applyPowerUp(2.5);
        System.out.print(getTeamXP());
    }
}



