package codewars;

public class DeadAnts {
    public static int deadAntCount(final String ants) {
        if(ants != null) {
            String ant = ants.replaceAll("ant", "");
            System.out.println(ant);
            int count = 0;
            for(char c : ant.toCharArray()) {
                if(c == 'a')
                    count++;
            }
            return count;
        }
        return 0;
    }

    public static void main(String[] args) {
        String ants = "...ant...ant..nat.ant.t..ant...ant..ant..ant.anant..t";

        System.out.println(deadAntCount("ant ant .... a nt"));
    }
}
