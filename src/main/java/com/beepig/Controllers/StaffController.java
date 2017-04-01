package com.beepig.controllers;

import com.beepig.data.model.Staff;
import com.beepig.data.source.service.staff.StaffService;
import com.beepig.data.source.service.staff.StaffServiceImp.DataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by beepi on 01/04/2017.
 */
@RestController
public class StaffController {
    @Autowired
    private StaffService mService;

    //***********************GET**************************//

    @RequestMapping(value = "/staff/get/{id}", method = RequestMethod.GET)
    DataResponse findOne(@PathVariable("id") Integer id) {
        return mService.findOne(mService.findOne(id));
    }

    @RequestMapping(value = "/staff/get", method = RequestMethod.GET)
    List<DataResponse> findAll() {
        return mService.findAll(mService.findAll());
    }

    /**
     * find data by phone
     *
     * @param phone
     * @return
     */
    @RequestMapping(value = "/staff/get/phone", method = RequestMethod.GET)
    List<DataResponse> findByPhone(@RequestParam("phone") String phone) {
        return mService.findByPhone(phone);
    }

    /**
     * find data by email
     *
     * @param email
     * @return
     */
    @RequestMapping(value = "/staff/get/email", method = RequestMethod.GET)
    List<DataResponse> findByEmail(@RequestParam("email") String email) {
        return mService.findByEmail(email);
    }
    //***********************UPDATE***********************//

    @RequestMapping(value = "/staff/update", method = RequestMethod.PUT)
    int update(@RequestBody @Valid Staff model) {
        return mService.update(model);
    }

    //***********************POST**************************//
    @RequestMapping(value = "/staff/create", method = RequestMethod.POST)
    int save(@RequestBody @Valid Staff staff) {
        return mService.save(staff);
    }

    //************************DELETE************************//
    @RequestMapping(value = "/staff/delete/{id}", method = RequestMethod.DELETE)
    void deleteOne(@PathVariable("id") Integer id) {
        mService.deleteOne(id);
    }

    @RequestMapping(value = "/staff/delete", method = RequestMethod.DELETE)
    void deleteAll() {
        mService.deleteAll();
    }
}
