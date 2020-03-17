package PA04;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        var r = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new Resident("R" + i) )
                .toArray(Resident[]::new);

        var h = IntStream.rangeClosed(0, 2)
                .mapToObj(i -> new Hospital("H" + i) )
                .toArray(Hospital[]::new);

        h[0].setCapacity(1);
        h[1].setCapacity(2);
        h[2].setCapacity(2);

        List<Resident> residentList = new ArrayList<>();

        for (Resident res : r) {
            residentList.add(res);
        }

        Collections.sort(residentList);

        Set<Hospital> hospitalSet = new TreeSet<>();

        for (Hospital hos : h) {
            hospitalSet.add(hos);
        }

        Map<Resident, List<Hospital>> resPrefMap = new HashMap<>();
        resPrefMap.put(r[0], Arrays.asList(h[0], h[1], h[2]));
        resPrefMap.put(r[1], Arrays.asList(h[0], h[1],h[2]));
        resPrefMap.put(r[2], Arrays.asList(h[0], h[1]));
        resPrefMap.put(r[3], Arrays.asList(h[0],h[2]));

        Map<Hospital, List<Resident>> hosPrefMap = new TreeMap<>();

        hosPrefMap.put(h[0], Arrays.asList(r[3], r[0], r[1], r[2]));
        hosPrefMap.put(h[1], Arrays.asList(r[0], r[2], r[1]));
        hosPrefMap.put(h[2], Arrays.asList(r[0], r[1], r[3]));

        h[0].setCapacity(1);
        h[1].setCapacity(2);
        h[2].setCapacity(2);

        residentList.stream()
                .filter(res -> resPrefMap.get(res).contains(h[0]))
                .forEach(System.out::println);



    }
}
