package mat.unical.provaLabINGSW;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.joda.time.LocalTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class FunnyAlgorithmsTest {
	private static FunnyAlgorithms alg;
	
	@BeforeClass
	public static void prepareAll() {
		alg= new FunnyAlgorithms();
	}
	@Before
	public void Inizio() {
		LocalTime inizio = LocalTime.now();
		System.out.println("data e ora");
		System.out.println(inizio);
	}

	//dovrebbe ritornare true se lo ha trovato in una qualsiasi posizione
	 @Test
	 public void binarySearchTest1() {
	       int[] sorted = new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 };
	 
	        for (int i = 0; i < sorted.length; i++) {
	            assertEquals(true, alg.binarySearch(sorted,sorted[i]));
	        }
	    }
	 //should Return False If Not FoundIn Sorted Array()
	 @Test
	 public void binarySearchTest2() {
		 
	 }
	
	@Test
	public static void swapTest(int[] arr, int i, int j) {}
	
	@Test
	public void selectionSortTest(int[] array, int order) {}
	
	@Test
	public void stringToIntConverterTest(String number) {
		assertEquals(Arrays.asList(-3,500,-10,32767),alg.stringToIntConverter(number));
		assertNotEquals(Arrays.asList("2 3","32768","A3","2.3"),alg.stringToIntConverter(number));
	}

	@After
	public static void After() {
		LocalTime fine = LocalTime.now();
		System.out.println("data e ora");
		System.out.println(fine);
	}
	@AfterClass
	public static void AfterClass() {

	}
	
}


