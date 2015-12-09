/*
 * Copyright (C) 2015 nuno
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package sortingalgorithms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nuno
 */
public class SortingAlgorithms {

    public static <T extends Comparable> void insertionSort(List<T> list) {
        if (list.isEmpty()) {
            return;
        }

        for (int i = 1; i < list.size(); i++) {
            int j = i;
            T aux = list.get(i);

            while (j > 0 && aux.compareTo(list.get(j - 1)) > 0) {
                list.set(j, list.get(j - 1));
                j--;
            }
            list.set(j, aux);
        }

    }

    public static <T extends Comparable> void bubbleSort(List<T> list) {
        if (list.isEmpty()) {
            return;
        }

        int size = list.size();

        for (int i = 1; i < size; i++) {
            for (int j = (size - 1); j >= i; j--) {

                if (list.get(j - 1).compareTo(list.get(j)) < 0) {
                    T aux = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, aux);
                }

            }
        }

    }

    public static <T extends Comparable> void quickSort(List<T> list) {

    }

    public static <T extends Comparable> void mergeSort(List<T> list) {
        int size = list.size();

        if (size >= 2) {

            int middle = size / 2;

            List<T> leftList = new ArrayList<>();
            List<T> rigthList = new ArrayList<>();

            for (int i = 0; i < middle; i++) {
                T get = list.get(i);
                leftList.add(get);
            }

            for (int i = middle; i < size; i++) {
                T get = list.get(i);
                rigthList.add(get);
            }

            mergeSort(leftList);
            mergeSort(rigthList);

            merge(list, leftList, rigthList);
        }

    }

    private static <T extends Comparable> void merge(List<T> list, List<T> leftList, List<T> rigthList) {
        list.clear();

        while (!rigthList.isEmpty() && !leftList.isEmpty()) {
            if (rigthList.get(0).compareTo(leftList.get(0)) > 0) {
                list.add(leftList.get(0));
                leftList.remove(0);
            } else {
                T get = rigthList.get(0);
                list.add(get);
                rigthList.remove(0);
            }
        }

        while (!leftList.isEmpty()) {
            list.add(leftList.get(0));
            leftList.remove(0);
        }

        while (!rigthList.isEmpty()) {
            list.add(rigthList.get(0));
            rigthList.remove(0);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Zla");
        arrayList.add("Ala");
        arrayList.add("Dla");
        arrayList.add("Zla");
        arrayList.add("Rla");
        arrayList.add("Dla");
        arrayList.add("Zla");
        arrayList.add("Yla");
        arrayList.add("Dla");

        System.out.println(arrayList);

        //SortingAlgorithms.insertionSort(arrayList);
        SortingAlgorithms.mergeSort(arrayList);
        System.out.println(arrayList);

    }

}
