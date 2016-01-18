/**
 * Created by Sam on 2016-01-08.
 */
public class Player {
    private String name="Sir Hame";
    private Race race = Race.NONE;
    private Prof prof = Prof.NONE;
    private int level   = 1;
    private int exp     = 0;
    private int nextLvl = level*level*100;
    private int health = 15;
    private int energy = 10;
    private int mana = 5;

    private int[] stats = {0,0,0,0,0};

    Player(String name, Race race, Prof prof){
        this.name = name;
        this.race = race;
        this.prof = prof;
        this.stats = Races.getRaceAtt(this.race, this.level);
    }

    public String getName(){return this.name;}
    public int getLevel(){return this.level;}
    public void setLevel(int level){this.level=level;}
    public int getExp(){return this.exp;}
    public void setExp(int exp){this.exp=exp;}
    public int getNextLvl(){return this.nextLvl;}
    public void setNextLvl(int nextLvl){this.nextLvl=nextLvl;}
    public Race getRace(){return this.race;}
    public void setRace(Race race){this.race=race;}
    public Prof getProf(){return this.prof;}
    public void setProf(Prof prof){this.prof=prof;}
    public int getStrAtt(){return this.stats[0];}
    public void setStrAtt(int strAtt){this.stats[0]=strAtt;}
    public int getDexAtt(){return this.stats[1];}
    public void setDexAtt(int dexAtt){this.stats[1]=dexAtt;}
    public int getIntAtt(){return this.stats[2];}
    public void setIntAtt(int intAtt){this.stats[2]=intAtt;}
    public int getEndAtt(){return this.stats[3];}
    public void setEndAtt(int endAtt){this.stats[3]=endAtt;}
    public int getWilAtt(){return this.stats[4];}
    public void setWilAtt(int wilAtt){this.stats[4]=wilAtt;}
}
