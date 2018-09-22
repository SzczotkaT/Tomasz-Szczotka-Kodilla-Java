package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStore {
    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> filmsTitlesWithTranslations = new HashMap<>();
        filmsTitlesWithTranslations.put("IM", ironManTranslations);
        filmsTitlesWithTranslations.put("AV", avengersTranslations);
        filmsTitlesWithTranslations.put("FL", flashTranslations);

        return filmsTitlesWithTranslations;
    }

    public static void main(String[] args){
        MovieStore movieStore = new MovieStore();
        String theresultOfJoining = movieStore.getMovies().entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .map(String::toString)
                .collect(Collectors.joining(" ! ", " ! ", "\n"));

        System.out.println(theresultOfJoining);
}
}
