package mat.unical.provaLabINGSW;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.util.Arrays;

import org.joda.time.LocalTime;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class FunnyAlgorithmsTest {
	private static FunnyAlgorithms alg;
	
	@BeforeClass
	public static void prepareAll() {
		System.out.println("BeforeClass");
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
	
	@Test
	 public void swapTest() {
	     int[] nums = {10, 15};
	 
	     FunnyAlgorithms.swap(nums,0,1);
	 
	     assertEquals(15, nums[0]);
	     assertEquals(10, nums[1]);
	 }

	
	@Test
	public void selectionSortTest() {
		
	}
	
	@Test
	public void stringToIntConverterTest() {
		String number =" -3, 500, -10, 32767";
		assertEquals(Arrays.asList(-3,500,-10,32767),alg.stringToIntConverter(number));
		assertNotEquals(Arrays.asList("2 3","32768","A3","2.3"),alg.stringToIntConverter(number));
	}

	@After
	public static void After() {
		LocalTime fine = LocalTime.now();
		System.out.println("data e ora");
		System.out.println(fine);
	}

	
}


