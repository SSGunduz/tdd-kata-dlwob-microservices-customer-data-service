package com.tdd.katas.dlwob.microservices.customerdataservice.service;


import com.tdd.katas.dlwob.microservices.customerdataservice.model.CustomerData;

/**
 * Created by Hexad GmbH on 24/05/2017.
 */
public interface CustomerDataService {
    CustomerData getCustomerData(String s);
}
