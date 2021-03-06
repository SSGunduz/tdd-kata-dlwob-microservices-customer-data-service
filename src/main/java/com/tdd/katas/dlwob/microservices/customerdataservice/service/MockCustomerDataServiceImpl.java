package com.tdd.katas.dlwob.microservices.customerdataservice.service;


import com.tdd.katas.dlwob.microservices.customerdataservice.model.CustomerData;
import org.springframework.stereotype.Service;

/**
 * Created by Hexad GmbH on 23/05/2017.
 */
@Service
public class MockCustomerDataServiceImpl extends AbstractMockServiceImpl<CustomerData> implements CustomerDataService {

    public MockCustomerDataServiceImpl() {
        super(CustomerData.class);
    }

    @Override
    public CustomerData getCustomerData(String s) {
        if(dtoObject.getId().equals(s))
            return dtoObject;
        else
            return null;
    }


}
