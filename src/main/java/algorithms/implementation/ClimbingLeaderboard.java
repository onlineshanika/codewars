package algorithms.implementation;

import java.util.*;
import java.util.stream.Collectors;

public class ClimbingLeaderboard {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboardOld(List<Integer> ranked, List<Integer> player) {
        List<Integer> climbingLeaderboard = new LinkedList<>();
        List<Integer> listWithoutDuplicates = null;
        for (int score : player) {
            boolean isContains = ranked.contains(score);
            ranked.add(score);
            listWithoutDuplicates = new ArrayList<>(new LinkedHashSet<>(ranked));
            Collections.sort(listWithoutDuplicates, Collections.reverseOrder());
            int index = listWithoutDuplicates.indexOf(score);
            climbingLeaderboard.add(index + 1);
            if (!isContains) {
                ranked.remove(Integer.valueOf(score));
            }
        }
        return climbingLeaderboard;
    }

//    private static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
//        List<Integer> climbingLeaderboard = new ArrayList<>();
//        ranked = ranked.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//        Collections.sort(player, Collections.reverseOrder());
//        int index = 0;
//        int previouslyAddValue = -1;
//        for (int score : player) {
//
//            boolean isContains = ranked.contains(score);
//            if(isContains){
//                previouslyAddValue = score ;
//                climbingLeaderboard.add( ranked.indexOf(score)+1);
//                System.out.println( ranked.indexOf(score)+1 +" ----isContains----  "+score);
//            }else { }
//            index = previouslyAddValue == -1 ? 0 : ranked.indexOf(previouslyAddValue) + 1;
//            System.out.println("index : " + index);
//            for (int i = index; i < ranked.size(); i++) {
//
//                if (ranked.get(i) >= score) {
//                    previouslyAddValue = score;
//                    climbingLeaderboard.add(i);
//                    System.out.println(ranked.get(i) + " ----else----  " + score);
//                    break;
//                }
//            }
//
//            for (int i = index; i < ranked.size(); i++) {
//                index ++ ;
//                if (ranked.get(i) >= score) {
//                    climbingLeaderboard.add(i);
//                    break;
//                }
//            }
//
//        }
//        climbingLeaderboard.sort(Collections.reverseOrder());
//        return climbingLeaderboard;
//    }

    public static void main(String[] list) {
        List<Integer> ranked = new ArrayList<Integer>(Arrays.asList(100, 90, 90, 80, 75, 60));
        List<Integer> player = new ArrayList<Integer>(Arrays.asList(50, 65, 77, 90, 102));
        List<Integer> climbingLeaderboard = climbingLeaderboard(ranked, player);
        System.out.println(" ");
        for (Integer integer : climbingLeaderboard) {
            System.out.println(integer);
        }
    }

    // 6, 4, 2, 1
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> climbingLeaderboard = new ArrayList<>();
        player.sort(Collections.reverseOrder());
        int index = 0;
        int position = 0;
        int prevRank = -1;
        for (Integer playerValue : player) {

            while (index < ranked.size()) {
                int rank = ranked.get(index);
                prevRank = index == 0 ? -1 : ranked.get(index - 1);
                index++;
                if (playerValue >= rank) {
                    climbingLeaderboard.add(position);
                    break;
                }
            }

        }
        climbingLeaderboard.sort(Collections.reverseOrder());
        return climbingLeaderboard;
    }

//    private static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
//        List<Integer> climbingLeaderboard = new LinkedList<>();
//        List<Integer> listWithoutDuplicates = null;
//        for (int score : player) {
//            boolean isContains = ranked.contains(score);
//            ranked.add(score);
//            listWithoutDuplicates = new ArrayList<>();
//            Set<Integer> set = new HashSet<>();
//            for (int i = 0; i < ranked.size(); i++) {
//                int score1 = ranked.get(i);
//                if (!set.contains(score1)) {
//                    set.add(score1);
//                }
//            }
//            listWithoutDuplicates.addAll(set);
//// Sort in descending order using bubble sort
//            int n = listWithoutDuplicates.size();
//            boolean swapped;
//            do {
//                swapped = false;
//                for (int i = 1; i < n; i++) {
//                    if (listWithoutDuplicates.get(i - 1) < listWithoutDuplicates.get(i)) {
//                        int temp = listWithoutDuplicates.get(i - 1);
//                        listWithoutDuplicates.set(i - 1, listWithoutDuplicates.get(i));
//                        listWithoutDuplicates.set(i, temp);
//                        swapped = true;
//                    }
//                }
//                n--;
//            } while (swapped);
//
//            int index = listWithoutDuplicates.indexOf(score);
//            climbingLeaderboard.add(index + 1);
//            if (!isContains) {
//                ranked.remove(Integer.valueOf(score));
//            }
//        }
//        return climbingLeaderboard;
//    }
}

// 6         5         4         2         1
