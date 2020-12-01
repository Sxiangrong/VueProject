package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysPoliceEvent;

import java.util.Date;
import java.util.List;

public interface ISysPoliceEventService {
    /**
     * 添加事件记录
     *
     * @param police 事件对象
     */
    public void insertPolice(SysPoliceEvent police);
    /**
     * 查询全部事件记录
     *
     */
    public List<SysPoliceEvent> selectPoliceAll();
    /**
     * 根据条件筛选查询全部事件记录
     *
     * @param itemEvent 事件类型
     * @param company 申请单位
     * @param writeTime 申请时间
     */
    public List<SysPoliceEvent> selectPoliceByKeys(String itemEvent, String company, String writeTime);
    /**
     * 更新请求
     *
     * @param policeEvent
     */
    public int updateEvent(SysPoliceEvent policeEvent);
    /**
     * 根据user_id查询记录
     *
     * @param deptId
     */
    public SysPoliceEvent selectByDeptId(Long deptId);
}
