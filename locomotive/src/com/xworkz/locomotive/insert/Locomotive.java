package com.xworkz.locomotive.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Locomotive {
	public static void main(String[] args) {

		String insertQuery = "insert into locomotive_table values (1,'Sanjeevini','sanjeevini@gmail.com','7795876788','Sanjeevini@123','Rajajinagar',1786,'10','Banglore','Dharwad','Booked','Paid'),"
				+ "(2, 'Sneha', 'sneha@gmail.com', '9908765643', 'sneha@123', 'Mahalakshmi',2111, '11', 'Vijaypur','Davangere','Canclled', 'Pending'),"
				+ "(3,'Bharati','bharati@gmail.com','8088567321','bharati@123','Kalyannagar',3212, '12', 'Dharwad','Bijapur', 'Confirmed','Unpaid'),"
				+ "(4,'Nikhita','nikhita@gmail.com','9907456324','nikhita@123','Kamalanagar',6755, '13', 'Hubli','Banglore','Booked', 'Pending'),"
				+ "(5,'Poorna','poorna@gmail.com','7676890342','poorna@123','Banashankari',1008, '14', 'Bagalkot','Delhi','Canclled', 'Paid'),"
				+ "(6,'Aarati','aarati@gmail.com','9903787962','aarati@123','BTM Layout',2789, '15', 'Chennai','Hyderabad','Confirmed', 'Unpaid'),"
				+ "(7,'Padma','padma@gmail.com','7798645321','padma@123','RR nagar',9769, '16', 'Delhi','Chennai', 'Confirmed','Paid'),"
				+ "(8,'Nitali','nitali@gmail.com','7895432101','nitali@123','Nirmalnagar',3452, '17', 'Gulbarga','Bidar','Booked', 'Pending'),"
				+ "(9,'Kiran','kiran@gmail.com','8097645322','kiran@123','Shrinagar',9008, '18', 'Bidar','Karjgi','Canclled', 'Unpaid'),"
				+ "(10,'Ananya','ananya@gmail.com','9902575643','ananya@123','Lakshmipura',4567, '19', 'Hyderabad','Tumkur','Booked', 'Paid'),"
				+ " (11,'Tanaya','tanaya@gmail.com','9483996314','tanaya@123','Jalhalli',3756, '20', 'Shimoga','Koppal', 'Canclled','Pending'),"
				+ "(12,'Rama','rama@gmail.com','9905231456','rama@123','Kormangal',9087, '21', 'Hassan','Hubli','Booked', 'Paid'),"
				+ "(13,'Kriti','kriti@gmail.com','9904621733','kriti@123','Chikkbidarkallu',5463, '22', 'Pune','Goa', 'Canclled','Unpaid'),"
				+ "(14,'Swapna','swapna@gmail.com','8804673214','swapna@123','Doddballapur',9076, '23', 'Mumbai','Tirupati','Confirmed', 'Pending'),"
				+ "(15,'Krishav','krishav@gmail.com','9904783255','krishav@123','Shrirampura',7604, '34', 'Surat','Madhyapradesh','Canclled', 'Unpaid'),"
				+ "(16,'Ashwini','ashwini@gmail.com','7411113452','ashwini@123','Jayanagar',1133, '56', 'Haveri','KSR','Canclled', 'Paid'),"
				+ "(17,'Sindhu','sindhu@gmail.com','9006743278','sindhu@123','Devinagar',1423, '99', 'Savanur','Manglore','Canclled', 'Unpaid'),"
				+ "(18,'Keertana','keertana@gmail.com','9036728712','keertana@123','Omnagar',1924, '09', 'Sollapur','Mumbai','Confirmed', 'Paid'),"
				+ "(19,'Ankit','ankit@gmail.com','7704562389','ankita@123','Ramnagar',1910, '92', 'Raichur','Chikmangalore','Booked', 'Pending'),"
				+ "(20,'Mitali','mitali@gmail.com','9483665218','mitali@123','Krishnanagar',2411, '44', 'KSR','Kundgol','Confirmed', 'Unpaid')";

	}
}