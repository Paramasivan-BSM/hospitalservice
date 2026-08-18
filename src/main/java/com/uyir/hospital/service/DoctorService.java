package com.uyir.hospital.service;

import com.uyir.hospital.dto.DoctorRequest;
import com.uyir.hospital.dto.DoctorResponse;
import com.uyir.hospital.dto.PageResponse;
import com.uyir.hospital.model.enums.DoctorCategory;
import com.uyir.hospital.model.enums.EngagementType;
import org.springframework.data.domain.Pageable;

public interface DoctorService {

    DoctorResponse create(DoctorRequest request);

    DoctorResponse getById(String id);

    PageResponse<DoctorResponse> search(
            String specialty,
            String hospitalId,
            EngagementType engagementType,
            DoctorCategory doctorCategory,
            Boolean active,
            Pageable pageable);

    DoctorResponse update(String id, DoctorRequest request);

    void deactivate(String id);

    DoctorResponse activate(String id);

    DoctorResponse checkIn(String id, String hospitalId);

    DoctorResponse checkOut(String id);
}
