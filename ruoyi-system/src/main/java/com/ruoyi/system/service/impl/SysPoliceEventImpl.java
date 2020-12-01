package com.ruoyi.system.service.impl;

import java.util.Date;
import java.util.List;

import com.ruoyi.system.service.ISysPoliceEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.domain.SysPoliceEvent;
import com.ruoyi.system.mapper.SysPoliceEventMapper;

public class SysPoliceEventImpl implements ISysPoliceEventService {
    @Autowired
    private SysPoliceEventMapper policeEventMapper;

    @Override
    public void insertPolice(SysPoliceEvent policeEvent)
    {
        policeEventMapper.insertPolice(policeEvent);
    }

    @Override
    public List<SysPoliceEvent> selectPoliceAll() {
        return policeEventMapper.selectPoliceAll();
    }

    @Override
    public List<SysPoliceEvent> selectPoliceByKeys(String itemEvent, String company, String writeTime) {
        return policeEventMapper.selectPoliceByKeys(itemEvent,company,writeTime );
    }
    @Override
    public int updateEvent(SysPoliceEvent policeEvent) {
        return policeEventMapper.updateEvent(policeEvent);
    }
    @Override
    public SysPoliceEvent selectByDeptId(Long deptId) {
        return policeEventMapper.selectByDeptId(deptId);
    }
}
