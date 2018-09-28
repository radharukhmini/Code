import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.wlb.app.Add;
import org.wlb.app.NewClass;

public class TestRadha {

	@Mock
	Add ad;
	
	@InjectMocks
	NewClass ne;
	@Test
	public void testsep() {
		
		when(if(ad.add(2, 3))==5).thenReturn(5);
		assertEquals(8, ne.operation(2, 3));
	}

}
