package com.helperorangehrm;

import java.io.IOException;

public class DataReaderManager_OrangeHRM {
	// double ton design patttern //private constructor  --->
		//static method   ---> creating object for DataReaderManager
		//normal method   --->creating object for DataReader
//Step 1      private constructor
	static DataReaderManager_OrangeHRM drm;
	DataReader_OrangeHRM dr;
 private DataReaderManager_OrangeHRM() {
	 
 }
//Step 2 static method
//public static  DataReaderManager_OrangeHRM getinstanceDRM() {
//	DataReaderManager_OrangeHRM drm = new DataReaderManager_OrangeHRM();
//	return drm;
//
//}
//Step3 normal method
//public DataReader_OrangeHRM getinstanceDR() throws IOException {
//	DataReader_OrangeHRM dr= new DataReader_OrangeHRM();
//	return dr;
//
//}  its having high memory wastage
 public static  DataReaderManager_OrangeHRM getinstanceDRM() {
	 if (drm==null) {
		  drm = new DataReaderManager_OrangeHRM();
			}
	 return drm;
 }
 public DataReader_OrangeHRM getinstanceDR() throws IOException {
    if (dr==null) {
    	dr= new DataReader_OrangeHRM();
	}
		return dr;
	}    
	
	
 


}

