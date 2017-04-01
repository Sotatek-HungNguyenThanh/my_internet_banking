package com.beepig.data.source.service.staff;

import com.beepig.data.model.Staff;
import com.beepig.data.source.StaffRepository;
import com.fasterxml.jackson.annotation.JsonSetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.beepig.util.Constant.*;

/**
 * Created by beepi on 01/04/2017.
 */
@Service
public class StaffServiceImp implements StaffService {
    @Autowired
    private StaffRepository mRepository;

    @Override
    public int save(Staff model) {
        if (model == null) return -1;
        model.getPhone().replaceAll("\\s+", "");
        model.getIdentification().replaceAll("\\s+", "");
        return mRepository.save(model) == null ? -1 : CREATED_RESPONSE;
    }

    @Override
    public Staff findOne(Integer id) {
        if (id < 0) return null;
        return mRepository.findOne(id);
    }

    @Override
    public Iterable<Staff> findAll() {
        return mRepository.findAll();
    }

    @Override
    public void deleteOne(Integer id) {
        mRepository.delete(id);
    }

    @Override
    public void deleteAll() {
        mRepository.deleteAll();
    }

    @Override
    public int update(Staff model) {
        return mRepository.save(model) == null ? NOT_ACCEPT_RESPONSE : SUCCESSFULL_RESPONSE;
    }

    @Override
    public DataResponse findOne(Staff staff) {
        if (staff == null) return null;
        return new DataResponse(staff.getId(), staff.getName(), staff.getUsername(), staff.getIdentification(), staff.getAddress(),
                staff.getPhone(), staff.getEmail());
    }

    @Override
    public List<DataResponse> findAll(Iterable<Staff> models) {
        if (models == null) return null;
        List<Staff> staffs = new ArrayList<>();
        Iterator<Staff> iterator = models.iterator();
        iterator.forEachRemaining(staffs::add);
        return createDataResponse(staffs);
    }

    @Override
    public List<DataResponse> findByPhone(String phone) {
        return phone == null ? null : createDataResponse(mRepository.
                findByMPhone(phone.replaceAll("\\s+", "")));
    }

    @Override
    public List<DataResponse> findByEmail(String email) {
        return email == null ? null : createDataResponse(mRepository.findByMEmail(email));
    }

    @Override
    public DataResponse findByUsernameAndPassword(String username, String pass) {
        return createDataResponse(mRepository.findByMUsernameAndMPassword(username, pass));
    }

    private List<DataResponse> createDataResponse(List<Staff> staffs) {
        if (staffs == null) return null;
        List<DataResponse> dataResponses = new ArrayList<>();
        for (Staff staff : staffs) {
            dataResponses.add(new DataResponse(staff.getId(), staff.getName(), staff.getUsername(),
                    staff.getIdentification(), staff.getAddress(), staff.getPhone(), staff.getEmail()));
        }
        return dataResponses;
    }

    private DataResponse createDataResponse(Staff staff) {
        if (staff == null) return null;
        return new DataResponse(staff.getId(), staff.getName(), staff.getUsername(),
                staff.getIdentification(), staff.getAddress(), staff.getPhone(), staff.getEmail());
    }

    public class DataResponse {
        private Integer mId;
        private String mName;
        private String mUsername;
        private String mIdentification;
        private String mAddress;
        private String mPhone;
        private String mEmail;

        public DataResponse(Integer id, String name, String username, String identification,
                            String address, String phone, String email) {
            mId = id;
            mName = name;
            mUsername = username;
            mIdentification = identification;
            mAddress = address;
            mPhone = phone;
            mEmail = email;
        }

        public Integer getId() {
            return mId;
        }

        @JsonSetter("id")
        public void setId(Integer id) {
            mId = id;
        }

        public String getName() {
            return mName;
        }

        @JsonSetter("name")
        public void setName(String name) {
            mName = name;
        }

        public String getUsername() {
            return mUsername;
        }

        @JsonSetter("username")
        public void setUsername(String username) {
            mUsername = username;
        }

        public String getIdentification() {
            return mIdentification;
        }

        @JsonSetter("identification")
        public void setIdentification(String identification) {
            mIdentification = identification;
        }

        public String getAddress() {
            return mAddress;
        }

        @JsonSetter("address")
        public void setAddress(String address) {
            mAddress = address;
        }

        public String getPhone() {
            return mPhone;
        }

        @JsonSetter("phone")
        public void setPhone(String phone) {
            mPhone = phone;
        }

        public String getEmail() {
            return mEmail;
        }

        @JsonSetter("email")
        public void setEmail(String email) {
            mEmail = email;
        }
    }
}
