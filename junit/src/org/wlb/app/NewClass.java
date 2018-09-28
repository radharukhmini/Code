package org.wlb.app;

import org.mockito.InjectMocks;
import org.mockito.Mock;

public class NewClass 

{

	Add a;
	
	public NewClass(Add a) {
		super();
		this.a = a;
	}
	
  public int operation(int i,int j) {
	return i*a.add(i, j);
	  
  }
}
