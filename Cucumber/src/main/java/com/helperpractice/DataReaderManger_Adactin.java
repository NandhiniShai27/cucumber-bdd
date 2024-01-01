package com.helperpractice;
import java.io.IOException;
public class DataReaderManger_Adactin {
	

		static DataReaderManger_Adactin drm;
		
		DataReader_adactininfoproperties  dr;
		
		private void DataReaderManager() {
			

		}
		
		public static DataReaderManger_Adactin InstanceofDRM() {
	    
	//onetypeofmethod//		DataReaderManger_Adactin drm = new DataReaderManger_Adactin();
//	        return drm;
			if (drm==null) { 
				drm = new DataReaderManger_Adactin();
			}
			return drm;
			
		}
		
		public DataReader_adactininfoproperties InstanceofDR() throws IOException {
			if(dr==null) {
			dr = new DataReader_adactininfoproperties();
			}
			return dr;
		}
	    	
}
