package com.beepig.data.source.service.staff;

import com.beepig.data.model.Staff;
import com.beepig.data.source.DataSourceService;
import com.beepig.data.source.service.staff.StaffServiceImp.DataResponse;

import java.util.List;

/**
 * Created by beepi on 01/04/2017.
 */
public interface StaffService extends DataSourceService<Staff> {
    DataResponse findOne(Staff staff);

    List<DataResponse> findAll(Iterable<Staff> models);

    List<DataResponse> findByPhone(String phone);

    List<DataResponse> findByEmail(String email);

    DataResponse findByUsernameAndPassword(String username, String pass);
}
