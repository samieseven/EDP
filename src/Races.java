/**
 * Created by Sam on 2016-01-08.
 */

/*
Types of races
 */
public class Races {
    static int[] getRaceAtt(Race race, int level) {
        int[] def = {1, 1, 1, 1, 1};
        int[] att = def;
        switch (race) {
            case NONE:
                att = def;
                break;
            case HUMAN:
                int[] humanAtt = {1, 1, 1, 1, 1};
                int[] humanMod = {3, 3, 3, 3, 3};
                for (int i = 0; i < 5; i++) {
                    att[i] = humanAtt[i] + humanMod[i] * level;
                }
                break;
            case ELF:
                int[] kroganAtt = {3, 0, 0, 2, 0};
                int[] kroganMod = {4, 2, 2, 5, 2};
                for (int i = 0; i < 5; i++) {
                    att[i] = kroganAtt[i] + kroganMod[i] * level;
                }
                break;
            case DWARF:
                int[] vulkanAtt = {0, 1, 3, 0, 1};
                int[] vulkanMod = {2, 3, 5, 2, 4};
                for (int i = 0; i < 5; i++) {
                    att[i] = vulkanAtt[i] + vulkanMod[i] * level;
                }
                break;
            case ORC:
                int[] racoonAtt = {0, 3, 2, 1, 0};
                int[] racoonMod = {2, 5, 4, 3, 2};
                for (int i = 0; i < 5; i++) {
                    att[i] = racoonAtt[i] + racoonMod[i] * level;
                }
                break;
        }
        return att;
    }
}
