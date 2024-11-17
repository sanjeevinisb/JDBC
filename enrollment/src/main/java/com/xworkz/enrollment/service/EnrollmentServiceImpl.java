package com.xworkz.enrollment.service;

import com.xworkz.enrollment.dto.EnrollmentDTO;
import com.xworkz.enrollment.repository.EnrollmentRepoImpl;

public class EnrollmentServiceImpl implements EnrollmentService {

    @Override
    public boolean save(EnrollmentDTO enrollmentDTO) {
        boolean isValid = true;
        System.out.println(enrollmentDTO.getId());
        System.out.println(enrollmentDTO.getName());
        System.out.println(enrollmentDTO.getEmail());
        System.out.println(enrollmentDTO.getAddress());
        System.out.println(enrollmentDTO.getPhoneNumber());

        if (isValid) {
            EnrollmentRepoImpl repo = new EnrollmentRepoImpl();
            boolean change = repo.save(enrollmentDTO);
            return change;
        }

        return false;
    }
}
