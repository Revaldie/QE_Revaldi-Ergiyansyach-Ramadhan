package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class arraymerge {
    public static void main(String[] args) {
        String[] array1 = {"Kazuya", "jin", "lee"};
        String[] array2 = {"Kazuya", "feng"};
        mergeUniqueValues(array1, array2);
    }

    public static void mergeUniqueValues(String[] arr1, String[] arr2) {
        Set noDuplicateSet = new HashSet();
        noDuplicateSet.addAll(Arrays.asList(arr1));
        noDuplicateSet.addAll(Arrays.asList(arr2));

        String[] noDuplicateArray = new String[noDuplicateSet.size()];
        noDuplicateSet.toArray(noDuplicateArray);

        Object[] str3 = noDuplicateSet.toArray();
        System.out.println(Arrays.toString(str3));



    }
}
