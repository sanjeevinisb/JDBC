package com.xworkz.enrollment.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.enrollment.constants.ConnectionEnum;
import com.xworkz.enrollment.dto.EnrollmentDTO;

public class EnrollmentRepoImpl implements EnrollmentRepository {

    @Override
    public boolean save(EnrollmentDTO enrollmentDTO) {
        boolean valid = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(), ConnectionEnum.PASSWORD.getValue());
             PreparedStatement prst = connection.prepareStatement("INSERT INTO enrollment_table (id, name, email, address, phoneNumber) VALUES (?, ?, ?, ?, ?)")) {
            
            prst.setInt(1, enrollmentDTO.getId());
            prst.setString(2, enrollmentDTO.getName());
            prst.setString(3, enrollmentDTO.getEmail());
            prst.setString(4, enrollmentDTO.getAddress());
            prst.setString(5, enrollmentDTO.getPhoneNumber());

            int value = prst.executeUpdate();
            if (value > 0) {
                System.out.println("Data is saved");
                valid = true;
            } else {
                valid = false;
                System.err.println("Data is not saved");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return valid;
    }
}
