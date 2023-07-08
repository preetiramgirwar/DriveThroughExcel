Project Description:

   This project is created to automate all types of APIs(SOAP and REST) primarily using rest assured, ApachePOI, TestNG and JsonPath. The most important feature of this project is to execute the test cases as per the sequence mentioned in excel sheet.


Features of the project are : 

	1) This project is capable to automate execution and validation:
		> REST: POST, PUT, PATCH, DELETE and GET
		> SOAP: GET and POST
	2) User can also construct the request body using parameters fed from excelFile, I have created an utility using ApachePOI to read data from excel
	3) This project is built on concept of data driven and keyword driven.
	4) I have divided the project into four packages
			>> Request Repository
			>> Common API Methods : >>> API Methods
				              : >>> Common Utility Method
			>> Test Classes 
			>> Dynamic Driver 
	5) The test execution is driven by Dynamic Driver Class.
	6) The project is capable of saving the evidences of the execution into text files which contains details of request sent, endpoint and response received
