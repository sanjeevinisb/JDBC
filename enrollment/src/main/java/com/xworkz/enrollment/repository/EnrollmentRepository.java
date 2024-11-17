package com.xworkz.enrollment.repository;

import com.xworkz.enrollment.dto.EnrollmentDTO;

public interface EnrollmentRepository {
    boolean save(EnrollmentDTO enrollmentDTO);
}
