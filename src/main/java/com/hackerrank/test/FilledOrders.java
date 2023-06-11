package com.hackerrank.test;

import java.util.*;

public class FilledOrders {

    /*
     * Complete the 'filledOrders' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY order
     *  2. INTEGER k
     */

    public static int filledOrders(List<Integer> orders, int available) {
        int orderSize = orders.size();
        int index = 0;
        boolean orderFilled = false;
        int noOfOrdersNeeded = 0;
        int previousQty = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        // Write your code here
        while (orderSize >= index && !orderFilled) {
            int sum = 0;
            int noOfOrders = 0;
            List<Integer> orderList = new ArrayList<>();
            for (int x = index; x < orders.size(); x++) {
                sum += orders.get(x);
                if (sum == available) {
                    orderFilled = true;
                    noOfOrdersNeeded = ++noOfOrders;
                    break;
                }
                if (sum < available) {
                    orderList.add(orders.get(x));
                    noOfOrders++;
                } else {
                    break;
                }
            }
            map.put(sum, orderList);
            if (!orderFilled) {
                if ((available - sum) < previousQty) {
                    noOfOrdersNeeded = noOfOrders;
                }
                previousQty = sum;
                index++;
            }
        }
        int gap =0 ;
        for (Map.Entry<Integer, List<Integer>> entry:map.entrySet()) {
            gap = (available - entry.getKey()) ;


        }

        return noOfOrdersNeeded;
    }

    public static void main(String[] args) {
        System.out.println(filledOrders(Arrays.asList(21, 24), 100));
    }
}
