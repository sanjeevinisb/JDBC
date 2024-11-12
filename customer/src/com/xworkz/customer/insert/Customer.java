package com.xworkz.customer.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer {

	public static void main(String[] args) {
		
		String insertQuery = "insert into customer_table values (1,'Sanjeevini','sanjeevini@gmail.com','7795876788','Sanjeevini@123','Rajajinagar','2025-01-01','F','Admin','True','2001-10-19'),"
		+"(2, 'Sneha', 'sneha@gmail.com', '9908765643', 'sneha@123', 'Mahalakshmi','2025-03-02', 'F', 'Customer','False', '2002-12-22'),"
		+"(3,'Bharati','bharati@gmail.com','8088567321','bharati@123','Kalyannagar','2025-06-03', 'F', 'User','True', '2002-12-11'),"
		+"(4,'Nikhita','nikhita@gmail.com','9907456324','nikhita@123','Kamalanagar','2025-05-04', 'F', 'Admin','False', '2002-05-12'),"
		+"(5,'Poorna','poorna@gmail.com','7676890342','poorna@123','Banashankari','2025-10-05', 'F', 'Customer','True', '2002-09-06'),"     
		+"(6,'Aarati','aarati@gmail.com','9903787962','aarati@123','BTM Layout','2025-12-06', 'F', 'User','False', '2002-11-23'),"
		+"(7,'Padma','padma@gmail.com','7798645321','padma@123','RR nagar','2025-11-07', 'F', 'Admin','True', '2002-08-14'),"
		+"(8,'Nitali','nitali@gmail.com','7895432101','nitali@123','Nirmalnagar','2025-02-08', 'F', 'Customer','False', '2002-01-24'),"
		+"(9,'Kiran','kiran@gmail.com','8097645322','kiran@123','Shrinagar','2025-10-09', 'M', 'Customer','False', '2002-09-18'),"
		+"(10,'Ananya','ananya@gmail.com','9902575643','ananya@123','Lakshmipura','2025-09-10', 'F', 'Admin','True', '2002-07-28'),"
		+" (11,'Tanaya','tanaya@gmail.com','9483996314','tanaya@123','Jalhalli','2025-08-11', 'F', 'Customer','True', '2002-09-08'),"
		+"(12,'Rama','rama@gmail.com','9905231456','rama@123','Kormangal','2025-12-12', 'F', 'User','False', '2002-09-15'),"
		+"(13,'Kriti','kriti@gmail.com','9904621733','kriti@123','Chikkbidarkallu','2025-11-02', 'F', 'Customer','True', '2002-07-17'),"
		+"(14,'Swapna','swapna@gmail.com','8804673214','swapna@123','Doddballapur','2025-05-24', 'F', 'Admin','False', '2002-03-12'),"
		+"(15,'Krishav','krishav@gmail.com','9904783255','krishav@123','Shrirampura','2025-01-09', 'M', 'Admin','False', '2002-02-10'),"
		+"(16,'Ashwini','ashwini@gmail.com','7411113452','ashwini@123','Jayanagar','2025-08-11', 'F', 'Customer','True', '2002-10-19'),"
		+"(17,'Sindhu','sindhu@gmail.com','9006743278','sindhu@123','Devinagar','2025-03-22', 'F', 'User','False', '2002-10-04'),"
		+"(18,'Keertana','keertana@gmail.com','9036728712','keertana@123','Omnagar','2025-04-19', 'F', 'User','False', '2002-11-24'),"
		+"(19,'Ankit','ankit@gmail.com','7704562389','ankita@123','Ramnagar','2025-11-12', 'M', 'Customer','True', '2002-07-22'),"
		+"(20,'Mitali','mitali@gmail.com','9483665218','mitali@123','Krishnanagar','2025-12-11', 'F', 'Admin','True', '2002-09-09')";


	}
		public String getInsertQuery() {
	
			return insertQuery;
		}
}