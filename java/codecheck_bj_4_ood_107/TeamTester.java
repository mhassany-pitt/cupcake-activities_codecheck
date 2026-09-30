public class TeamTester
{
   public static void main(String[] args)
   {
      Team aTeam = new Team();
      aTeam.addPlayer(new Player("Fred","Left wing"));
      aTeam.addPlayer(new Player("Carl","Right wing"));
      aTeam.addPlayer(new Player("Louie","Center"));
      aTeam.addPlayer(new Player("Max","Defense"));
      aTeam.addPlayer(new Player("Jason","Defense"));
      aTeam.addPlayer(new Player("Alphonse","Goalie"));
      aTeam.addPlayer(new Player("Juliet","Coach")); // shouldn't be added

      System.out.println(aTeam.listTeam());
      System.out.println("Expected: [Fred-Left wing, Carl-Right wing, "
         + "Louie-Center, Max-Defense, Jason-Defense, Alphonse-Goalie]");
   }
}
