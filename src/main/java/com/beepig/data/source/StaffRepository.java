package com.beepig.data.source;

import com.beepig.data.model.Staff;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by beepi on 31/03/2017.
 */
@Transactional
public interface StaffRepository extends CrudRepository<Staff, Integer> {
    List<Staff> findByMPhone(String phone);

    List<Staff> findByMEmail(String email);

    Staff findByMUsernameAndMPassword(String username, String pass);
}
