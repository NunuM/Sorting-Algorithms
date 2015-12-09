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
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * VERY BASIC TESTS
 * @author nuno
 */
public class SortingAlgorithmsTest {
    
    ArrayList<String> arrayList;
    
    public SortingAlgorithmsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        arrayList = new ArrayList<>();

        arrayList.add("Zla");
        arrayList.add("Ala");
        arrayList.add("Gla");
        

        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertionSort method, of class SortingAlgorithms.
     */
    @Test
    public void testInsertionSort() {
        System.out.println("insertionSort");
        SortingAlgorithms.insertionSort(arrayList);
        assertTrue(arrayList.get(1).equalsIgnoreCase("Gla"));
        
    }

    /**
     * Test of bubbleSort method, of class SortingAlgorithms.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("bubbleSort");
        SortingAlgorithms.bubbleSort(arrayList);
        assertTrue(arrayList.get(1).equalsIgnoreCase("Gla"));
        
    }

    /**
     * Test of quickSort method, of class SortingAlgorithms.
     */
    @Test
    public void testQuickSort() {
        System.out.println("quickSort");
        SortingAlgorithms.quickSort(arrayList, 0, 2);
        assertTrue(arrayList.get(1).equalsIgnoreCase("Gla"));
        
    }

    /**
     * Test of mergeSort method, of class SortingAlgorithms.
     */
    @Test
    public void testMergeSort() {
        System.out.println("mergeSort");
        SortingAlgorithms.mergeSort(arrayList);
        assertTrue(arrayList.get(1).equalsIgnoreCase("Gla"));
        
    }

    
}
