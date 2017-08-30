
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Top ten by points: ");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("Top 25 by penalties: ");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("Statistics of Sidney Crosby: "); 
        NHLStatistics.sortByGoals();
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        
        System.out.println("Statistics for Philadelphia Flyers: ");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("The players of Anaheim Ducks: ");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
                
        
        
      

        
    }
}
